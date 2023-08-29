package lesson9;

public class Dog implements Animal {
    private static Dog INSTANCE;

    private Dog() {
    }

    public static Dog getInstance(){
        if (INSTANCE == null){
           INSTANCE = new Dog();
        }
        return INSTANCE;
    }

    @Override
    public void voice() {
        System.out.println("собака лает");
    }

    @Override
    public void eat(String food) {
        String mes = "Meat".equals(food) ? ("Люблю " + food) : ("Не люблю " + food);
        System.out.println(mes);
    }
}
