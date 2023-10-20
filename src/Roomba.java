public class Roomba implements Identified, Robot {
    private final int id;
    public Roomba(int id) {  this.id = id;  }
    public int getId() {
        return id;
    }
}
