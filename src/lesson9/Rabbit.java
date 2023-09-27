package lesson9;

public class Rabbit implements Animal {

    @Override
    public void voice() {
        System.out.println("кролит фыркает");
    }

    @Override
    public void eat(String food) {
        String mes = "Grass".equals(food) ? ("Люблю " + food) : ("Не люблю " + food);
        System.out.println(mes);
    }
}
