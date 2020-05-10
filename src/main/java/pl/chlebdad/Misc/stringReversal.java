package pl.chlebdad.Misc;

public class stringReversal {

    public static void main(String[] args) {

        System.out.println(reverseString("damian"));

    }

    public static String reverseString(String string) {

        char[] tmp = string.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = tmp.length - 1; i >= 0; i--) {
            sb.append(tmp[i]);
        }

        return sb.toString();
    }
}
