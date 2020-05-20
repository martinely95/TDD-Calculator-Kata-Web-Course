package eu.dreamix;

import java.util.Arrays;

public class Calculator {
    public int add(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        } else {
            String[] tokens = inputString.split("[,\\n]");
            return Arrays.stream(tokens)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        }
    }
}
