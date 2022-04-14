package baseball;

import java.util.Scanner;

public class StringCalculator {
    private String[] values;

    public void calculate() {

    }

    public void getString() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        values = value.split(" ");
    }
}
