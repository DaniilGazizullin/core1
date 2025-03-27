package task.oop;


public class Triangle extends Figure {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Треугольник 1, площадь : ", 12, 10);
        System.out.println(triangle.getName() + triangle.calculateArea());
    }

    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public String getName() {
        return "Треугольник: " + name;
    }

}