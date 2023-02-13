public interface Electronic {
    void charge(int i);

    default void randomToo() {
        System.out.println("electronic");
    }
}