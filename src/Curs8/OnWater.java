package Curs8;

public class OnWater extends Vehicle {
    private int noEngines;
    private double cargoCapacity;

    public OnWater(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
        this.noEngines = 2;
    }

    public OnWater(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
        this.noEngines = 2;
    }

    public OnWater(String serialNumber, int noPersons, String name, int noEngines) {
        this(serialNumber,noPersons, name);
        this.noEngines = noEngines;
    }
    public OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity) {
        this(serialNumber,noPersons, name, noEngines);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Sailing the vessel to coordinates: [11.8, 4.33]");
        return true;
    }
    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding 148.05 l of fuel to the vessel");
        return true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Vessel properties: ");
        System.out.println( "\t - number of engines: " + noEngines);
        System.out.println( "\t - cargo capacity: " + cargoCapacity);
    }
}