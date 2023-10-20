public interface Robot extends Identified {
    default void beep() {
        System.out.println("beep");
    }
}
