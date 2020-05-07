package pl.chlebdad.Misc;

import java.util.HashSet;
import java.util.Set;

public class jewelsInStones {

    public int numJewelsInStones(String J, String S) {

        int count = 0;
        int index = 0;
        for (int i = 0; i < S.length(); i += J.length()) {

            if (S.contains(J)) {
                index = S.lastIndexOf(J, index);
                S = S.substring(index + 1, S.length() - 1);
                count++;
            }

        }
        return count;
    }

    public int numJewelsInStones_v2(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            jewels.add(J.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jewels.contains(S.charAt(i))) count++;
        }

        return count;
    }

}
