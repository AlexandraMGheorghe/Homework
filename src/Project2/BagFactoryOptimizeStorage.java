package Project2;

public class BagFactoryOptimizeStorage implements IBagFactory{

    @Override
    public IBag makeBag(String type) {
        type = type.toUpperCase();
        switch (type) {
            case "FIFO":
                return new FifoBag();
            case "LIFO":
                return new LifoBag();
            case "RANDOM":
                return new RandomBag();
            default:
                System.out.println("We cannot recognize this type of bag");
                break;
        }
        return null;
    }
}
