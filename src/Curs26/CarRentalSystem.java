package Curs26;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class CarRentalSystem {

    private static Scanner sc = new Scanner(System.in);

    private HashMap<String, String> rentedCars =
            new HashMap<String, String>(100, 0.5f);

    private HashMap<String, RentedCars> rentedCarsByOwner =
            new HashMap<String, RentedCars>(100, 0.5f);

    private static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        return sc.nextLine();
    }

    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        return sc.nextLine();
    }

     // search for a key in hashtable
    private boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo.toUpperCase());
    }

    // get the value associated to a key
    private String getCarRent(String plateNo) {
        if (rentedCars.get(plateNo) == null){
            return  "Autovehiculul " + plateNo + " nu este inchiriat.";
        }
        return rentedCars.get(plateNo.toUpperCase());
    }

    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        if(isCarRent(plateNo)){
            System.out.println("Autoturismul a fost inchiriat!");
            return;
        }
        rentedCars.put(plateNo.toUpperCase(), ownerName);
    }

    // remove an existing (key, value) pair
    private void returnCar(String plateNo) {
        if(isCarRent(plateNo)){
            rentedCars.remove(plateNo);
            System.out.println("Autoturismul " + plateNo + " a fost sters cu succes.");
        }else{
            System.out.println("Autoturismul " + plateNo + " nu este inchiriat.");
        }

    }

    private int getCarRented(){
        return rentedCars.size();
    }

    private int getCarsNo(String ownerName) {
        if (rentedCarsByOwner.containsKey(ownerName)) {
            return rentedCarsByOwner.get(ownerName).getCarsNo();
        }
        return 0;
    }

    private List<String> getCarsList(String ownerName) {
        if (rentedCarsByOwner.containsKey(ownerName)) {
            List<String> cars = rentedCarsByOwner.get(ownerName).getPlatesNo();
            for(String car : cars) {
                System.out.println(car);
            }
            return cars;
        }
        System.out.println("The owner has no rented cars.");
        return null;
    }


    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;
        while(!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch(command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    rentCar(getPlateNo(), getOwnerName());
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());
                    break;
                case "getOwner":
                    System.out.println(getCarRent(getPlateNo()));
                    break;
                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
            }
        }
    }

    public static void main(String[] args) {

        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}


