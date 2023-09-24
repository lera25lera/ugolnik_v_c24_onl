package lesson_13;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//При решении использовать коллекции
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через запятую, например '5, 2, 7'");
        if (scanner.hasNextLine()) {
            task1(scanner.nextLine());
        } else {
            System.out.println("Вы не ввели набор чисел");
        }

//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//объекта этого класса в main методе другого класса.
        Animals animals = new Animals();
        animals.addAnimal("Dog");
        animals.removeAnimal();

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе

        List<Students> students = new ArrayList<>();
        students.add(new Students("Alex", "4A", 2, new ArrayList<>(List.of(5, 7, 8))));
        students.add(new Students("Michael", "5A", 2, new ArrayList<>(List.of(2, 3, 1))));
        students.add(new Students("Pavel", "6A", 3, new ArrayList<>(List.of(5, 7, 2))));
        students.add(new Students("Andrew", "4A", 4, new ArrayList<>(List.of(6, 7, 8))));
        int len = students.size();
        for (int i = 0; i < len; i++)
         {
            if (students.get(i).removeOrUpdate() == 1) {
                students.remove(i);
                i--;
                len--;
            }
        }
        printStudents(students, 3);
    }

    public static void task1(String str) {
        String[] strArr = str.split(", ");
        Set<Character> characterSet = new HashSet<>();
        for (String s : strArr) {
            for (char literal : s.toCharArray()) {
                characterSet.add(literal);
            }
        }
        System.out.println(characterSet);
    }

    public static void printStudents(List<Students> students, int course){
        System.out.println("На " + course + " курсе обучаются: ");
        for (Students student : students
             ) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
