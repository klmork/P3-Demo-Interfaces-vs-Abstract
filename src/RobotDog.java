public class RobotDog extends Pet implements Electronic {
    private int battery;
    private int random;

    public RobotDog(int b, int r) {
        this.battery = b;
        this.random = r;
    }

    public void speak() {
        System.out.println("Hello");
    }

    public void charge(int i) {
        battery += i;
    }
    public int getRandom() { return random; }

    public void randomToo() {
        super.randomToo();
        Electronic.super.randomToo();
        System.out.println("robotDog");
    }
}
