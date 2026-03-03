package pro.sorokovsky;

public class DivisionByZeroException extends ValidationException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
