import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pet p = new Dog(2);
        p.speak();

        Pet p2 = new Dog(2);
        



        Pet robot = new RobotDog(2, 2);
        List<Pet> pets = new ArrayList<>(Arrays.asList(p, p2, robot));
        for (Pet pet: pets) {
            pet.speak();
            pet.randomMethod();
            pet.randomToo();
            if (pet instanceof Electronic)
                ((Electronic)robot).charge(2);
            if (pet instanceof Dog)
                ((Dog)pet).coolDogMethod();
        }

    }
}
