package controller;

import data.Coffee;
import data.Capuccino;
import data.Mocacсino;
import data.RafCoffee;
import service.CoffeeBuilder;
import service.CapuccinoBuilder;
import service.MocaccinoBuilder;
import service.Raf;

public class CoffeeController {
    CoffeeBuilder coffeeBuilder;
    public Coffee getCoffee() {
        coffeeBuilder = new CoffeeBuilder();
        coffeeBuilder.boilingWater();
        coffeeBuilder.setWater("Наливаем в чашку 250 мл воды.");
        coffeeBuilder.setSugar("Добавляем чайную ложку сахара.");
        coffeeBuilder.setTypeOfCoffee("Добавляем чайную ложку растворимого кофе.");
        return coffeeBuilder.builtCoffee();
    }

    public Capuccino getMilkCoffee() {
        coffeeBuilder = new CapuccinoBuilder();
        ((CapuccinoBuilder)coffeeBuilder).setMilk("Добавляем 50 мл молока.");
        return ((CapuccinoBuilder)coffeeBuilder).builtMilkCoffee();
    }

    public RafCoffee getRaffCoffee() {
        coffeeBuilder = new Raf();
        ((Raf)coffeeBuilder).setSyrup("Добавляем чайную ложку сиропа.");
        ((Raf)coffeeBuilder).setCream("Добавляем чайную ложку теплых сливок");
        return ((Raf)coffeeBuilder).builtRafCoffee();
    }

    public Mocacсino getMocaccino() {
        coffeeBuilder = new MocaccinoBuilder();
        ((MocaccinoBuilder)coffeeBuilder).setChocolate("Добавляем столовую ложку горячего шоколада.");
        ((MocaccinoBuilder)coffeeBuilder).setCinnamon("Посыпаем корицей.");
        return ((MocaccinoBuilder)coffeeBuilder).builtMocaccino();
    }
}