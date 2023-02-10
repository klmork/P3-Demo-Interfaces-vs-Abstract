public class Dog  implements Pet{
    private int random;
    public Dog(int r) { random = r; }
    public void speak() {
        System.out.println("bark");
    }

    public void coolDogMethod() {
        System.out.println("hi");
    }

    public int getRandom() { return random; }

    public void randomToo() {
        System.out.println("pet");
        System.out.println("Dog");
    }

}
