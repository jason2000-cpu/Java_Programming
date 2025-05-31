
class Mobile {

    String brand;        // instance variable
    int price;           // instance variable
    static String name;  //static variable

    public static void printInfo(Mobile obj) {
        System.out.println("Brand::" + obj.brand);
        System.out.println("Price::" + obj.price);
        System.out.println("Name::" + name);
        System.out.println("\n");

    }
}

public class Main {

    public void main(String a[]) {
        Mobile mob1 = new Mobile();
        mob1.brand = "Xiaomi";
        mob1.price = 15000;

        Mobile.name = "Smart Phone";

        System.out.println("Mobile Class::" + Mobile.class);

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 25000;

        System.out.println("::::MOBILE ONE INFO::::");
        Mobile.printInfo(mob1);

        System.out.println("::::MOBILE TWO INFO::::");
        Mobile.printInfo(mob2);
    }
}
