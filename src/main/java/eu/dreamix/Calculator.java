package eu.dreamix;

import java.util.Arrays;

public class Calculator {
    public int add(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        } else if (inputString.contains(",")) {
            String[] tokens = inputString.split(",");
            return Arrays.stream(tokens)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        } else {
            return Integer.parseInt(inputString);
        }
    }
}
