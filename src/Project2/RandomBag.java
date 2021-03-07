package Project2;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag{
    public ArrayList<ISurprise> randomBag = new ArrayList();
    public static final Random random = new Random();

    @Override
    public void put(ISurprise newSurprise) {
        this.randomBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for (int i = 0; i<bagOfSurprises.size(); i++){
            randomBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        int randomIndex = random.nextInt(randomBag.size());
        ISurprise surprise = randomBag.get(randomIndex);
        randomBag.remove(randomBag.get(randomIndex));
        return surprise;

    }

    @Override
    public boolean isEmpty() {
        return (this.randomBag.size() == 0);
    }

    @Override
    public int size() {
        return this.randomBag.size();
    }

    @Override
    public String toString() {
        return "RandomBag{" +
                "randomBag=" + randomBag +
                '}';
    }
}
