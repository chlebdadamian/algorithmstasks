package pl.chlebdad.Misc;

public class isPerfectSquare {

    public boolean isPerfectSquare(int num) {

        int a = 1;
        while (num >= 0) {
            if (num == 0) {
                return true;
            }
            num -= a;
            a += 2;
        }
        return false;

    }
}


