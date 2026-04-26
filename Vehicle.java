//Create a class named Vehicle.
class Vehicle {

//Declare two private variables
    private String brand;//private variable for brand
    private String color;//private variable for color
	
//Create a public constructor that initializes these variables
    public Vehicle(String b, String c) {
        this.brand = b;
        this.color = c;
    }
//Create a public method start()
    public void start() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
        System.out.println();//method to display
    }
}

//Create another class named IT_24037 containing the main() method.
public class IT_24037 {
    public static void main(String[] args) {
//Create another class named MainVehicle containing the main() method.
        if (args.length < 2 || args.length % 2 != 0) { //check arguments
            return;
        }

        for (int i = 0; i < args.length; i += 2) { //loop through commandline
            String brand = args[i];//Each pair of arguments represents brand and color
            String color = args[i + 1];
            
            Vehicle v = new Vehicle(brand, color);
            v.start();
        }
    }
}
