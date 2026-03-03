package pro.sorokovsky;

abstract public class BaseEntity {
    public abstract void printInfo();

    public abstract String getName();

    public final double divide(double a, double b) throws ValidationException {
        if (b == 0) {
            throw new DivisionByZeroException("Помилка: Ділення на нуль!");
        }
        return a / b;
    }
}
