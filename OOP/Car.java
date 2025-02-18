package OOP;

public class Car {
    
    String name = "BMW";
    String model = "M5 e90";
    int year = 2005;
    double price = 120.000;
    boolean is_available = false;   // They are the atributes of Car class

    
    void start(){
        System.err.println("You have started the car");
    }

    void car_name(){
        System.err.println("Car model company " + name);     //They are methods of class 
    }

    void car_model()
    {
        System.err.println("Car model is " + model);
    }


    // this is the simple object of java 
}
