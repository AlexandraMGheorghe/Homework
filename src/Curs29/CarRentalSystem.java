package Curs29;

import java.util.HashMap;
import java.util.List;
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
    private String getCarRent(String plateNo)  throws Exception {
        if (rentedCars.get(plateNo) != null) {
            return rentedCars.get(plateNo.toUpperCase());
        }else throw new Exception("Autovehiculul " + plateNo + " nu este inchiriat.");
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

    private void getCarsNo(String ownerName)  throws Exception {
        if (rentedCarsByOwner.containsKey(ownerName)) {
            System.out.println(rentedCarsByOwner.get(ownerName).getCarsNo());
        } else throw new Exception("Nu exista un proprietar cu acest nume");;
    }

    private void getCarsList(String ownerName) throws Exception {
        if (rentedCarsByOwner.containsKey(ownerName)) {
            System.out.println(rentedCarsByOwner.get(ownerName).getPlatesNo());

        } else throw new Exception("The owner has no rented cars.");

    }


    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() throws Exception {
        boolean quit = false;
        while (!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            try {
                String command = sc.nextLine();
                switch (command) {
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {

        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}


