
class Human {

    private int age;
    private String name;

    // Constructor
    public Human() {
        age = 12;
        name = "Jackson";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Main {

    public static void main(String a[]) {
        Human hum1 = new Human();
        Human hum2 = new Human();

        // // use setters to assign value to the private varialbes
        hum1.setAge(25);
        hum1.setName("Jackson");
        System.out.println("::::Human Info::::");
        System.out.println("AGE::" + hum1.getAge());
        System.out.println("Name::" + hum1.getName());

        System.out.println("::::Human Info::::");
        System.out.println("AGE::" + hum2.getAge());
        System.out.println("Name::" + hum2.getName());

    }
}
