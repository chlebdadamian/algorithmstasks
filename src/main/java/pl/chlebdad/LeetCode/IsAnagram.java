package pl.chlebdad.LeetCode;

public class IsAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("TestTest", "testsest"));

    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] arrA = new int[26];
        int[] arrB = new int[26];

        for (char c : a.toCharArray()) {
            arrA[c - 'a'] = arrA[c - 'a'] + 1;
        }

        for (char o : b.toCharArray()) {
            arrB[o - 'a'] = arrB[o - 'a'] + 1;
        }

        for (int i = 0; i < arrB.length; i++) {
            if (arrA[i] != arrB[i]) return false;
        }
        return true;
    }
}
