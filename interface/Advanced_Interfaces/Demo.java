
interface Computer {

    void code();
}

class Laptop implements Computer {

    public void code() {
        System.out.println("::: USING  LAPTOP :::");
        System.out.println("Coding Application...");
        System.out.println("Code Compile Run...");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("::: USING  DESKTOP :::");
        System.out.println("Coding Application...");
        System.out.println("Code Compile Run... : Faster");
    }
}

class Developer {

    public void devApp(Computer lap) {
        System.out.println("Wating For Computer....");
        lap.code();
    }
}

public class Demo {

    public static void main(String a[]) {
        Developer jack = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        jack.devApp(lap);
        System.out.println("\n");
        jack.devApp(desk);
    }
}
