package advanced.dayOne;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String... args) {

        Random random = new Random();
        int count = random.nextInt(10, 100);
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(1, 1000);
            numbers.add(x);
        }

        System.out.println(count);
        ThreadA even = new ThreadA();
        ThreadB odd = new ThreadB();
        long start = System.currentTimeMillis();
        even.start();
        odd.start();
        // even.join();
        // odd.join();

        long end = System.currentTimeMillis();
        long process = end - start;

        System.out.println("Execution time: " + process + "ms");

    }

    static class ThreadA extends Thread {

        ThreadA(Thread threadName) {
            this.threadName = threadName;
            this.numbers = numbers;
        }

        public ThreadA() {
        }

        @Override
        public void run() {

            System.out.println(getOdd(numbers));
        }

    }

    static class ThreadB extends Thread {

        ThreadB(Thread threadName) {

            this.threadName = threadName;
            this.numbers = numbers;
        }

        public ThreadB() {
        }

        @Override
        public void run() {

            System.out.println(getEven(numbers));

        }

    }

    private static synchronized List<Integer> getEven(List<Integer> list) {
        return numbers.stream().filter(element -> element % 2 == 0).toList();
    }

    private static synchronized List<Integer> getOdd(List<Integer> list) {
        return numbers.stream().filter(element -> element % 2 == 1).toList();
    }

    private static void getResult() {
        return result;
    }

}