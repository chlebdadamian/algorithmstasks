package pl.chlebdad.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {

        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {

        int length = words.length;

        if (length < 1) return 0;

        String[] arrMorse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {

                sb.append(arrMorse[(int) word.charAt(j) - 'a']);

            }

            set.add(sb.toString());

        }


        return set.size();

    }
}

