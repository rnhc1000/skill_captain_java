package br.dev.ferreiras;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;


public class App {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Scanner input = new Scanner(System.in);
        String logTimeDate = "dd.MM.yyyy HH:mm:ss.SSS";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(logTimeDate);
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.print("Input the number to be processed: ");
        Long number = input.nextLong();

        Factorial numberToBeFactored = new Factorial(number);
        Logger logger = Logger.getLogger(App.class.getName());
        logger.info("Task had just been submitted!");
        long start = System.currentTimeMillis();
        Future<Long> future = threadPool.submit(numberToBeFactored);

        while (!future.isDone()) {
            System.out.print(".");
        }

        logger.info("Task done!");
        long end = System.currentTimeMillis();
        long factorial = future.get();

        System.out.print("\n\n------> Factorial is equal to: " + factorial);
        System.out.print("\n\nProcess took: ------> " + (end-start) + " ms!");

        threadPool.shutdown();
        input.close();

    }

    private record Factorial(Long number) implements Callable<Long> {

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

            private Long calculateFactorial(Long numberToBeFactored) throws InterruptedException {

                if (numberToBeFactored <= 0) {
                    throw new IllegalArgumentException("Number to be Factored must be greater than zero");
                }

                long factoredNumber = 1L;

                while (numberToBeFactored > 0) {

                    factoredNumber = numberToBeFactored * factoredNumber;
                    numberToBeFactored--;
                }

                return factoredNumber;
            }
        }
}
