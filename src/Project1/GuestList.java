package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {
    private int noMaxGuest;
    private ArrayList<Guest> guestsList = new ArrayList<Guest>();
    private ArrayList<Guest> pendingGuest = new ArrayList<Guest>();

    Scanner sc = new Scanner(System.in);

    public GuestList(int noMaxGuest) {
        this.noMaxGuest = noMaxGuest;
    }

    public int add(Guest newGuest){
        if (searchByName(newGuest.getFirstName(), newGuest.getLastName()) != null ||
                searchByEmail(newGuest.getEmail()) != null || searchByPhone(newGuest.getPhoneNumber()) != null) {
            return -1;
        }
        if(guestsList.size() < noMaxGuest){
            guestsList.add(newGuest);
            System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
            return 0;
        }else{
            pendingGuest.add(newGuest);
            System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <X>. " +
                    "Te vom notifica daca un loc devine disponibil.");
            return pendingGuest.size();
        }
    }

    public Guest searchPerson () {
        System.out.println("Alege modalitatea de verificare:\n"
                + "1 - Nume si prenume\n"
                + "2 - Email\n"
                + "3 - Numar de telefon");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Introduceti numele de familie");
                String lastName = sc.next();
                System.out.println("Introduceti prenumele");
                String firstName = sc.next();
                if (searchByName(firstName, lastName) != null) {
                    for (int i = 0; i < guestsList.size(); i++) {
                        if (guestsList.get(i).equals(searchByName(firstName, lastName))) {
                            System.out.println("Persoana este inscrisa la eveniment");
                        }else{
                            System.out.println("Persoana nu este inscrisa la eveniment");
                        }
                    }
                    for (int j = 0; j < pendingGuest.size(); j++) {
                        if (pendingGuest.get(j).equals(searchByName(firstName, lastName))) {
                            System.out.println("Persoana se afla pe lisa de asteptare");
                        }else{
                        System.out.println("Persoana nu se afla pe lisa de asteptare");
                    }
                    }
                }
                return searchByName(firstName, lastName);
            case 2:
                System.out.println("Introduceti emailul:");
                String email = sc.next();
                if (searchByEmail(email) != null) {
                    for (int i = 0; i < guestsList.size(); i++) {
                        if (guestsList.get(i).equals(searchByEmail(email))) {
                            System.out.println("Persoana este inscrisa la eveniment");
                        }else{
                            System.out.println("Persoana nu este inscrisa la eveniment");
                        }
                    }
                    for (int j = 0; j < pendingGuest.size(); j++) {
                        if (pendingGuest.get(j).equals(searchByEmail(email)))  {
                            System.out.println("Persoana se afla pe lisa de asteptare");
                        }else {
                            System.out.println("Persoana nu se afla pe lisa de asteptare");
                        }
                    }
                }
                return searchByEmail(email);
            case 3:
                System.out.println("Introduceti numarul de telefon..");
                String phone = sc.next();
                if (searchByEmail(phone) != null) {
                    for (int i = 0; i < guestsList.size(); i++) {
                        if (guestsList.get(i).equals(searchByPhone(phone))) {
                            System.out.println("Persoana este inscrisa la eveniment");
                        }else{
                            System.out.println("Persoana nu este inscrisa la eveniment");
                        }
                    }
                    for (int j = 0; j < pendingGuest.size(); j++) {
                        if (pendingGuest.get(j).equals(searchByPhone(phone)))  {
                            System.out.println("Persoana se afla pe lisa de asteptare");
                        }{
                            System.out.println("Persoana nu se afla pe lisa de asteptare");
                        }
                    }
                }
                return searchByPhone(phone);
            default:
                System.out.println("Numarul introdus este invalid");
                return null;
        }
    }

    public boolean removeGuest (Guest removeGuest){
        if (removeGuest == null){
            return  false;
        }
        if ((searchByName(removeGuest.getFirstName(), removeGuest.getLastName()) != null)||
                (searchByEmail(removeGuest.getEmail()) != null) || (searchByPhone(removeGuest.getPhoneNumber()) != null)) {
            for (int i = 0; i < guestsList.size(); i++) {
                if (guestsList.get(i).equals(removeGuest)) {
                    guestsList.remove(i);
                    System.out.println("Persoana a fost sterasa cu succes.");
                    if (pendingGuest.size() > 0) {
                        guestsList.add(pendingGuest.get(0));
                        System.out.println(pendingGuest.get(0).getFirstName()+pendingGuest.get(0).getFirstName() +
                                "Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
                        pendingGuest.remove(0);
                    }
                    return true;
                }
            }
            for (int j = 0; j < pendingGuest.size(); j++) {
                if (pendingGuest.get(j).equals(removeGuest)) {
                    pendingGuest.remove(j);
                    return true;
                }
            }
        }
        System.out.println("eroare - persoana nu era inscrisa");
        return false;
    }


    public boolean updateGuest (){
       Guest guestToUpdate = searchPerson();
           if (guestToUpdate == null){
               System.out.println("Persoana nu a fost inscrisa ");
               return false;
           }
        System.out.println("Alege campul pentru actualizare:\n" +
                         "1 - Nume\n"+
                         "2 - Prenume\n"+
                         "3- Email \n"+
                         "4- Numar de telefon");
           int numeber = sc.nextInt();
           switch (numeber){
               case 1:
                   System.out.println("Introduceti numele de familie:");
                   String nume = sc.next();
                   guestToUpdate.setLastName(nume);
                   return true;
               case 2:
                   System.out.println("Introduceti prenumele:");
                   String prenume = sc.next();
                   guestToUpdate.setFirstName(prenume);
                   return true;
               case 3:
                   System.out.println("Introduceti adresa de email:");
                   String email = sc.next();
                   guestToUpdate.setEmail(email);
                   return true;
               case 4:
                   System.out.println("Introduceti numarul de telefon:");
                   String phone = sc.next();
                   guestToUpdate.setPhoneNumber(phone);
                   return true;
               default:
                   System.out.println("Optiune invalida.");
                   return false;
           }

    }


    public void getGuestsList() {
        for (int i = 0; i<guestsList.size(); i++){
            System.out.println(guestsList.get(i).toString());
        }
    }

    public void getPendingGuest(){
        for (int i = 0; i<pendingGuest.size(); i++){
            System.out.println(pendingGuest.get(i).toString());
        }
    }

    public int availableNoGuest(){
        if (noMaxGuest == guestsList.size()){
            return 0;
        }
       return (noMaxGuest - guestsList.size());
    }

    public int noOfParticipants(){
        return guestsList.size();
    }

    public int noOfParticipantsPendingList(){
        return pendingGuest.size();
    }

    public int totalParticipants(){
        return guestsList.size()+pendingGuest.size();
    }

    public void search (String characterSearch){
        characterSearch = characterSearch.toLowerCase();
        int isOnList = 1;
        for(int i = 0; i< guestsList.size(); i++){
            if(guestsList.get(i).getEmail().toLowerCase().contains(characterSearch)){
                System.out.println("Contact "+ isOnList+ ": contine email = " + guestsList.get(i).getEmail());
                isOnList++;
            }else if(guestsList.get(i).getFirstName().toLowerCase().contains(characterSearch)){
                System.out.println("Contact "+ isOnList+ ": contine prenumele = " + guestsList.get(i).getFirstName());
                isOnList++;
            }else if(guestsList.get(i).getLastName().toLowerCase().contains(characterSearch)){
                System.out.println("Contact "+ isOnList+ ": contine numele = " + guestsList.get(i).getLastName());
                isOnList++;
            }else if(guestsList.get(i).getPhoneNumber().toLowerCase().contains(characterSearch)){
                System.out.println("Contact "+ isOnList+ ": contine numarul de telefon = " + guestsList.get(i).getPhoneNumber());
                isOnList++;
            }
        }
    }

    public void commandsDisplay(){
        System.out.println("Alegeti o optiune: ");
        System.out.println("help         - Afiseaza aceasta lista de comenzi\n"
                + "add          - Adauga o noua persoana (inscriere) \n"
                + "check        - Verifica daca o persoana este inscrisa la eveniment \n"
                + "remove       - Sterge o persoana existenta din lista \n"
                + "update       - Actualizeaza detaliile unei persoane \n"
                + "guests       - Lista de persoane care participa la eveniment\n"
                + "waitlist     - Persoanele din lista de asteptare \n"
                + "available    - Numarul de locuri libere \n"
                + "guests_no    - Numarul de persoane care participa la eveniment \n"
                + "waitlist_no  - Numarul de persoane din lista de asteptare \n"
                + "subscribe_no - Numarul total de persoane inscrise \n"
                + "search       - Cauta toti invitatii conform sirului de caractere introdus \n"
                + "quit         - Inchide aplicatia");
    }

    public void quit(){
        System.out.println("Aplicatia a fost inchisa. Va multumim pentru participare! La revedere!");
    }

    private Guest searchByName (String firstName, String lastName){
        if (firstName == null){
            firstName = sc.next();
        }
        if (lastName == null){
            lastName = sc.next();
        }
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        for (int i = 0; i < guestsList.size(); i++) {
            if (guestsList.get(i).getLastName().toLowerCase().equals(lastName)
                    && guestsList.get(i).getFirstName().toLowerCase().equals(firstName)) {
                return guestsList.get(i);
            }
        }

        for (int i = 0; i < pendingGuest.size(); i++) {
            if (pendingGuest.get(i).getLastName().toLowerCase().equals(lastName)
                    && pendingGuest.get(i).getFirstName().toLowerCase().equals(firstName)) {
                return pendingGuest.get(i);
            }
        }

        return null;
    }


    private Guest searchByEmail (String email){
        if (email == null){
            email = sc.next();
        }

        for (int i = 0; i < guestsList.size(); i++) {
            if (guestsList.get(i).getEmail().toLowerCase().equals(email)) {
                return guestsList.get(i);
            }
        }
        for (int i = 0; i < pendingGuest.size(); i++) {
            if (pendingGuest.get(i).getEmail().toLowerCase().equals(email)) {
                return pendingGuest.get(i);
            }
        }
        return null;
    }

    private Guest searchByPhone (String phone){
        if(phone == null){
            phone =  sc.next();
        }
        for (int i = 0; i < guestsList.size(); i++) {
            if (guestsList.get(i).getPhoneNumber().equals(phone)) {
                return guestsList.get(i);
            }
        }
        for (int i = 0; i < pendingGuest.size(); i++) {
            if (pendingGuest.get(i).getPhoneNumber().equals(phone)) {
                return pendingGuest.get(i);
            }
        }
        return null;
    }

}
