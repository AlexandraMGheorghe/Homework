package Project2;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {
    private static Random randomNrGenerate = new Random();
    private String message;

    public FortuneCookie(String message) {
        this.message = message;
    }

    public static FortuneCookie generate(){
        ArrayList<String>proverbe = new ArrayList<>();
        proverbe.add("Cine râde la urmă, râde mai bine.");
        proverbe.add("Răzbunarea e arma prostului.");
        proverbe.add("Ce poţi face singur cu mâna ta, nu aştepta de la alţii.");
        proverbe.add("Buturuga mică rastoarnă carul mare.");
        proverbe.add("Ziua bună se cunoaşte de dimineaţă.");
        proverbe.add("Vorba lungă, sărăcia omului.");
        proverbe.add("Ochii care nu se văd, se uită.");
        proverbe.add("Ce ţie nu-ţi place, altuia nu-i face.");
        proverbe.add("Mama proştilor e mereu gravidă.");
        proverbe.add("Unde dragoste nu e, nimic nu e.");
        proverbe.add("Apa trece, pietrele rămân.");
        proverbe.add("Cine astăzi fură un ou, mâine fură un bou.");
        proverbe.add("Cine aleargă după doi iepuri, nu prinde niciunul.");
        proverbe.add("Cine sapă groapa altuia, cade el în ea.");
        proverbe.add("Dacă minţi pe altul, te minţi pe tine !");
        proverbe.add("Orice naş îşi are naşul…chiar si papa are naş, se numeste papanaş !");
        proverbe.add( "Înţeleptul tace şi face. Mutul tace, dar le face.");
        proverbe.add("De ce îţi este frică, de aia nu scapi.");
        proverbe.add("Daca ai carte, ai parte.");
        proverbe.add("Cine se scoală de dimineață, departe ajunge.");

        return new FortuneCookie(proverbe.get(FortuneCookie.randomNrGenerate.nextInt(20)));
    }

    @Override
    public void enjoy() {
        System.out.println("Fortune Cookie with a message: " + this.message);
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "message='" + message + '\'' +
                '}';
    }
}
