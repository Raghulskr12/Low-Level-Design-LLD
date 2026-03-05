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

class ShapeFinder
{
    public static void main() {
        Shape s1 = new Shape("Circle");
        s1.describe();
    }
}