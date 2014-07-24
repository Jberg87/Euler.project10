package nl.sogyo.jesper.euler;

import java.util.ArrayList;

/**
 * Created by Jesper on 24-7-2014.
 */
public class PrimeNumberLib {

    private ArrayList<Integer> primeNumberList = new ArrayList<Integer>();

    public PrimeNumberLib() {
        primeNumberList.add(2); primeNumberList.add(3);
    }

    public void createPrimeNumbers(int maxInt) {
        for (int i = 1; i <= maxInt; i++){
            // 2 en 3 staan er al in, dus die niet nog een keer toevoegen;
            if (i > 3 && isPrimeNumber(i)) primeNumberList.add(i);
        }
    }


    public boolean isPrimeNumber(int numberToCheck) {
        if (numberToCheck <= 1) return false;

        for (int primeNumber: primeNumberList) {
            if (numberToCheck % primeNumber == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfPrimeNumbers(){
        int sumOfPrimes = 0;
        for (int primeNumber : primeNumberList) {
            sumOfPrimes = sumOfPrimes + primeNumber;
        }
        return sumOfPrimes;
    }
}
