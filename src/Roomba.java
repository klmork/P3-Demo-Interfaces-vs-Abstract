public class Roomba {
    private final int id;

    public Roomba(int id) {  this.id = id;  }
    public void beep() {
        System.out.println("beep");
    }
    public void display() {
        System.out.println(id);
    }
}
