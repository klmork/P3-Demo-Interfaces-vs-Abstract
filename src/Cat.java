public class Cat implements Pet{
    public void speak() {
        System.out.println("meow");
    }
    public int  eat(int amount) {
        return amount + 1;
    }
}
