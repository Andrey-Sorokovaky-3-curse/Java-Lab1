package pro.sorokovsky;

import pro.sorokovsky.validation.ValidationException;

public class Train extends Transport {
    private String name;
    public Train(String name) throws ValidationException {
        super("Потяг");
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Навзва потягу: " + getName() + ".");
    }
}
