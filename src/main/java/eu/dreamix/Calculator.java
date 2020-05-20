package eu.dreamix;

import java.util.Arrays;

public class Calculator {
    public int add(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        } else {
            char separator = ',';
            if (inputString.startsWith("//")) {
                separator = inputString.charAt(2);
                inputString = inputString.substring(5);
            }
            String[] tokens = inputString.split("[" + separator + "\\n]");
            return Arrays.stream(tokens)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        }
    }
}
