import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pet d1 = new Dog();
        // d1.fetch(); // won't compile
        // Pet p = new Pet(); // will not compile
        d1.speak();

        Dog d2 = new Dog();
        Cat cat = new Cat();
        Pet bird = new Bird();

        List<Pet> pets =
                new ArrayList<>(Arrays.asList(d1, d2, cat, bird));
        for (Pet pet: pets) {
            pet.speak();
            // pet.fetch(); // won't compile
        }




    }
}
