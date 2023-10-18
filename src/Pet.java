public interface Pet {
    void speak();
    // TODO: add default method to print something generic
    default void sayPet() {
        System.out.println("I am a " + this.getClass());
    }

    default boolean eat(int amount) {
        setAmount(amount);
        return getAmountFed() > getFullAt();
    }
    void setAmount(int a);
    int getAmountFed();
    int getFullAt();

    // TODO: add default methods to remove duplication

}
