package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = List.of(new Car("BMW", "white", 2024),
            new Car("Audi", "black", 2025),
            new Car("Mercedes", "green", 2020),
            new Car("Skoda", "grey", 2017),
            new Car("Volkswagen", "blue", 2019));

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        if (count < 0) {
            return Collections.emptyList();
        }
        return new ArrayList<>(cars.subList(0, Math.min(count, cars.size())));
    }
}
