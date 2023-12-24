import java.lang.Math;

class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }
    
    public double distanceTo(Point q) {
        return Math.sqrt((q.x - this.x) * (q.x - this.x) + (q.y - this.y) * (q.y - this.y));
    }
    
    public Point midPoint(Point another){
        return new Point( (this.x + another.x) / 2.0, (this.y + another.y) / 2.0);
    }    
    
    public double angleTo(Point another){
        return Math.atan2(another.y - this.y, another.x - this.x);  
    }

    public Point moveTo(double angle, double dist){
        return new Point(this.x + dist * Math.cos(angle), this.y + dist * Math.sin(angle)); 
    }
    
    @Override
    public String toString(){
        String xValue = String.format("%.3f", this.x);
        String yValue = String.format("%.3f", this.y);
        return "point " + "(" + xValue + ", " + yValue + ")";
    }
}
