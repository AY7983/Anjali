class Automobile {
    private String drive() {         //private not accessible by child classs.
        return "Driving Vehicle";
    }
    public static void main(String[] Vehicles) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}

class Car extends Automobile {
    protected String drive() {   // protected is accessible by their child class also. 
        return "Driving Car";
    }
}
class ElectricCar extends Car {

    @Override
    public final String drive() {
        return "Driving electric Car";
    }
}
