package day1;

public class Digits {

    public static void main(String[] args) {
        int num = 32594;

        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}
