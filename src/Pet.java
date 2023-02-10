public interface Pet {
    // implied that its public
    // ; -> not defined / implemented
    void speak();
    int getRandom();
    default void randomMethod() {
        System.out.println(getRandom() + " cool cool cool");

    }
    default void randomToo() {
        System.out.println("random");
    }

}
