double epsilon = 1E-15;

Circle  createUnitCircle(Point p, Point q){
    Point midpoint = p.midPoint(q);	
    double distBetween = Math.sqrt(1 - Math.pow(midpoint.distanceTo(q), 2)); 
    Point center = midpoint.moveTo(midpoint.angleTo(q) + Math.PI / 2, distBetween);

    return new Circle ( center, 1 );

}

int findMaxDiscCoverage(ImList<Point> points){
    int maxCoverage = 0;
    for(int i = 1; i < points.size(); i++){
        for(int j = 0; j + i < points.size(); j++){
            if(points.get(j).distanceTo(points.get(i+j)) < 2.0 + epsilon && points.get(j).distanceTo(points.get(i+j)) > 0){
                Circle cir = createUnitCircle(points.get(j), points.get(j+i));
                int coverage = 0;
                for (Point point : points){
                    if (cir.contains(point)){
                            coverage += 1;
                    }
                }

                if (coverage > maxCoverage){
                    maxCoverage = coverage;
                }
            }
        }
    }

    return maxCoverage;
}
