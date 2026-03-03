package pro.sorokovsky;

import java.util.Scanner;

public class Level2 {
    static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        try {
            System.out.print("Введіть назву деталі: ");
            String name = scanner.nextLine();
            System.out.print("Введіть вагу деталі: ");
            double weight = Double.parseDouble(scanner.nextLine());
            Detail detail = new Detail(name, weight);
            detail.printInfo();
            System.out.print("Введіть перше число: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Введіть друге число: ");
            double b = Double.parseDouble(scanner.nextLine());

            double result = detail.divide(a, b);
            System.out.println("Результат ділення: " + result);
        } catch (DivisionByZeroException exception) {
            System.err.println("Помилка: " + exception.getMessage());
        } catch (NumberFormatException exception) {
            System.err.println("Помилка введення: невірний формат числа!");
        } catch (Exception exception) {
            System.err.println("Невідома помилка: " + exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}
