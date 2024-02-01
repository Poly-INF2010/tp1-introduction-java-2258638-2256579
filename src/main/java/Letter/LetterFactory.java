package Letter;

import Point.Point2d;
import Shape.*;

import java.util.ArrayList;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /**
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape a = new BaseShape();

        Rectangle rectangleHor = new Rectangle(halfMaxWidth, halfStripeThickness);
        a.add(rectangleHor);

        Rectangle rectangleDia = new Rectangle(halfStripeThickness, maxHeight);
        rectangleDia.rotate(rectangleDia.getCoords(), (7*Math.PI)/4);
        a.add(rectangleDia);

        rectangleDia.rotate(rectangleDia.getCoords(), (-13*Math.PI)/4);
        rectangleDia.translate(rectangleDia.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        return a;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape B = new BaseShape();

        return B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape C = new BaseShape();

        return C;
    }

    /**
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();

        Rectangle rectangleHor = new Rectangle(maxWidth, stripeThickness);
        rectangleHor.translate(rectangleHor.getCoords(), new Point2d(-halfMaxWidth, halfMaxHeight - stripeThickness));
        e.add(rectangleHor);

        rectangleHor.translate(rectangleHor.getCoords(), new Point2d(0.0, -halfMaxHeight));
        e.add(rectangleHor);

        rectangleHor.translate(rectangleHor.getCoords(), new Point2d(0.0, -halfMaxHeight));
        e.add(rectangleHor);

        Rectangle rectangleVer = new Rectangle(halfStripeThickness, maxHeight);
        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(halfMaxWidth, 0.0));
        e.add(rectangleVer);


        return e;
    }

    /**
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();

        Rectangle rectangleVer = new Rectangle(halfStripeThickness, maxHeight);
        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(halfMaxWidth, 0.0));
        h.add(rectangleVer);

        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(maxWidth, 0.0));
        h.add(rectangleVer);

        Rectangle rectangleHor = new Rectangle(maxWidth, stripeThickness);
        rectangleHor.translate(rectangleHor.getCoords(), new Point2d(-halfMaxWidth, -halfStripeThickness));
        h.add(rectangleHor);

        return h;
    }

    /**
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape n = new BaseShape();

        Rectangle rectangleDia = new Rectangle(halfStripeThickness, maxHeight);
        rectangleDia.rotate(rectangleDia.getCoords(), (7*Math.PI)/4);
        n.add(rectangleDia);

        Rectangle rectangleVer = new Rectangle(halfStripeThickness, maxHeight);
        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(halfMaxWidth, 0.0));
        n.add(rectangleVer);

        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(maxWidth, 0.0));
        n.add(rectangleVer);

        return n;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape O = new BaseShape();

        return O;
    }

}
