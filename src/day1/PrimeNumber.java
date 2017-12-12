package day1;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 2;
        boolean isPrime = true;
        if (num % 2 == 0) {
            System.out.println(num + " is not a prime number");
            return;
        }
        for (int i=3 ; i*i <= num ; i+=2) {
             if (num % i == 0) {
                 isPrime = false;
                 break;
             }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
