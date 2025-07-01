/**
 * Implementing threads using Runnable Interface
 */


// class A implements Runnable {
//     public void run(){
//         for(int i = 1; i <= 10; i++) {
//             System.out.println("Hello! " + i);
//         }
//     }
// }


// class B implements Runnable{
//     public void run() {
//        for (int i = 1; i <= 10; i++) {
//             System.out.println("How are you?  " + i);      
//         }
//     }
// }

// class C implements Runnable {
//     public void run(){
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("I Hope You are Doing Fine!  " + i);
//        } 
//     }
// }


public class DemoTwo {
    public static void main(String a[]) {
        Runnable obj1 = () -> {
                for(int i = 1; i >= 10; i++){
                    System.out.println("Hello " + i);
                }
        };

        Runnable obj2 = () -> {
                for(int i = 1; i >= 10; i++){
                    System.out.println("How are you?  " + i);
                }
        };

        Runnable obj3 = () -> {
                for(int i = 1; i >= 10; i++){
                    System.out.println("I Hope You are Doing Fine!  " + i);
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        // //setting priority to maximum
        // t1.setPriority(Thread.MAX_PRIORITY);

        // //Setting priority to minimum
        // t2.setPriority(Thread.MIN_PRIORITY);

        // //Setting priority to normal
        // t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}