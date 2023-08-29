package lesson9;

public class Main {
    public static void main(String[] args) {
    //Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    //Переопределить методы voice(), eat(String food) чтобы они выводили верную
    //информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Tiger tiger = new Tiger();
        tiger.eat("Meat");
        tiger.eat("Grass");
        tiger.voice();

        Rabbit rabbit = new Rabbit();
        rabbit.eat("Grass");
        rabbit.voice();
        Dog.getInstance();

        Dog dog = Dog.getInstance();
        dog.eat("Grass");
    }
}
