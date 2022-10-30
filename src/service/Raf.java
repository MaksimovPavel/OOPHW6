package service;

import data.RafCoffee;

public class Raf extends CoffeeBuilder {

    private String syrup;

    private String cream;

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    public RafCoffee builtRafCoffee() {
        System.out.println("Добавили сироп и теплые сливки");
        return new RafCoffee(builtCoffee(), syrup, cream);
    }
}