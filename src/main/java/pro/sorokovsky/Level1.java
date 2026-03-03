package pro.sorokovsky;

public class Level1 {
    static void main(String[] args) {
        try {
            Detail detail = new Detail("Цвях", 0.5);
            detail.printInfo();
            System.out.printf("Результат 5 / 3 = %4f\n", detail.divide(5, 3));
            System.out.printf("Результат 5 / 0 = %4f\n", detail.divide(5, 0));
        } catch (ValidationException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
