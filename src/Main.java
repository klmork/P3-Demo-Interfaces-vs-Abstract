import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(0, 5, 1);
        Cat cat1 = new Cat(2, 2, 1);
        Roomba roomba1 = new Roomba(1);

        // try to never do this
        List<Object> items = new ArrayList<>(Arrays.asList(dog1, cat1, roomba1));
        for (Object o: items) {
            if (o instanceof Dog) {
                ((Dog)o).display();
                ((Dog)o).speak();
            } else if (o instanceof Cat ) {
                ((Cat)o).display();
                ((Cat)o).speak();
            } else if (o instanceof Roomba){
                ((Roomba)o).display();
            }
        }

    }
}
