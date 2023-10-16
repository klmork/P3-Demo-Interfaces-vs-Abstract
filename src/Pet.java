public interface Pet {
    void speak();
    boolean eat(int amount);
    // TODO: add default method to print something generic
    default void sayPet() {
        System.out.println("I am a " + this.getClass());
    }



    // TODO: add default methods to remove duplication

}
