package advanced.dayOne;

import java.util.Arrays;
import java.util.List;

/**
 * Assignments:
 * Print numbers from 1 to 10 using two threads, where each thread prints
 * alternate numbers.
 * Create two threads, ThreadA and ThreadB.
 * ThreadA should print odd numbers (1, 3, 5, 7, 9) and
 * ThreadB should print even numbers (2, 4, 6, 8, 10).
 * Implement the logic to print the numbers inside the run() method of each
 * thread.
 * Synchronize the threads to ensure proper alternating printing.
 * Start both threads and observe the output.
 * This problem allows you to demonstrate the concept of concurrent execution
 * using
 * threads and how synchronization can be used to ensure orderly execution.
 */
public class ThreadsJava {

    synchronized public static void main(String[] args) {

        ThreadA even = new ThreadA();
        ThreadB odd = new ThreadB();

        even.start();
        odd.start();

    }

    static class ThreadA extends Thread {

        private String threadName;

        ThreadA(String threadName) {

            this.threadName = threadName;
        }

        public ThreadA() {
        }

        @Override
        public void run() {

            List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            numbers.stream().filter(element -> element % 2 == 0).forEach(System.out::print);
            System.out.print(" ");
        }

    }

    static class ThreadB extends Thread {

        private String threadName;

        ThreadB(String threadName) {

            this.threadName = threadName;
        }

        public ThreadB() {
        }

        @Override
        public void run() {

            List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

            numbers.stream().filter(element -> element % 2 == 1).forEach(System.out::print);

            System.out.print(" ");

        }

    }

}