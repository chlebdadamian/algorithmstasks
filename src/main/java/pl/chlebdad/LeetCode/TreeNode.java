package pl.chlebdad.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeNode {


    public static String TreeConstructor(String[] strArr) {

        if (strArr == null) return "false";

        Map<Integer, Integer> map = new HashMap<>();

        for (String s : strArr) {

            String str = s.replaceAll("\\(", "").replaceAll("\\)", "");
            List<String> list = Arrays.asList(str.split(","));

            int b = Integer.parseInt(list.get(1));

            if (!map.containsKey(b)) {
                map.put(b, 1);
            } else {
                map.replace(b, map.get(b) + 1);
            }

            if (map.get(b) > 2) return "false";

        }

        return "true";
    }
}

