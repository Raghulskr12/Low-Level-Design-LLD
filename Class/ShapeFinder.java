class Shape{
    protected String name;

    Shape(String name)
    {
        this.name=name;
    }

    public double area()
    {
        return 0;
    }
    public double perimeter()
    {
        return 0;
    }

    public void describe()
    {
        System.out.println("Shape :" + name);
        System.out.println("Area :" + area());
        System.out.println("Perimeter :" + perimeter());
    }
}


class Circle extends Shape{

    private double radius;

    Circle(String name,int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape
{
    private double width;
    private double height;

    Rectangle(String name,double width,double height ) {
        super(name);
        this.height=height;
        this.width=width;
    }

    public double area()
    {
        return width * height;
    }
    public double perimeter()
    {
        return 2* (width + height);
    }
}
class ShapeFinder
{
    public static void main() {
        Shape s1 = new Circle("Circle",5);
        s1.describe();
        System.out.println(s1.area());
    }
}