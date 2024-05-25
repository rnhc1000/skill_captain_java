package advanced.dayThree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create a program that reads a directory containing a large number of files
 * and performs word count on each file using a thread pool of size 10.
 * The program should use an ExecutorService to manage the thread pool and
 * submit tasks for each file to be processed concurrently.
 * Once all the files have been processed, the program should output the total
 * word count for all the files.
 */
public class Executor {

  private synchronized void readDirectoryThreaded() {
    int threadPool = 10;
    ExecutorService executorService = Executors.newFixedThreadPool(threadPool);

    ReadDirectory readDirectory = new ReadDirectory();

    //for (int i = 0; i < threadPool; i++) {
    executorService.submit(readDirectory);
    // try {
    //     System.out.println(result.get());
    // } catch (InterruptedException | ExecutionException e) {

    //     e.printStackTrace();

    // }
    //}
    executorService.shutdown();

  }

  class ReadDirectory implements Runnable {

    private String name = "";

    ReadDirectory(String name) {
      this.name = name;
    }

    ReadDirectory() {
    }

    @Override
    public void run() {

      String dir = "./advanced/dayThree/";
      Set<String> listOfFiles = new HashSet<>();

      try (Stream<Path> stream = Files.list(Paths.get(dir))) {

        listOfFiles = stream
                .filter(file -> !Files.isDirectory(file))
                .map(Path::getFileName)
                .map(Path::toString)
                .collect(Collectors.toSet());

      } catch (IOException e) {

        System.out.println("Error...");
        e.printStackTrace();

      }

      System.out.println("Reading directory....");
      System.out.println(listOfFiles);

    }
  }


  public static void main(String... args) {

    Executor executor = new Executor();
    executor.readDirectoryThreaded();

  }
}
