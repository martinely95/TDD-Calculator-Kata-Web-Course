package eu.dreamix;

public class Calculator {
    public int add(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        } else if (inputString.contains(",")) {
            String[] tokens = inputString.split(",");
            return Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
        } else {
            return Integer.parseInt(inputString);
        }
    }
}
