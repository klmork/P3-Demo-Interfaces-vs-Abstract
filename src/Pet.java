public interface Pet extends Identified {

    default boolean eat(int amount) {
        setAmountFed(amount);
        return getAmountFed() > getFullAt();
    }

    void speak();
    int getAmountFed();
    int getFullAt();
    void setAmountFed(int amount);


}
