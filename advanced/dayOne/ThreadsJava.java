package advanced.dayOne;
/**
 * Assignments:
 * Print numbers from 1 to 10 using two threads, where each thread prints alternate numbers.
 * Create two threads, ThreadA and ThreadB.
 * ThreadA should print odd numbers (1, 3, 5, 7, 9) and 
 * ThreadB should print even numbers (2, 4, 6, 8, 10).
 * Implement the logic to print the numbers inside the run() method of each thread.
 * Synchronize the threads to ensure proper alternating printing.
 * Start both threads and observe the output.
 * This problem allows you to demonstrate the concept of concurrent execution using 
 * threads and how synchronization can be used to ensure orderly execution.
 */
public class ThreadsJava {

    public static void main(String[] args) {


        ThreadEven even = new ThreadEven();

        even.evenNumbers(12);



    }
    
}
