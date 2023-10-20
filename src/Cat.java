public class Cat extends Pet {
    private int id;
    public Cat(int a, int f, int id){
        super(a, f);
        this.id = id;
    }

    public void speak() {
        System.out.println("meow");
    }
    public int getId() {
        return id;
    }
}
