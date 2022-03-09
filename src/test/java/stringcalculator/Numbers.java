package stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    private static final int ZERO = 0;
    private final List<Number> numbers;

    public Numbers(){
        numbers = new ArrayList<>();
    }

    public void addNumbersFromToken(String[] token){
        Arrays.stream(token).map(Integer::parseInt)
                .map(Number::new)
                .forEach(number -> numbers.add(number));
    }

    public int calculate() {
        return numbers.stream()
            .map(Number::getValue)
            .reduce(0, Integer::sum);
    }
}
