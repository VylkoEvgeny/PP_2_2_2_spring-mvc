package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = List.of(new Car("BMW", "white", 2024),
            new Car("Audi", "black", 2025),
            new Car("Mercedes", "green", 2020),
            new Car("Skoda", "grey", 2017),
            new Car("Volkswagen", "blue", 2019));

    @Override
    public List<Car> getTransports(Integer count) {
        if (count == null) {
            return cars;
        }
        if (count <= 0) {
            return Collections.emptyList();
        }
        return List.copyOf(cars.subList(0, Math.min(count, cars.size())));
    }
}
