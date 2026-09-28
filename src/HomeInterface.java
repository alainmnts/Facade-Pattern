package src;
public class HomeInterface { 
    private final HomeService light; 
    private final HomeService tv; 
    private final HomeService airConditioning; 

    public HomeInterface() { 
        this.light = new Light(); 
        this.tv = new TV(); 
        this.airConditioning = new AirConditioning(); 
    } 

    public void turnOnAll() { 
        System.out.println("--- Activating All Home Services ---"); 
        light.turnOn(); 
        tv.turnOn(); 
        airConditioning.turnOn(); 
    } 

    public void turnOffAll() { 
        System.out.println("--- Deactivating All Home Services ---"); 
        light.turnOff(); 
        tv.turnOff(); 
        airConditioning.turnOff(); 
    } 
}
