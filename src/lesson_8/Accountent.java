package lesson_8;

public class Accountent implements Printable{
    private String position = "Accountent";
    @Override
    public void print() {
        System.out.println(this.position);
    }
}