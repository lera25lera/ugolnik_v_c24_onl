package lesson_8;

public class Worker implements Printable{
    private String position = "Worker";
    @Override
    public void print() {
        System.out.println(this.position);
    }
}
