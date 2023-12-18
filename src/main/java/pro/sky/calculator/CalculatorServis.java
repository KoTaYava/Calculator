package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServis implements CalculaytorServiceInterface {
    @Override
    public String calculator() {
        return "<p >Добро пожаловать в калькулятор</p>";
    }
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public  int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

}
