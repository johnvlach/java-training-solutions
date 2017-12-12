package day1;

public class DecToBin {

    public static void main(String[] args) {

        int num = 128;
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            stringBuilder.append(num % 2);
            num /= 2;
        }

        System.out.println(stringBuilder.reverse().toString());
    }
}
