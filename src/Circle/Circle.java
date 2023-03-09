package Circle;

public class Circle {
    float radius,area;
    String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
        calArea();
    }

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        return area;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calArea(){
        this.area= (float) (Math.pow(radius,2)*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}
