import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pet dog1 = new Dog(0, 5, 1);
        //dog1.sit(); // won't compile
        Dog dog2 = new Dog(0, 10, 2);
        dog2.sit(); // does compile
        Pet cat1 = new Cat(2, 2, 1);

        List<Pet> pets = new ArrayList<>(Arrays.asList(dog1, dog2, cat1));

        for (Pet pet: pets) {
            pet.speak(); // does compile
            //pet.sit(); // does not compile
            pet.sayPet();
            // TODO: call sit on all dog objects
            // Option 1
            if (pet instanceof Dog) {
                // Casting 1
                ( (Dog)pet).sit();
            }
            // Option 2
            if (pet.getClass() == Dog.class) {
                // Casting 2
                Dog dog = (Dog) pet;
                dog.sit();
            }





        }

    }
}
