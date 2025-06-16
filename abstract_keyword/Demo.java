
abstract class Car {

    abstract void drive();

    void listenMusic() {
        System.out.println("Listening to music...");
    }
}

class WagonR extends Car {

    void drive() {
        System.out.println("Driving Car...");
    }
}

public class Demo {

    public static void main(String a[]) {

        WagonR wagon = new WagonR();
        wagon.drive();
        wagon.listenMusic();
    }
}
