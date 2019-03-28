package at.sadra.java.junittest;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public Integer sum(Integer firstNumber, Integer secondNumber) {
        return Math.addExact(firstNumber, secondNumber);
    }

    public Integer sub(Integer firstNumber, Integer secondNumber) {
        return Math.subtractExact(firstNumber, secondNumber);
    }

    public Integer mul(Integer firstNumber, Integer secondNumber) {
        return Math.multiplyExact(firstNumber, secondNumber);
    }

    public Integer div(Integer firstNumber, Integer secondNumber) {
        return Math.floorDiv(firstNumber, secondNumber);
    }

    public Integer abs(Integer number) {
        return Math.abs(number);
    }
}
