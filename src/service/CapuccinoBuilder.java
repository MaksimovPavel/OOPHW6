package service;

import data.Capuccino;

public class CapuccinoBuilder extends CoffeeBuilder {

    private String milk;

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public Capuccino builtMilkCoffee() {
        System.out.println("Добавили молоко.");
        return new Capuccino(builtCoffee(), milk);
    }
}