public interface Identified {
    default void display() {
        System.out.println(getId());
    }
    int getId();

}
