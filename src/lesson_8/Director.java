package lesson_8;

public class Director implements Printable {
    private String position = "Director";
    @Override
    public void print() {
        System.out.println(this.position);
    }
}

