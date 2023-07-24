package advanced.dayTwo;

public class RunnableJava extends Thread{

    synchronized public static void main(String... args){


        Runner r1 = new Runner();
        Runner r2 = new Runner();
        Runner r3 = new Runner();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);


    }
    
}
