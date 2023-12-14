## SkilCaptain (https://skillcaptain.app/)
A very good site to learn and practice coding. Lots of challenges and the most important of all. You get a feedback about the solutions shown because you have to send them a repo lonk with your code. Awesome! Good job guys @skillCaptain

## _Tools_
- Java 17
- IntelliJ Community Edition

## _Table of contents_
- [SkilCaptain (https://skillcaptain.app/)](#skilcaptain-httpsskillcaptainapp)
- [_Tools_](#tools)
- [_Table of contents_](#table-of-contents)
- [_Screenshot_](#screenshot)
- [_Links_](#links)
- [_Built with_](#built-with)
- [_What I practiced_](#what-i-practiced)
- [_Continued development_](#continued-development)
  - [_Useful resources_](#useful-resources)
- [_Author_](#author)
- [Acknowledgments](#acknowledgments)


## _Screenshot_
[![](./skillCaptain.png)]()
## _Links_
- Live Site URL: [https://skillcaptain.app] 
## _Built with_

 ![](https://ferreiras.dev.br/assets/images/icons/java-icon.svg)| ![](https://ferreiras.dev.br/assets/images/icons/git-scm-icon.svg) | ![](https://ferreiras.dev.br/assets/images/icons/icons8-intellij-idea.svg) | ![](https://ferreiras.dev.br/assets/images/icons/linux-original.svg) | ![](https://ferreiras.dev.br/assets/images/icons/icons8-visual-studio-code.svg)

 ## _What I practiced_
```java

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
 * using threads and how synchronization can be used to ensure orderly execution.
 */
package advanced.dayOne;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ThreadsJava {

    static List<Integer> numbers = new ArrayLis<>();

    public static void main(String[] args) {

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
        even.join();
        odd.join();

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

``` 

## _Continued development_
- Next step: Java 21 Virtual Threads.
- 
### _Useful resources_
- [https://docs.oracle.com/en/java/] Always trust and read the official documentation!
- [https://skillcaptain.app/] Awesome tech-oriented content

## _Author_
- Website - [https://ferreiras.dev.br] 
## Acknowledgments
