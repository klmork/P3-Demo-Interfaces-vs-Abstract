public class Dog extends Pet{

    public Dog(int r) { super(r); }
    public void speak() {
        System.out.println("bark");
    }

    public void coolDogMethod() {
        System.out.println("hi");
    }

    public void randomToo() {
        super.randomToo();
        System.out.println("Dog");
    }

}
