public class RobotDog extends Pet implements Electronic {
    private int battery;

    public RobotDog(int b, int r) {
        super(r);
        this.battery = b;
    }

    public void speak() {
        System.out.println("Hello");
    }

    public void charge(int i) {
        battery += i;
    }

    public void randomToo() {
        super.randomToo();
        Electronic.super.randomToo();
        System.out.println("robotDog");
    }
}
