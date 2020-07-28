package pl.chlebdad.LeetCode;

import java.util.HashMap;

public class IsomorphicString {

//    Given two strings s and t, determine if they are isomorphic.
//    Two strings are isomorphic if the characters in s can be replaced to get t.
//
//    For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.

    public static void main(String[] args) {


    }

    public static boolean isStringIsomorphic(String str, String str2) {

        if (str == null || str2 == null)
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str2.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                if (map2.containsKey(c2)) {
                    return false;
                }
                map1.put(c1, c2);
                map2.put(c2, c1);

            }

        }

        return true;
    }
}
