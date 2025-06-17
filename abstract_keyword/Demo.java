
abstract class Car {   // Abstract class

    abstract void drive(); // Abstract method

    void listenMusic() {
        System.out.println("Listening to music...");
    }
}

class WagonR extends Car {  // concerete class

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
