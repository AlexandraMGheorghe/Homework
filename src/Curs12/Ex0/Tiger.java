package Curs12.Ex0;

public class Tiger extends Terrestrial {

    @Override
    public void eat(int unitsOfFood) {
        System.out.println("Eating grass like a tiger, " + unitsOfFood + " tons.");
    }

    @Override
    public void move(int distance) {
        System.out.println("Slowly moving forward like a tiger, " +
                distance + " meters in " + distance / 3 + " days.");
    }

    @Override
    public void saySomething() {
        System.out.println("waawwww... This tiger says something... ");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I am a strong animal!");
    }
}
