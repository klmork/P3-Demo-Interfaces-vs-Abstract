public class Dog {
    private int amountFed;
    private final int fullAt;
    private final int id;

    public Dog(int a, int f, int id) {
        this.amountFed = a;
        this.fullAt = f;
        this.id = id;
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

    public void beep() {
        System.out.println("beep");
    }
}
