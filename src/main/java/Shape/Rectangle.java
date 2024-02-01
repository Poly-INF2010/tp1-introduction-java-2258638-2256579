package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /**
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        double nbrPtHor = width/0.5;
        double nbrPtVert = height/0.5;

        for (int i = 0; i < nbrPtVert; i++) {
            for (int j = 0; j < nbrPtHor; j++) {
                this.add(new Point2d(0.5 * j - width, 0.5 * i + height));

//                this.getCoords().forEach(System.out::println);
            }
        }
    }

    /**
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(),dimensions.Y());

    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {

    }

    /**
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
