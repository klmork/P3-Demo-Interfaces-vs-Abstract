public abstract class Pet {
    private int random;

    public Pet(int r) { this.random = r; }
    abstract void speak();
    public void randomMethod() {
        System.out.println(random + " cool cool cool");

    }

    public void randomToo() {
        System.out.println("pet");
    }
}
