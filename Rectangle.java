package bt01;

public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
    public void printInfo() {
        System.out.println("Rectangle Info:");
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("area: " + getArea());
        System.out.println("perimeter: " + getPerimeter());
    }
}
