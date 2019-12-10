package pl.isa.excercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> testData = List.of(1, 2, 5, 10, 3, 2, 9);

        MathOperation maxOperation = null;
        MathOperation minOperation = null;

        new Main().getResult(testData, maxOperation);
        new Main().getResult(testData, minOperation);
    }

    private void getResult(List<Integer> numbers, MathOperation mathOperation){
        Integer result = mathOperation.calculate(numbers);
        System.out.println("Wynik działania metody = " + result);
    }
}