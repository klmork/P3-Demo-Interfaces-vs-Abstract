public class Dog extends Pet implements Robot {
    private int id;
    public Dog(int a, int f, int id) {
        super(a, f);
        this.id = id;
    }
    public void speak() {
        System.out.println("bark");
    }


    public void sit() {
        System.out.println("sitting");
    }

    public void beep() {
        System.out.println("beep");
    }
    public int getId() {
        return id;
    }
}
