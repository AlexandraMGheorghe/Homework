package Project2;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
    private static Random randomSuprise = new Random();

    private GatherSurprises() {
    }
    public static ISurprise gather(){
        ISurprise surprise = null;
        switch (GatherSurprises.randomSuprise.nextInt(3)){
            case 0:
                surprise = FortuneCookie.generate();
                break;
            case 1:
                surprise = Candies.generate();
                break;
            case 2:
                surprise = MinionToy.generate();
                break;
            default:
                break;
        }
        return surprise;
    }
    public static ArrayList<ISurprise> gather(int n){
        ArrayList<ISurprise> surprisesList = new ArrayList<>(n);
        for (int i=0; i < n; i++ ){
            surprisesList.add(gather());
        }
        return surprisesList;
    }
}
