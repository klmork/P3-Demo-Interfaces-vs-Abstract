public class Dog implements Pet {
    private int amountFed;
    private final int fullAt;
    private final int id;
    public Dog(int a, int n, int id) {
        amountFed = a; fullAt = n; this.id = id;
    }
    public void speak() {
        System.out.println("bark");
    }
    public boolean eat(int amount) {
        amountFed += amount;
        return amountFed > fullAt;
    }
    public void display() {
        System.out.println(id);
    }

    public void sit() {
        System.out.println("sitting");
    }
}
