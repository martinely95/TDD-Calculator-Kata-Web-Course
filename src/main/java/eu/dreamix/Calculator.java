package eu.dreamix;

public class Calculator {
    public int add(String inputString) {
        if (inputString.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(inputString);
        }
    }
}
