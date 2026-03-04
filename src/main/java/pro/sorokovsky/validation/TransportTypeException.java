package pro.sorokovsky.validation;

public class TransportTypeException extends ValidationException{
    public TransportTypeException() {
        super("Тип транспорту некоректний.");
    }
}
