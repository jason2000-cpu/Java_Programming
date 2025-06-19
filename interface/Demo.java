
/**
 * Key words to use
 *
 * class to class  -> extends
 * class  to interface -> implements
 * interface to interface -> extends
 *
 * NB: A class can implement multiple interfaces
 * NB: An interface can extend from another interface
 */
interface X {

    int MILEAGE = 20000; //Final and static (cannot be changed)
    String MANUFACTURER = "Toyota"; //Final and static (cannot be changed)

    void drive();

    void listenMusic();
}

interface Y extends X {

    void switchOffEngine();
}

class B implements Y {

    public void drive() {
        System.out.println("Driving....");
    }

    ;

    public void listenMusic() {
        System.out.println("Listening Music....");
    }

    ;

    public void switchOffEngine() {
        System.out.println("Switching the Engine Off...");
    }

}

public class Demo {

    public static void main(String a[]) {
        B obj = new B();

        System.out.println(":::::::::: CAR DETAILS ::::::::::");
        System.out.println("CAR MANUFACTURER:::" + obj.MANUFACTURER);
        System.out.println("CAR MILEAGE:::" + obj.MILEAGE);

        obj.drive();
        obj.listenMusic();
        obj.switchOffEngine();
    }
}
