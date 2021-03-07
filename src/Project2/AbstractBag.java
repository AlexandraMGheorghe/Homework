package Project2;

import java.util.ArrayList;


public abstract class AbstractBag {
    private IBag bag;
    private static ArrayList<ISurprise> bagArray = new ArrayList<ISurprise>();

    public void put(ISurprise newSurprise) {
        this.bag.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.bag.put(surprises);
    }

    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    public int size(){
        return  this.bag.size();
    }



}
