

class A extends Thread {
    public void run(){
        for(int i = 1; i <= 10; i++) {
            System.out.println("Hello! " + i);
            try {
                //halting execution
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
        }
    }
}


class B extends Thread{
    public void run() {
       for (int i = 1; i <= 10; i++) {
            System.out.println("How are you?  " + i);
            try {
                //halting execution
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }       
        }
    }
}

class C extends Thread {
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("I Hope You are Doing Fine!  " + i);
            try {
                //halting execution
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }
       } 
    }
}


public class Demo {
    public static void main(String a[]) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        //setting priority to maximum
        obj1.setPriority(Thread.MAX_PRIORITY);

        //Setting priority to minimum
        obj2.setPriority(Thread.MIN_PRIORITY);

        //Setting priority to normal
        obj3.setPriority(Thread.NORM_PRIORITY);

        obj1.start();
        obj2.start();
        obj3.start();
    }
}