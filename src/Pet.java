public abstract class Pet {
    // implied that its public
    // ; -> not defined / implemented
    abstract void speak();
    abstract int getRandom();
    public void randomMethod() {
        System.out.println(getRandom() + " cool cool cool");

    }

    public void randomToo() {
        System.out.println("pet");
    }
}
