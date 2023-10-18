public class Cat implements Pet {
    private int amountFed;
    private final int fullAt;
    private final int id;
    public Cat(int amountFed, int fullAt, int id) {
        this.amountFed = amountFed;
        this.fullAt = fullAt;
        this.id = id;
    }
    public void speak() {
        System.out.println("meow");
    }


    public void display() {
        System.out.println(id);
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
