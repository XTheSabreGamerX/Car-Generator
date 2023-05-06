/*Juan Carlos T. Matias
IT201A*/
public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car(2014, Model._Model.SUV, Color._Color.RED);
        Car car2 = new Car(2020, Model._Model.HATCHBACK, Color._Color.GREEN);       // Three new objects, with each their own values that is then given
        Car car3 = new Car(2015, Model._Model.CONVERTIBLE, Color._Color.BLACK);     // to the Car constructor in the Car class.

    System.out.println("1st Car: ");    // Displays the values of the 1st Car
        car1.display();
        System.out.println();

    System.out.println("2nd Car: ");    // Displays the values of the 2nd Car
        car2.display(); 
        System.out.println();

    System.out.println("3rd Car: ");    // Displays the values of the 3rd Car
        car3.display();
        System.out.println();
    }
}
