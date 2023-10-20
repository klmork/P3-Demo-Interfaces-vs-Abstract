public class Cat {
    private int amountFed;
    private final int fullAt;
    private final int id;

    public Cat(int a, int f, int id){
        this.amountFed = a;
        this.fullAt = f;
        this.id = id;
    }

    public void speak() {
        System.out.println("meow");
    }


    public boolean eat(int amount) {
        amountFed += amount;
        return amountFed > fullAt;
    }

    public void display() {
        System.out.println(id);
    }
}
