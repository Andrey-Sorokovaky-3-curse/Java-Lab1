package pro.sorokovsky;

public class Mechanism extends Detail{
    private String type;
    public Mechanism(String name, double weight, String type) throws ValidationException {
        super(name, weight);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws ValidationException {
        if (type == null || type.isBlank()) {
            throw new ValidationException("Тип механізму не може бути порожнім.");
        }
        this.type = type;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Тип механізму: %s\n", type);
    }
}
