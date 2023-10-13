public class Dog implements Pet {

    public void speak() {
        System.out.println("bark");
    }
    public int eat(int amount) { return amount + 1; }
    public void fetch() { System.out.println("Fetch!"); }

}
