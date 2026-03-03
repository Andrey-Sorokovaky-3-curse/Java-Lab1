package pro.sorokovsky;

public class Node extends Detail {
    private int connectionCount;

    public Node(String name, double weight, int connectionCount) {
        super(name, weight);
        this.connectionCount = connectionCount;
    }

    public int getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) throws ValidationException {
        if (connectionCount <= 0) {
            throw new ValidationException("Кількість з'єднань вузла повинна бути додатною.");
        }
        this.connectionCount = connectionCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Кількість з'єднань вузла: %d\n", connectionCount);
    }
}
