public class Cat implements Pet {
    private int amountFed;
    private int fullAt;
    private int id;

    public Cat(int a, int f, int id){
        this.amountFed = a;
        this.fullAt = f;
        this.id = id;
    }

    public void speak() {
        System.out.println("meow");
    }
    public int getId() {
        return id;
    }
    public int getAmountFed() {
        return amountFed;
    }
    public int getFullAt() {
        return fullAt;
    }
    public void setAmountFed(int amount) {
        this.amountFed += amount;
    }
}
