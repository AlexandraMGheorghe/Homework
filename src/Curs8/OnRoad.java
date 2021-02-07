package Curs8;

public class OnRoad extends Vehicle {
    private int noWheels;
    private int noDoors;

    public OnRoad(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
        this.noWheels = 4;
        this.noDoors = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
        this.noWheels = 4;
        this.noDoors = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
        this(serialNumber, noPersons, name);
        this.noWheels = noWheels;
    }

    public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors){
        this(serialNumber, noPersons, name,  noWheels);
        this.noDoors = noDoors;
    }

    @Override
    public boolean goTo (double positionX, double positionY){
        System.out.println("Driving the vehicle on road to coordinates: [21.3, 12.88]");
        return true;
    }

    @Override
    public boolean addFuel (double amount){
        System.out.println("Adding 28.12 l of fuel to the driving vehicle");
        return true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Driving vehicle properties: ");
        System.out.println( "\t - number of wheels: " + noWheels);
        System.out.println( "\t - number of doors: " + noDoors);
    }
}
