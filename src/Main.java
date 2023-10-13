import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog p = new Dog();
        p.speak();

        Dog p2 = new Dog();

        List<Dog> dogs = new ArrayList<>(Arrays.asList(p, p2));
        for (Dog dog: dogs) {
            dog.speak();
        }

    }
}
