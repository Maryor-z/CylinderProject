public class Cylinder1 extends Circle {

    private double height, radius, volume;

    public Cylinder1(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){

        return (getArea()*height);
    }
}
