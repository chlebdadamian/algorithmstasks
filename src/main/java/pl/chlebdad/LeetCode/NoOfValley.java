package pl.chlebdad.LeetCode;

public class NoOfValley {

    public static void main(String[] args) {

        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }

    static int countingValleys(int n, String s) {

        int valleyCounter = 0, altitude = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleyCounter++;
                }

            } else {

                altitude--;
            }
        }
        return valleyCounter;
    }
}
