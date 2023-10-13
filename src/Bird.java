public class Bird implements Pet{
    public void speak() {
        System.out.println("chirp");
    }
    public int eat(int amount) { return amount + 1; }

}
