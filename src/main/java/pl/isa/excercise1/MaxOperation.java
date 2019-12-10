package pl.isa.excercise1;

import java.util.Collections;
import java.util.List;

public class MaxOperation implements MathOperation {

    @Override
    public Integer calculate(List<Integer> numbers) {
        return Collections.max(numbers);
    }

}