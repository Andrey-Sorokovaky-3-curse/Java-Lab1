package pro.sorokovsky.validation;

public class MarkException extends ValidationException {
    public MarkException() {
        super("Марка експреса має бути");
    }
}
