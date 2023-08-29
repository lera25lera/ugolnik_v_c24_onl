package lesson_8;

public class Rectangle extends Figure implements Cloneable{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return (a+b)*2;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
