import java.util.*;

public class Client {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Kia", "Optima", 2011));
        cars.add(new Car("Chevrolet", "Camaro", 2001));
        cars.add(new Car("Ford", "Focus", 2013));
        cars.add(new Car("Honda", "Accord", 2015));
        cars.add(new Car("Ford", "Fusion", 2003));
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
