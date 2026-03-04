package pro.sorokovsky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        List<BaseEntity> entities = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                entities.add(new Detail("Гвинт", 0.1));
                entities.add(new Mechanism("Редуктор", 5.5, "Циліндричний"));
                entities.add(new Product("Двигун", 120.0, "Електричний", "SN12345"));
                entities.add(new Node("Кронштейн", 2.3, 4));

            } catch (ValidationException exception) {
                System.err.println("Помилка створення об'єкта: " + exception.getMessage());
            }
            System.out.println("\nІнформація про об'єкти:");
            for (BaseEntity entity : entities) {
                entity.printInfo();
                System.out.println("---");
            }
            System.out.print("Введіть перше число: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Введіть друге число: ");
            double b = Double.parseDouble(scanner.nextLine());

            for (BaseEntity entity : entities) {
                System.out.printf("Результат ділення для %s = %.2f%n", entity.getName(), entity.divide(a, b));
            }
        } catch (ValidationException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Помилка введення: невірний формат числа!");
        }
    }
}
