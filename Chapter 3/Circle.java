public class Circle {
    
     double radius;
     double diameter;
     double area;

    public Circle() {
        this.radius = 1.0;
        this.diameter = 2 * radius;
        this.area = 3.14159 * radius * radius;
    }
    
    public void setRadius(double rad) {
        this.radius = rad;
        this.diameter = 2 * radius;
        this.area = 3.14159 * radius * radius;
    }

    
    public double getRadius() {
        return this.radius;
    }

    
    public double getDiameter() {
        return this.diameter;
    }

    
    public double getArea() {
        return this.area;
    }
}
