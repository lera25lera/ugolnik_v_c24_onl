package lesson_8;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        //1
        Printable director = new Director();
        Accountent accountent = new Accountent();
        Worker worker = new Worker();

        List<Printable> list = new ArrayList<>();
        list.add(director);
        list.add(worker);
        list.add(accountent);
        for(Printable i: list){
            i.print();
            //System.out.println(i);
        }

        //2
        Figure[] figures = new Figure[]{new Circle(5.0), new Triangle(5, 8, 5), new Rectangle(5, 10), new Circle(5.0), new Triangle(5, 8, 5)};
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            double perimetr = figures[i].getPerimetr();
            System.out.println("area: " + figures[i].getArea());
            System.out.println("perimetr: " + perimetr);
            sum += perimetr;
            System.out.println("sum: " + sum);
        }
        System.out.println("sum= " + sum);

        Triangle triangle = new Triangle(5,4,7);
        Triangle triangle1 = (Triangle) triangle.clone();
        System.out.println(triangle);
        System.out.println(triangle1);
        System.out.println(triangle.equals(triangle1));
    }
}
