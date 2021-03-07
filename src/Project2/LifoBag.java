package Project2;

import java.util.ArrayList;

public class LifoBag implements IBag{
    private ArrayList<ISurprise> lifoBag;

    @Override
    public void put(ISurprise newSurprise) {
    this.lifoBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for (int i = 0; i<bagOfSurprises.size(); i++){
            lifoBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        ISurprise surprise = lifoBag.get(0);
        lifoBag.remove(lifoBag.get(0));
        return surprise;
    }

    @Override
    public boolean isEmpty() {
        return (this.lifoBag.size() == 0);
    }

    @Override
    public int size() {
        return this.lifoBag.size();
    }

    @Override
    public String toString() {
        return "LifoBag{" +
                "lifoBag=" + lifoBag +
                '}';
    }
}
