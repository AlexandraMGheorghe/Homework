package Project2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private IBag bag;
    private int waitTime;

    public AbstractGiveSurprises(String bagType, int waitTime) {
        BagFactoryOptimizeStorage bagFactory = new BagFactoryOptimizeStorage();
        this.bag = bagFactory.makeBag(bagType);
        this.waitTime = waitTime;
    }

    public void put (ISurprise newSurprise){
        this.bag.put(newSurprise);
    }

    public void put (IBag surprises){
        this.bag.put(surprises);
    }

    public ISurprise give(){
        if(this.bag.isEmpty()){
            return null;
        }
        ISurprise surprise = this.bag.takeOut();
        surprise.enjoy();
        return surprise;
    }

    public ArrayList<ISurprise> giveAll(){
        if(this.bag.isEmpty()){
            return null;
        }
        ArrayList<ISurprise> surprises = new ArrayList<>(this.bag.size());
        for(int i = 0; i < this.bag.size(); i++) {
            ISurprise surprise = give();
            surprises.add(surprise);
            try {
                TimeUnit.SECONDS.sleep(this.waitTime);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        return surprises;
    }

    public boolean isEmpty(){
        return this.bag.isEmpty();
    }

    protected abstract void giveWithPassion();


}
