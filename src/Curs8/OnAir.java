package Curs8;

public class OnAir extends Curs8.Vehicle {

    private int noTurbines;
    private int hasFirstClass;

    public OnAir(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
        this.noTurbines = 2;
    }

    public OnAir(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
        this.noTurbines = 2;
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
        this(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines, int hasFirstClass) {
        this(serialNumber, noPersons, name, noTurbines);
        this.hasFirstClass = hasFirstClass;
    }
    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Flying the airplane to coordinates: [41.3, 120.88]");
        return true;
    }
    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding 3000.5 l of fuel to the airplane");
        return true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Airplane properties: ");
        System.out.println( "\t - number of turbines: " + noTurbines);
        if (hasFirstClass <=20) {
            System.out.println("\t - does not have first class");
        }else {
            System.out.println("\t - have first class");
        }
    }
}
