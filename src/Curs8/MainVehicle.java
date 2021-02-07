package Curs8;

public class MainVehicle {
    public static void main(String[] args) {
        OnRoad car = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 4,2);
        Curs8.OnWater vessel = new Curs8.OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000.0);
        OnAir airPlan = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 4, 45);

        car.addFuel(1000.0);
        car.goTo(21.3,12.88);
        car.printInfo();

        vessel.addFuel(1500.0);
        vessel.goTo(11.8,4.33);
        vessel.printInfo();

        airPlan.addFuel(10000.0);
        airPlan.goTo(41.3,120.88);
        airPlan.printInfo();

        OnRoad car2 = new OnRoad("FDFL8KMFSDLKM634", 2, "Sporty2");
        car2.printInfo();

        Curs8.OnWater vessel2 = new Curs8.OnWater("F8GFDG86D87GGD121", 20, "Wavess2");
        vessel2.printInfo();

    }

}
