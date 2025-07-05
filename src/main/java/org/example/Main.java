package org.example;

import singleton.EnumSingleton;
import singleton.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
//        System.out.println("Hello, World!");

        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.hashCode();

//        LazySingleton instance1 = LazySingleton.getInstance();
//        Constructor<?>[] declaredConstructors = LazySingleton.class.getDeclaredConstructors();
//        declaredConstructors[0].setAccessible(true);
//        Constructor<LazySingleton> declaredConstructor = (Constructor<LazySingleton>) declaredConstructors[0];
//        LazySingleton instance2 = declaredConstructor.newInstance();
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

    }
}