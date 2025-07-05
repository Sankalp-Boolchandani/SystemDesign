package factoryDp;

public class CarFactory {

    static Car carProvider(String car){
        if (car.equalsIgnoreCase("Sedan")){
            return new Sedan();
        } else if (car.equalsIgnoreCase("Suv")) {
            return new Suv();
        } else {
            return new Hatchback();
        }
    }

}
