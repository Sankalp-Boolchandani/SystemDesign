package singleton;

public class EagerSingleton {

    private static EagerSingleton eagerSingleton;

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
