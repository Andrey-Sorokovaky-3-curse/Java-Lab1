package pro.sorokovsky;

import pro.sorokovsky.validation.NotPositiveNumberException;
import pro.sorokovsky.validation.ValidationException;

import java.util.Scanner;

public class BuilderOptions {
    private static boolean ok = false;
    public static long geyMaxFull() {
        ok = false;
        while (!ok) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введіть максимальний обʼєм баку(літри): ");
                long maxFull = Long.parseLong(scanner.nextLine());
                if (maxFull <= 0) {
                    throw new NotPositiveNumberException("обʼєм баку");
                }
                return maxFull;
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage());
                System.out.println("Спробуйье ще");
                ok = false;
            } catch (NumberFormatException exception) {
                System.out.println("Некоректні дання, спробуйте ще.");
                ok = false;
            }
        }
        return 0;
    }

    public static String getName() {
        ok = false;
        while (!ok) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введіть назву потягу: ");
                String name = scanner.next();
                if (name == null || name.isEmpty()) {
                   throw  new ValidationException("Назва має бути");
                }
                return name;
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage());
                System.out.println("Спробуйье ще");
                ok = false;
            }
        }
        return "";
    }
}
