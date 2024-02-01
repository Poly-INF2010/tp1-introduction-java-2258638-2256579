package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * Create a filled Ellipse that is centered on (0, 0)
     *
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        double widthRadius = (double) Math.round(widthDiameter * 2) /4.0;
        double heightRadius = (double) Math.round(heightDiameter * 2) /4.0;

        for (double y = heightRadius; y >= -heightRadius; y -= 0.5){
            double x = Math.floor(widthRadius*Math.cos(Math.asin(y/heightRadius))*2)/2.0;
            for (double i = x; i >= -x; i -= 0.5){
                this.add(new Point2d(i, y));
            }
        }

    }

    /**
     * Create a filled Ellipse that is centered on (0,0)
     *
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     *
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    /**
     *
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
