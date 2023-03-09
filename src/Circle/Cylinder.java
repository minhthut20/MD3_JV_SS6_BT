package Circle;

public class Cylinder extends Circle{
    float height,volume;

    public Cylinder() {
    }

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
        calVolume();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void calVolume(){
        this.volume = super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
