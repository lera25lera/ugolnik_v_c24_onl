package lesson_12;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("D:\\Java\\intelliJproject\\new\\resources\\romeo.txt");
        File outputFile = new File("D:\\Java\\intelliJproject\\new\\resources\\result_text.txt");
        String longest_word = "";
        String current;
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNext()) {
                current = sc.next();
                if (current.length() > longest_word.length()) {
                    longest_word = current;
                }
            }
            System.out.println("\n" + longest_word + "\n");
            fileWriter.write(longest_word);
            fileWriter.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Error when closing file " + exception.getMessage());
        }
    }
}
