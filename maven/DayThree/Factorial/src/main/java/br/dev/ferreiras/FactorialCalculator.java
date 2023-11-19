package br.dev.ferreiras;

public class FactorialCalculator {


    private int numberToBeFactored;

    public FactorialCalculator() {

    }

    public FactorialCalculator(int numberToBeFactored) {

        this.numberToBeFactored = numberToBeFactored;
    }


    public int calculateFactorial (int numberToBeFactored) {


        if (numberToBeFactored <=0) {

            throw new IllegalArgumentException("Number to be Factored must be greater than zero");
            
        }

        int factoredNumber=1;

        while (numberToBeFactored > 1) {

            factoredNumber = factoredNumber * numberToBeFactored;
            numberToBeFactored--;
        }

        return factoredNumber;
    }

    
}
