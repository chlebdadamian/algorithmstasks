package pl.chlebdad.LeetCode;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverseString("test string to reverse string"));
        System.out.println(reverseStringv2("test string to reverse string"));

    }

    public static String reverseString(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.reverse().toString();
    }

    public static String reverseStringv2(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i > -1; i--) {

            stringBuilder.append(str.charAt(i));

        }

        return stringBuilder.toString();
    }

}
