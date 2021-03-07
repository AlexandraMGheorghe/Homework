package Project2;

import java.util.ArrayList;

public class FifoBag implements IBag{
    private ArrayList<ISurprise> fifoBag;

    public FifoBag() {
        this.fifoBag = new ArrayList<ISurprise>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.fifoBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for (int i = 0; i<bagOfSurprises.size(); i++){
            fifoBag.add(bagOfSurprises.takeOut());
        }

    }

    @Override
    public ISurprise takeOut() {
        ISurprise surprise = fifoBag.get(0);
        fifoBag.remove(fifoBag.get(0));
        return surprise;
    }

    @Override
    public boolean isEmpty() {
        return (this.fifoBag.size() == 0);
    }

    @Override
    public int size() {
        return this.fifoBag.size();
    }

    @Override
    public String toString() {
        return "FifoBag{" +
                "bag=" + fifoBag +
                '}';
    }
}
