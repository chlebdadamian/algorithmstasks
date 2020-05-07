package pl.chlebdad.Misc;

public class rootSquare {

    public static double squareRoot(int number) {
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }


    public int mySqrt(int x) {

        if ((x == 1) || (x == 0)) return x;

        long r = x / 2;
        while (r * r > x)
            r = (r + x / r) / 2;

        return (int) r;
    }

}


