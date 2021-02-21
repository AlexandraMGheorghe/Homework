package Curs12.Ex0;

public class Zebra extends Terrestrial {
    @Override
    public void eat(int unitsOfFood) {
        System.out.println("Eating grass like a Zebra, " + unitsOfFood + " tons.");
    }

    @Override
    public void move(int distance) {
        System.out.println("Slowly moving forward like a zebra, " +
                distance + " meters in " + distance / 4 + " days.");
    }

    @Override
    public void saySomething() {
        System.out.println("sseee... This zebra says something... ");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I am zebra!");
    }
}
