package pro.sorokovsky;

import pro.sorokovsky.validation.ValidationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть максимальний обʼєм баку(літри).");
            long maxFull = scanner.nextLong();
            System.out.print("Введіть назву потягу.");
            String name = scanner.next();
            System.out.print("Введіть марку експресу.");
            String mark = scanner.next();
            Transport car = new Car(maxFull);
            Transport train = new Train(name);
            Transport express = new Express(name, mark);
            car.printInfo();
            train.printInfo();
            express.printInfo();
            System.out.println("Введіть число a.");
            long a = scanner.nextLong();
            System.out.println("Введіть число b.");
            long b = scanner.nextLong();
            System.out.println("Car a / b = " + car.divide(a, b));
            System.out.println("Train a / b = " + train.divide(a, b));
            System.out.println("Express a / b = " + express.divide(a, b));
        } catch (ValidationException exception) {
            System.out.println(exception.getMessage());
        } catch (InputMismatchException _) {
            System.out.println("Не коректне значення");
        }
    }
}
