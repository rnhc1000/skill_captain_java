package br.dev.ferreiras;

import java.lang.System.Logger.Level;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number to be processed: ");
        int number = input.nextInt();

        Factorial numberToBeFactored = new Factorial(number);
        System.out.println("Task had just been submitted to...");
        Future<Long> future = threadPool.submit(numberToBeFactored);

        while (!future.isDone()) {
            System.out.println("Task being processed...Wait!");
        }

        System.out.println("Task done...");

        long factorial = (long) future.get();
        System.out.println("Factorial is equal to: " + factorial);
        threadPool.shutdown();
        input.close();

    }

    private static class Factorial implements Callable<Long> {

        private final int number;

        public Factorial(int number) {
            this.number = number;
        }

        @Override
        public Long call() {

            long result = 0L;
            try {

                result = calculateFactorial(number);
            } catch (InterruptedException e) {
                Logger.getLogger(App.class.getName())
                .log(java.util.logging.Level.SEVERE, "logging", new Exception("Exception"));
            }

            return result;

        }

        private Long calculateFactorial(int numberToBeFactored) throws InterruptedException {

            if (numberToBeFactored <= 0) {
                throw new IllegalArgumentException("Number to be Factored must be greater than zero");
            }

            Long factoredNumber = 1L;

            while (numberToBeFactored > 0) {

                factoredNumber = numberToBeFactored * factoredNumber;
                numberToBeFactored--;
            }
            return factoredNumber;
        }
    }
}
