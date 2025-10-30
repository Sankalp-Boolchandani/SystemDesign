package org.example;

import singleton.EnumSingleton;
import singleton.LazySingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello, World!");

//        EnumSingleton instance = EnumSingleton.INSTANCE;
//        instance.hashCode();


//         using constructors(reflections API) to break singleton
//        LazySingleton instance1 = LazySingleton.getInstance();
//        Constructor<?>[] declaredConstructors = LazySingleton.class.getDeclaredConstructors();
//        declaredConstructors[0].setAccessible(true);
//        Constructor<LazySingleton> declaredConstructor = (Constructor<LazySingleton>) declaredConstructors[0];
//        LazySingleton instance2 = declaredConstructor.newInstance();
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

//         breaking singleton with serialization
//        LazySingleton lazySingleton=LazySingleton.getInstance();
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.obj"));
//        oos.writeObject(lazySingleton);
//        System.out.println(lazySingleton.hashCode());
//        System.out.println("serialized.........");
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.obj"));
//        LazySingleton o =(LazySingleton) ois.readObject();
//        System.out.println(o.hashCode());




    }
}