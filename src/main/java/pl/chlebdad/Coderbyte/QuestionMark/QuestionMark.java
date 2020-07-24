package pl.chlebdad.Coderbyte.QuestionMark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMark {

    public static void main(String[] args) {

        System.out.println(QuestionsMarks("arrb6???4xxbl5???eee5")); //true
        System.out.println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?5")); //false
        System.out.println(QuestionsMarks("9???1???9??1???9")); //false
        System.out.println(QuestionsMarks("1???9")); //true

    }

    public static String QuestionsMarks(String str) {
        String numMarks = str.replaceAll("[^0-9?]", "");
        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(numMarks);
        boolean matched = false;
        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if (a + b == 10) {
                if (match.length() != 5) {
                    return "false";
                } else {
                    matched = true;
                    numMarks = numMarks.substring(1);
                    m = p.matcher(numMarks);
                }
            }
        }
        return matched ? "true" : "false";
    }

}
