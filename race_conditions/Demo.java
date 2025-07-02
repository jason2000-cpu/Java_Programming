/**
 * Race conditions 
 * 
 * Race conditions happens when
 *   1. Two or more threads access a shared data
 *   2. And atleast one thread modifies that data
 *   3. And the final result depends on who gets there first
 * 
 * - So the outcome becomes unpredictable and wrong because threads
 *  "race" to read or write the same variable
 */

class Increment {
    int count = 0;

    /**
     * "synchronized" keyword is used to ensure that only
     * one thread at a time can run the "inc()" method
     *
     */

    public synchronized void inc(){
        count++;
    }
}



public class Demo{
    public static void main(String a[]) {
        Increment c  = new Increment();

        Runnable r1 = () -> {
            for (int i = 1; i <= 1000000; i++){
                c.inc();
            }
        };

        Runnable r2 = () -> {
            for (int i = 1; i <= 1000000; i++) {
                c.inc();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
        }
        
        System.out.println("FINAL COUNTER :::: " + c.count);
    }
}