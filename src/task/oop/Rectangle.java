package task.oop;

public class Rectangle extends Figure {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Прямоугольник1", 123, 123);
        System.out.println(rectangle.getName() + "площадь:" + rectangle.calculateArea());
    }

    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Прямоугольник: " + name;
    }
}