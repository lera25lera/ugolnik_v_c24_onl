package lesson_7;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Clinica {
    public static Therapist therapist = new Therapist("therapist", "Robert");
    public static Surgeon surgeon = new Surgeon("surgeon","Artem");
    public static Dentist dentist = new Dentist("dentist","Karlos");

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //задание 1 - поликлиник
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Write your name:");
        Patient patient = new Patient(scanner.nextLine());
        System.out.println("Write your plan (int):");
        patient.setPlan(scanner.nextInt());
        System.out.println("Пациент до назначения лечения: " + patient.toString());
        System.out.println("Go to therapist");
        therapist.reabilitation(patient);
        System.out.println("Пациент после назначения лечения: " +patient.toString());

        //задание 2 - изменить private поле без сетера
        System.out.println("Задание 2");
        Apple apple = new Apple();
        System.out.println(apple.toString());
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "orange");
        System.out.println(apple.toString());
    }
}
