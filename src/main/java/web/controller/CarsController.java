package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String index(@RequestParam(value = "count", required = false) String countString, Model model) {
        if (countString == null) {
            model.addAttribute("cars", carService.getCarList());
        } else {
            int count = 0;
            try {
                count = Integer.parseInt(countString);
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат параметра");
            }
            if (count <= 0) {
                model.addAttribute("cars", "invalid request parameters");
            } else {
                model.addAttribute("cars", carService.getLimitCarList(count));
            }
        }
        return "cars";
    }

}
