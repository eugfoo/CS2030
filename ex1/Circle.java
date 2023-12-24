class Circle {
    private final Point center;
    private final double radius;

    Circle(Point center, double rad){
        this.center = center;
        this.radius = rad;
    }
  
    public double getRad(){
        return this.radius;
    }

    public Point getCenter(){
        return this.center;
    }
    
    public String toString(){
        String pointString = String.format("point (%.3f, %.3f)", this.center.getx(), this.center.gety());
        return "circle of radius " + this.radius + " centred at " + pointString;
    }
}
