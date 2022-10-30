package data;



public class Mocacсino extends Coffee {

    public Mocacсino(Coffee coffee, String chocolate, String cinnamon) {
        super(coffee.getWater(), coffee.getSugar(), coffee.getCoffee());
    }

    public void setChocolate(String chocolate) {
    }

    public void setCinnamon(String cinnamon) {
    }

    @Override
    public String toString() {
        return "Вкусный моккачино!";
    }
}