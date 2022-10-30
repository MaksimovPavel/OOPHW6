import controller.CoffeeController;

public class Main {
    public static void main(String[] args) {

        CoffeeController controller = new CoffeeController();

        System.out.println(controller.getCoffee());
        System.out.println();
        System.out.println(controller.getMilkCoffee());
        System.out.println();
        System.out.println(controller.getRaffCoffee());
        System.out.println();
        System.out.println(controller.getMocaccino());
    }
}