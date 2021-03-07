package Project2;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
    private String minionsName;
    private static int minionCount = 0;
    private static ArrayList<String> minionNames =  new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));

    public MinionToy(String minionsName) {
        this.minionsName = minionsName;
    }

    public static MinionToy generate(){
        if (MinionToy.minionCount == MinionToy.minionNames.size()) {
            MinionToy.minionCount = 0;
        }
        return new MinionToy(minionNames.get(MinionToy.minionCount++));
    }

    @Override
    public void enjoy() {
        System.out.println("You have receive one minion toy: " + this.minionsName);
    }

    @Override
    public String toString() {
        return "MinionToy{" +
                "minionsName='" + minionsName + '\'' +
                '}';
    }
}
