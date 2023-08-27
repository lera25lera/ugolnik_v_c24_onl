package lesson_8;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(r,2);
    }
}
