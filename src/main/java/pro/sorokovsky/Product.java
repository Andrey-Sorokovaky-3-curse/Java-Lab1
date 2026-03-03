package pro.sorokovsky;

public class Product extends Mechanism {
    private String serialNumber;

    public Product(String name, double weight, String type, String serialNumber) throws ValidationException {
        super(name, weight, type);
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) throws ValidationException {
        if (serialNumber == null || serialNumber.length() < 5) {
            throw new ValidationException("Серійний номер виробу повинен містити щонайменше 5 символів.");
        }
        this.serialNumber = serialNumber;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Серійний номер виробу: %s\n", serialNumber);
    }
}
