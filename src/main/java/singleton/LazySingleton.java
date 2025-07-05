package singleton;

public class LazySingleton {

    private static LazySingleton singletonDemo=null;

    private LazySingleton() throws Exception {
        if (singletonDemo!=null){
            throw new Exception("object already exists");
        }
    }

    public static LazySingleton getInstance() throws Exception {
        if (singletonDemo==null){
            singletonDemo=new LazySingleton();
        }
        return singletonDemo;
    }

}
