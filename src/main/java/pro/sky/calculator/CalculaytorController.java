package pro.sky.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculaytorController {
    private final CalculaytorServicelmpl calculaytorService;

    public CalculaytorController(CalculaytorServicelmpl calculaytorService) {
        this.calculaytorService = calculaytorService;

    }

    @RequestMapping()
    public String calculator() {
        return calculaytorService.calculator();
    }

    @RequestMapping(path = "/plus")
    public String plus(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ввидите число";
        }
        int result = calculaytorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;

    }

    @RequestMapping(path = "/minus")
    public String minus(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ввидите число";
        }
        int result = calculaytorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @RequestMapping(path = "/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ввидите число";
        }
        int result = calculaytorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @RequestMapping(path = "/divide")
    public String divide(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ввидите число";
        } else if (num2 == 0) {
            return "На ноль делить нельзя";

        }
        int result = calculaytorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

}







