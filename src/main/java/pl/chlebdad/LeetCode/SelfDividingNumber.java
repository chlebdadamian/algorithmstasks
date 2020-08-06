package pl.chlebdad.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> resultList = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            int rest;
            int number = i;
            boolean flag = false;

            while (number > 0) {

                rest = number % 10;
                number = number / 10;
                flag = rest != 0 && i % rest == 0;

                if (!flag) break;
            }

            if (flag) resultList.add(i);
        }

        return resultList;
    }
}
