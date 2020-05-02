package pl.chlebdad.FrogJump;

public class FrogJump {

    /**
     * The problem is to count the minimum number of jumps from position X to Y.
     */

    public static void main(String[] args) {

        System.out.println(solution(2, 6, 3));
        System.out.println(solution(1, 6, 5));
        System.out.println(solution(0, 6, -1));
    }

    public static int solution(int X, int Y, int D) {

        if (X < 0 || Y < 0 || D <= 0) return 0;

        int distanceToJump = Math.abs(X - Y);
        int numberOfJumps = distanceToJump / D;

        if (distanceToJump / D != 0) {
            numberOfJumps++;
        }

        return numberOfJumps;
    }
}
