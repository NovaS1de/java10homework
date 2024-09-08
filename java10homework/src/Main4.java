// Абстрактный класс «Фигура»
abstract class Shape {
    public abstract double area(); // Метод для подсчета площади
}

// Класс «Прямоугольник»
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Класс «Круг»
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Класс «Прямоугольный треугольник»
class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Класс «Трапеция»
class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        return ((base1 + base2) * height) / 2;
    }
}

// Пример использования
public class Main4 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Circle(3);
        shapes[2] = new RightTriangle(4, 3);
        shapes[3] = new Trapezoid(3, 4, 5);

        for (Shape shape : shapes) {
            System.out.println("Площадь фигуры: " + shape.area());
        }
    }
}
