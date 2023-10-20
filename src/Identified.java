public abstract class Identified {
    private int id;
    public Identified(int id) {
        this.id = id;
    }
    public void display() {
        System.out.println(id);
    }
}
