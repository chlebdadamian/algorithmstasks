package pl.chlebdad.Coderbyte.QuestionMark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class QuestionMark {

    public static void main(String[] args) {

//        System.out.println(QuestionsMarks("arrb6???4xxbl5???eee5")); //true
//        System.out.println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?5")); //false
//        System.out.println(QuestionsMarks("9???1???9??1???9")); //false
//        System.out.println(QuestionsMarks("1???9")); //true
//        System.out.println(shuffle(new int[]{1,2,3,4,5,6}, 3));
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
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

    public static int[] shuffle(int[] nums, int n) {


        int[] a = Arrays.copyOfRange(nums, 0, n);

        int[] b = Arrays.copyOfRange(nums, n, nums.length);

        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {

            nums[i] = a[count];
            nums[i + 1] = b[count];
            count++;

        }

        return nums;

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Integer> list = Arrays.stream(candies)
                .boxed()
                .collect(Collectors.toList());
        List<Boolean> res = new ArrayList<>();
        Arrays.sort(candies);
        int max = candies[candies.length - 1];

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) + extraCandies > max) {

                res.add(i, true);

            } else {

                res.add(i, false);
            }


        }

        return res;
    }

}
