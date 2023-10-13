import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pet d1 = new Dog();
        d1.speak();

        Pet d2 = new Dog();
        // d2.sit(); // will not compile
        Cat c = new Cat();
        Bird b = new Bird();
        List<Pet> pets =
                new ArrayList<>(Arrays.asList(d1, d2, c, b));
        for (Pet pet: pets) {
            pet.speak();
            // pet.sit(); // will not compile

        }



    }
}
