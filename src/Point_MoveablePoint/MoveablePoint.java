package Point_MoveablePoint;

public class MoveablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y) {
        super(x, y);
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = {this.xSpeed,this.ySpeed};
        return array;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return (super.toString() + "{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}');
    }
    public String move(){
        float x = getX() + xSpeed;
        float y = getY() + ySpeed;
        setXY(x,y);
        return "newPoint" +
                "x=" + getX() +
                ", y= " + getY() ;
    }

}
