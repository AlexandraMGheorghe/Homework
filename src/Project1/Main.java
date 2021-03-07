package Project1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit. Introduceti numarul de locuri disponibile");
        int noOfPlace = sc.nextInt();
        GuestList persons = new GuestList(noOfPlace);
        Guest g1 = new Guest("Gheorghe", "Alexandra", "alexandra@yahoo.com", "07222220022");
        Guest g2 = new Guest("Mihai", "Adrian", "mihaia@yahoo.com", "0789213566");
        Guest g3 = new Guest("Cristina", "Badita", "badita@gmail.com", "072365879");
        persons.add(g1);
        persons.add(g2);
        persons.add(g3);
        if (noOfPlace == 0) {
            System.out.println("Evenimentul nu are participanti");
        } else {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            persons.commandsDisplay();
            String option = sc.next();
            option = option.toLowerCase();
            while (!option.equals("quit")) {
                switch (option) {
                    case "help": {
                        persons.commandsDisplay();
                        break;
                    }
                    case "add": {
                        System.out.println("Se adauga o noua persoana: ");
                        System.out.println("Introduceti numele de familie: ");
                        String lastName = sc.next();
                        System.out.println("Introduceti prenumele: ");
                        String firstName = sc.next();
                        System.out.println("Introduceti adresa de email: ");
                        String email = sc.next();
                        System.out.println("Introduceti numarul de telefon: ");
                        String phone = sc.next();
                        Guest newGuest = new Guest(lastName, firstName, email, phone);
                        persons.add(newGuest);
                        break;
                    }
                    case "check": {
                        persons.searchPerson();
                        break;
                    }
                    case "remove": {
                        System.out.println("Se sterge o persoana existenta din lista…");
                        Guest removeGuest = new Guest("", "", "", "");
                        removeGuest = persons.searchPerson();
                        persons.removeGuest(removeGuest);
                        break;
                    }
                    case "update": {
                        System.out.println("Actualizeaza detaliile unei persoane");
                        persons.updateGuest();
                        break;
                    }
                    case "guests": {
                        System.out.println("Lista de persoane care participa la eveniment: ");
                        persons.getGuestsList();
                        break;
                    }
                    case "waitlist": {
                        System.out.println("Persoanele din lista de asteptare: ");
                        persons.getPendingGuest();
                        break;
                    }
                    case "available": {
                        System.out.println("Numarul de locuri disponibile: ");
                        persons.availableNoGuest();
                        break;
                    }

                    case "guests_no": {
                        System.out.println("Numarul de persoane care participa la eveniment");
                        persons.noOfParticipants();
                        break;
                    }
                    case "waitlist_no": {
                        System.out.println("Numarul de persoane din lista de asteptare");
                        persons.noOfParticipantsPendingList();
                        break;
                    }
                    case "subscribe_no": {
                        System.out.println("Numarul total de persoane inscrise");
                        persons.totalParticipants();
                        break;
                    }
                    case "search": {
                        System.out.println("introduceti un sir de caractere");
                        String search = sc.next();
                        persons.search(search);
                        break;
                    }
                    case "quit": {
                        persons.quit();
                        break;
                    }
                    default:
                        System.out.println("Optiunea selectata nu este valida:");
                        persons.commandsDisplay();
                }
                System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                option = sc.next();
                option = option.toLowerCase();
            }
        }
    }
}
