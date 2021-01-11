package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private CarServiceImpl carService;

    @Autowired
    public void setCarService(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printSomeCars(@RequestParam(value = "count", required = false) Integer countVar, ModelMap model) {
        model.addAttribute("carsKey", carService.printSomeCars(countVar));
        return "cars";
    }
}
