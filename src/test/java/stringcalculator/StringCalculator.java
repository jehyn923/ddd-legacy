package stringcalculator;

import org.springframework.util.StringUtils;

public class StringCalculator {
    private static final StringParser stringParser = new StringParser();
    private final Numbers numbers;
    private String[] token;

    public StringCalculator() {
        numbers = new Numbers();
    }

    private Boolean checkIfNull(String text) {
        if (StringUtils.hasText(text)) {
            return false;
        }
        return true;
    }

    public int add(String text) {
        if (checkIfNull(text)) {
            return 0;
        }
        token = stringParser.splitStringToToken(text);
        numbers.addNumbersFromToken(token);
        return numbers.calculate();
    }
}
