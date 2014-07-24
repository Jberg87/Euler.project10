package nl.sogyo.jesper.euler;

/**
 * Created by Jesper on 24-7-2014.
 */
public class Main {
    public static void main(String[] args) {
        int upperPrimeNUmberValue = 2000000;
        PrimeNumberLib primeNumberLib = new PrimeNumberLib();
        primeNumberLib.createPrimeNumbers(upperPrimeNUmberValue);
        System.out.println("The sum of primenumbers < " + upperPrimeNUmberValue + " is: " + primeNumberLib.sumOfPrimeNumbers());
    }



}
