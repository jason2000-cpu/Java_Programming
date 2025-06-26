
enum Laptop {
    Macbook(3000), XPS(5000), ThinkPad, HP(3500), Dell(1500);

    private int price;

    private Laptop() {
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    ;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {

    public static void main(String a[]) {
        Laptop lap1 = Laptop.Dell;

        // Printing one 
        System.out.println(lap1 + " : " + lap1.getPrice());

        System.out.println("\n");

        // printing all
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}
