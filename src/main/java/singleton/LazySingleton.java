package singleton;

import java.io.Serial;
import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static LazySingleton singletonDemo=null;

    private LazySingleton() throws Exception {
        // solution to breaking using reflections
        if (singletonDemo!=null){
            throw new Exception("you are trying to break singleton using reflections");
        }
    }

    public static LazySingleton getInstance() throws Exception {
        if (singletonDemo==null){
            singletonDemo=new LazySingleton();
        }
        return singletonDemo;
    }

    // solution to breaking with serialization
    @Serial
    public Object readResolve(){
        return singletonDemo;
    }

}
