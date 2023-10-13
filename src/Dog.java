public class Dog implements Pet {
    public void speak() {
        System.out.println("bark");
    }
    public int eat(int amount) {
        return amount + 2;
    }
    public void sit() {
        System.out.println("Good dog");
    }

}
