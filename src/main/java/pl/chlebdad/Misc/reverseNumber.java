package pl.chlebdad.Misc;

public class reverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(123));

    }

    public static int reverseNumber(int number) {

        int result = 0;

        do {
            result = result * 10 + (number % 10);
            number = number / 10;
        } while (number > 0);

        return result;
    }

}
