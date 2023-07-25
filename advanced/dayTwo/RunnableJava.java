package advanced.dayTwo;

public class RunnableJava {

    synchronized public static void main(String... args){


        Runner r1 = new Runner();
        Runner r2 = new Runner();
        Runner r3 = new Runner();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.setName("r1");
        t2.setName("r2");
        t3.setName("r3");
        
        t1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();


    }
    
}
