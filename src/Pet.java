public abstract class Pet implements Identified {
    private int amountFed;
    private final int fullAt;

    public Pet(int a, int f) {
        this.amountFed = a;
        this.fullAt = f;
    }
    public boolean eat(int amount) {
        amountFed += amount;
        return amountFed > fullAt;
    }

    abstract void speak();


}
