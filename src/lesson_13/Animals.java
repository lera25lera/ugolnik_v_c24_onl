package lesson_13;

import java.util.LinkedList;

public class Animals {
    private LinkedList<String> animal;

    public Animals() {
        animal = new LinkedList<>();
    }

    public void addAnimal(String name) {
        animal.addFirst(name);
        System.out.println(animal.toString());
        ;
    }

    public void removeAnimal() {
        if (!animal.isEmpty()) {
            animal.removeLast();
            System.out.println(animal.toString());
        } else {
            System.out.println("Пустой список, удаление невозможно");
        }
    }
}
