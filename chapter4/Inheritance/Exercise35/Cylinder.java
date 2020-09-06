public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
    // surface area
    /* 
    @Override
    public double getArea() {
        return 2 * super.getArea() * 2 * Math.PI * super.getRadius() * this.height;
    }
    */

}
