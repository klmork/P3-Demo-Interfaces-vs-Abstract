public class Dog implements Pet, Robot {
   private int amountFed;
   private int fullAt;
    private int id;
    public Dog(int a, int f, int id) {
        this.amountFed = a;
        this.fullAt = f;
        this.id = id;
    }
    public void speak() {
        System.out.println("bark");
    }


    public void sit() {
        System.out.println("sitting");
    }

    public void beep() {
        System.out.println("beep");
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
