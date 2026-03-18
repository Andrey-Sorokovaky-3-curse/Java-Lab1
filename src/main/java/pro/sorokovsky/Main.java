package pro.sorokovsky;

import pro.sorokovsky.validation.ValidationException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            long maxFull = BuilderOptions.geyMaxFull();
            String name = BuilderOptions.getName();
            System.out.println("Введіть марку експресу: ");
            String mark = scanner.nextLine();
            Transport car = new Car(maxFull);
            Transport train = new Train(name);
            Transport express = new Express(name, mark);
            car.printInfo();
            train.printInfo();
            express.printInfo();
            long a = BuilderOptions.getLong("число a");
            long b = BuilderOptions.getLong("число b");
            System.out.println("Car a / b = " + car.divide(a, b));
            System.out.println("Train a / b = " + train.divide(a, b));
            System.out.println("Express a / b = " + express.divide(a, b));
        }
        catch (ValidationException | NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
