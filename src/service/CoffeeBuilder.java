package service;

import data.Coffee;

public class CoffeeBuilder {


    private String water;

    private String sugar;

    private String typeOfCoffee;

    public void setWater(String water) {
        this.water = water;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void setTypeOfCoffee(String typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }

    public void boilingWater() {
        System.out.println("Вода вскипела.");
    }

    public Coffee builtCoffee() {
        return new Coffee(water, sugar, typeOfCoffee);
    }
}