package service;


import data.Mocacсino;

public class MocaccinoBuilder extends CoffeeBuilder {

    private String chocolate;

    private String cinnamon;

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void setCinnamon(String cinnamon) {
        this.cinnamon = cinnamon;
    }

    public Mocacсino builtMocaccino() {
        System.out.println("Добавили шоколад и корицу.");
        return new Mocacсino(builtCoffee(), chocolate, cinnamon);
    }
}
