package data;

public class Capuccino extends Coffee{
    public Capuccino(String water, String sugar, String coffee, String milk) {
        super(water, sugar, coffee);
    }

    public Capuccino(Coffee coffee, String milk) {
        super(coffee.getWater(), coffee.getSugar(), coffee.getCoffee());
    }

    @Override
    public String toString() {
        return "Вкусный молочный кофе!";
    }
}