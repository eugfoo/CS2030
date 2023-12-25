class Circle {
    private final Point center;
    private final double radius;
    private final double epsilon = 1E-15;

    Circle(Point center, double rad){
        this.center = center;
        this.radius = rad;
    }
  
    private double getRad(){
        return this.radius;
    }

    private Point getCenter(){
        return this.center;
    }
    
    boolean contains(Point point){
        return this.center.distanceTo(point) < this.radius + epsilon;
    }
    public String toString(){
        String pointString = String.format("point (%.3f, %.3f)", this.center.getx(), this.center.gety());
        return "circle of radius " + this.radius + " centred at " + pointString;
    }
}
