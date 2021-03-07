package Project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {

    private static Random randomNrGenerate = new Random();
    private int noOfCandies;
    private String typeOfCandies;
    private static ArrayList<String> candiesType = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));

    public Candies(int noOfCandies, String typeOfCandies) {
        this.noOfCandies = noOfCandies;
        this.typeOfCandies = typeOfCandies;
    }
    public static Candies generate() {
        return new Candies(Candies.randomNrGenerate.nextInt(50), Candies.candiesType.get(Candies.randomNrGenerate.nextInt(4)));
    }
    @Override
    public void enjoy() {
        System.out.println("You have received: " + this.noOfCandies+ this.typeOfCandies + "candies");
    }

    @Override
    public String toString() {
        return "Candies{" +
                "noOfCandies=" + noOfCandies +
                ", typeOfCandies='" + typeOfCandies + '\'' +
                '}';
    }
}
