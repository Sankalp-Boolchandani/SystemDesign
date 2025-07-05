package factoryDp;

public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.carProvider("sedan");
        c1.engine();
        Car c2 = CarFactory.carProvider("SUV");
        c2.engine();
        Car c3 = CarFactory.carProvider("non");
        c3.engine();
    }
}
