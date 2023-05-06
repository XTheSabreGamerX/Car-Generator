/*Juan Carlos T. Matias
IT201A*/
public class Car {
 
    private int year;
    private Model._Model model;     //Variables to access enums
    private Color._Color color;

    public Car(int yr, Model._Model m, Color._Color c) {    // Constructor to give values to the variables
        year = yr;
        model = m;
        color = c;  
    }

    public void display() {     // Display method to display the three chosen car specs
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
    
    
}
