package pl.chlebdad.LeetCode;

public class RepString {

    public static void main(String[] args) {

        System.out.println(repeatedString("ababa", 3));

    }

    static long repeatedString(String s, long n) {

        long numOfS = n / s.length();
        long rest = n % s.length();

        if (!s.contains("a")) return 0;
        return s.length() > n ? aCounter(s, rest)
                : numOfS * aCounter(s, s.length()) + aCounter(s, rest);
    }

    private static long aCounter(String s, long end) {
        int a = 0;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == 'a') a++;
        }
        return a;
    }
}
