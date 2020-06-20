package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/car")
    public String addAndPrintCar(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Q7","Audi",825000));
        cars.add(new Car("X5","BMW",3000000));
        cars.add(new Car("CX-5","Mazda",1500000));
        cars.add(new Car("W205","Mercedes",2500000));
        cars.add(new Car("LX III","Lexus",2900000));
        model.addAttribute("cars", cars);
        return "index";
    }

}
