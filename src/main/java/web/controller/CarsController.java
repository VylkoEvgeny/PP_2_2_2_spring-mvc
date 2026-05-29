package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;
import web.service.TransportService;

import java.util.List;

@Controller
public class CarsController {

    private final TransportService<Car> transportService;

    @Autowired
    public CarsController(TransportService<Car> transportService) {
        this.transportService = transportService;
    }

    @GetMapping("/cars")
    public String printCars(ModelMap model,
                            @RequestParam(required = false) Integer count) {
        List<Car> cars = transportService.getTransports(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
