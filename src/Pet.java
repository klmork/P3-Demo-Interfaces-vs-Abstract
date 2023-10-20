public abstract class Pet extends Identified {
    private int amountFed;
    private final int fullAt;

    public Pet(int a, int f, int id) {
        super(id);
        this.amountFed = a;
        this.fullAt = f;
    }
    public boolean eat(int amount) {
        amountFed += amount;
        return amountFed > fullAt;
    }

    abstract void speak();


}
