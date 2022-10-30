package data;

public class RafCoffee extends Coffee {

    public RafCoffee(Coffee coffee, String syrup, String cream) {
        super(coffee.getWater(), coffee.getSugar(), coffee.getCoffee());
    }

    public void setSyrup(String syrup) {
    }

    public void setCream(String cream) {
    }

    @Override
    public String toString() {
        return "Вкусный раф-кофе!";
    }
}
