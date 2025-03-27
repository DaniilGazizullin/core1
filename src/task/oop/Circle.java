package task.oop;

public class Circle extends Figure {

  public static void main(String[] args) {
    Circle circle=new  Circle("Круг1, площадь : ",6);
    System.out.println(circle.getName()+circle.calculateArea());
  }
  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public String getName() {
    return "Круг:" + name;
  }

}