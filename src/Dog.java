public class Dog implements Robot, Pet {
    private int amountFed;
    private final int fullAt;
    private final int id;
    public Dog(int amountFed, int fullAt, int id) {
        this.amountFed = amountFed;
        this.fullAt = fullAt;
        this.id = id;
    }
    public void speak() {
        System.out.println("bark");
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
    public void setAmount(int a) {
        this.amountFed += a;
    }
    public int getAmountFed() {
        return amountFed;
    }
    public int getFullAt() {
        return fullAt;
    }

}
