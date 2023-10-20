import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(0, 5, 1);
        Cat cat1 = new Cat(2, 2, 1);
        Roomba roomba1 = new Roomba(1);

        // try to never do this
        List<Object> entities = new ArrayList<>(Arrays.asList(dog1, cat1, roomba1));
        for (Object entity: entities) {
            if (entity instanceof Dog) {
                ((Dog)entity).display();
                ((Dog)entity).speak();
            } else if (entity instanceof Cat ) {
                ((Cat)entity).display();
                ((Cat)entity).speak();
            } else if (entity instanceof Roomba){
                ((Roomba)entity).display();
            }
        }

    }
}
