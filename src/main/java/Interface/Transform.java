package Interface;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Transform implements Rotate, Translate {
    /**
     *
     * Rotate all points of collections given in parameters
     * with the angle given
     *
     * @param coords collections of Point2d
     * @param angle angle
     * @return rotated collection
     */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {
        Collection<Point2d> colp2d = new ArrayList<Point2d>();

        for (Iterator<Point2d> it = coords.iterator(); it.hasNext(); ) {
            Point2d temp = it.next();
            colp2d.add(temp.rotate(angle));

        }

        return colp2d;
    }

    /**
     *
     * Translate all points of a collection by a given vector
     *
     * @param coords          Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) {
        Collection<Point2d> colp2d = new ArrayList<Point2d>();

        for (Iterator<Point2d> it = coords.iterator(); it.hasNext(); ) {
            Point2d temp = it.next();
            colp2d.add(temp.translate(translateVector));
        }

        return colp2d;
    }
}
