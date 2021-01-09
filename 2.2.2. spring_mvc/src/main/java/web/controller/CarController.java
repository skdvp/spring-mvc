package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printSomeCars(@RequestParam(value = "count", required = false) Integer countVar, ModelMap model) {
        model.addAttribute("carsKey", carService.printSomeCars(countVar));
        return "cars";
    }

/*
    @GetMapping(value = "/cars?count=${countVar}")
    public String printSomeCars(@PathVariable("countVar")int count, ModelMap model) {
        model.addAttribute("cars", carService.printSomeCars(count));
        return "cars";
    }
*/


//    @GetMapping(value = "/cars")
//    public String printAllCars(ModelMap model) {
//        model.addAttribute("cars", carService.printSomeCars(5));
//        return "cars";
//    }



/*
    @GetMapping(value = "/cars?count=${x}")
    public String printCar(@PathVariable("x") int x, ModelMap model) {
        model.addAttribute("cars_count", carService.printSomeCars(x));
        return "cars_count";
    }
*/

//    @GetMapping(value = "cars/")
//    public String printCar(Model model, @RequestParam("count") int count) {
//        model.addAttribute("count", carService.printSomeCars(count));
//        return "cars_count";
//    }


}
