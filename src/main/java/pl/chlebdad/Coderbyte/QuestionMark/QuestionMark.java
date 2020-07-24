package pl.chlebdad.Coderbyte.QuestionMark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMark {

    public static void main(String[] args) {

        System.out.println(QuestionsMarks("arrb6???4xxbl5???eee5")); //true
        System.out.println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?5")); //true
        System.out.println(QuestionsMarks("9???1???9??1???9")); //false
        System.out.println(QuestionsMarks("1?")); //false

    }

    public static String QuestionsMarks(String str) {

        str = str.replaceAll("[^0-9?]", "");
        Pattern pattern = Pattern.compile("\\d\\?+\\d");
        Matcher m = pattern.matcher(str);

        boolean matched = false;

        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));

            if (a + b == 10) {

                if (match.length() != 5) {
                    matched = false;
                    continue;
                }
                matched = true;
            }

        }

        return matched ? "true" : "false";
    }

}
