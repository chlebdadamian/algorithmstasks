package pl.chlebdad.LeetCode;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(PalindromeCreator("mmop"));
    }

    public static String PalindromeCreator(String str) {

        if (str.length() < 3) return "not possible";

        StringBuilder sb = new StringBuilder();

        int fromStart = 0;
        int fromEnd = str.length() - 1;

        int removed = 0;

        while (fromEnd > fromStart) {


            if (str.charAt(fromStart) == str.charAt(fromEnd)) {

                fromStart++;
                fromEnd--;

                continue;
            }

            if (fromEnd - fromStart == 1) {
                sb = sb.append(str.charAt(fromStart));
                sb = sb.append(str.charAt(fromEnd));
                removed += 2;
                fromEnd--;
                fromStart++;
                continue;
            }

            if (str.charAt(fromEnd) == str.charAt(fromStart + 1)) {

                sb = sb.append(str.charAt(fromStart));
                removed++;
                fromStart++;

            } else if (str.charAt(fromStart) == str.charAt(fromEnd - 1)) {

                sb = sb.append(str.charAt(fromEnd));
                removed++;
                fromEnd--;

            }


            if (removed == 3) return "not possible";

        }

        if (removed < 3) return sb.toString();

        return "palindrome";
    }
}
