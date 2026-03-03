package pro.sorokovsky;

public class Detail extends BaseEntity {
    private String name;
    private double weight;

    public Detail(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ValidationException {
        if (name == null || name.isBlank()) {
            throw new ValidationException("Назва деталі повинна бути.");
        }
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws ValidationException {
        if (weight < 0) {
            throw new ValidationException("Вага деталі повинна бути додатною.");
        }
        this.weight = weight;
    }

    public void printInfo() {
        System.out.printf("Деталь: %s, Вага: %.2f\n", name, weight);
    }
}
