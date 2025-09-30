package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("BMW", "X5", 2022));
        cars.add(new Car("Audi", "A4", 2020));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        } else {
            return cars.subList(0, count);
        }
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }
}