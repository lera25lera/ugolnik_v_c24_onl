package lesson9;

public class Tiger implements Animal{

    @Override
    public void voice() {
        System.out.println("тигр рычит");
    }

    @Override
    public void eat(String food) {
        String mes = "Meat".equals(food) ? ("Люблю " + food) : ("Не люблю " + food);
        System.out.println(mes);
    }
}
