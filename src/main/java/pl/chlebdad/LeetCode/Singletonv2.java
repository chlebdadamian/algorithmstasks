package pl.chlebdad.LeetCode;

public class Singletonv2 {

    private Singletonv2() {

    }

    private static class SingletonHolder {
        private static Singletonv2 instance = new Singletonv2();
    }

    public static Singletonv2 getInstance() {
        return SingletonHolder.instance;
    }
}
