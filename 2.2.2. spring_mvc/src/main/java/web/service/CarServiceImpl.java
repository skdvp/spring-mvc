package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = Arrays.asList(
            new Car("W205", "Mercedes", 2500000),
            new Car("X5", "BMW", 3000000),
            new Car("Q7", "Audi", 825000),
            new Car("CX-5", "Mazda", 1500000),
            new Car("LX III", "Lexus", 2900000));

    @Override
    public List<Car> printSomeCars(Integer count) {
        if (count == null) {
            return cars;
        }
        if (count < 5) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
