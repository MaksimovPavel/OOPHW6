package data;

public class Coffee {

    private String water;

    private String sugar;

    private String coffee;

    public Coffee(String water, String sugar, String coffee) {
        this.water = water;
        this.sugar = sugar;
        this.coffee = coffee;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "Вкусный кофе!";
    }
}