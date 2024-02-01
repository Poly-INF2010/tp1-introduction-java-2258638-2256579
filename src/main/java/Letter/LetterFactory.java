package Letter;

import Point.Point2d;
import Shape.*;
import org.w3c.dom.css.Rect;


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

        Rectangle horizontalStripe = new Rectangle(30.0, halfStripeThickness);
        a.add(horizontalStripe);

        Rectangle leftStripe = new Rectangle(halfStripeThickness, 153.0);
        leftStripe.rotate(leftStripe.getCoords(), 0.2);
        leftStripe.translate(leftStripe.getCoords(), new Point2d(-halfMaxWidth/2, 0.0));
        a.add(leftStripe);

        Rectangle rightStripe = new Rectangle(halfStripeThickness, 153.0);
        rightStripe.rotate(rightStripe.getCoords(), -0.2);
        rightStripe.translate(rightStripe.getCoords(), new Point2d(halfMaxWidth/2, 0.0));
        a.add(rightStripe);

        return a;
    }

    /**
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape b = new BaseShape();
        Circle bigCircle = new Circle(halfMaxHeight);
        bigCircle.translate(bigCircle.getCoords(), new Point2d(0.0, halfMaxHeight/2));
        b.add(bigCircle);
        bigCircle.translate(bigCircle.getCoords(), new Point2d(0.0, -halfMaxHeight));
        b.add(bigCircle);

        Circle smallCircle = new Circle(halfMaxHeight - stripeThickness);
        smallCircle.translate(smallCircle.getCoords(), new Point2d(0.0, halfMaxHeight/2));
        b.remove(smallCircle);
        smallCircle.translate(smallCircle.getCoords(), new Point2d(0.0,-halfMaxHeight ));
        b.remove(smallCircle);

        Rectangle stripe = new Shape.Rectangle(stripeThickness, maxHeight);
        stripe.translate(stripe.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        b.add(stripe);

        return b;
    }

    /**
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        Ellipse bigO = new Ellipse(maxWidth, maxHeight);
        Ellipse smallO = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        c.add(bigO).remove(smallO);
        Rectangle emptyLeft = new Rectangle(stripeThickness*2, halfMaxHeight);
        emptyLeft.translate(emptyLeft.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness,0.0));
        c.remove(emptyLeft);
        return c;
    }

    /**
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();

        Rectangle horizontalStripe = new Rectangle(maxWidth, halfStripeThickness);
        e.add(horizontalStripe);
        horizontalStripe.translate(horizontalStripe.getCoords(), new Point2d(0.0, halfMaxHeight - halfStripeThickness/2));
        e.add(horizontalStripe);
        horizontalStripe.translate(horizontalStripe.getCoords(), new Point2d(0.0, -maxHeight + halfStripeThickness));
        e.add(horizontalStripe);

        Rectangle verticalStripe = new Rectangle(halfStripeThickness, maxHeight);
        verticalStripe.translate(verticalStripe.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness/2, 0.0));
        e.add(verticalStripe);

        return e;
    }

    /**
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();

        Rectangle rectangleVer = new Rectangle(stripeThickness, maxHeight);
        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness, 0.0));
        h.add(rectangleVer);

        rectangleVer.translate(rectangleVer.getCoords(), new Point2d(-maxWidth, 0.0));
        h.add(rectangleVer);

        Rectangle rectangleHor = new Rectangle(maxWidth, stripeThickness);
        h.add(rectangleHor);

        return h;
    }

    /**
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape n = new BaseShape();

        Rectangle diagStripe = new Rectangle(halfStripeThickness, maxHeight);
        diagStripe.rotate(diagStripe.getCoords(), -0.4);
        n.add(diagStripe);

        Rectangle verticalStripe = new Rectangle(halfStripeThickness, maxHeight);
        verticalStripe.translate(verticalStripe.getCoords(), new Point2d(halfMaxWidth, 0.0));
        n.add(verticalStripe);

        verticalStripe.translate(verticalStripe.getCoords(), new Point2d(-maxWidth, 0.0));
        n.add(verticalStripe);

        return n;
    }

    /**
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o = new BaseShape();
        Ellipse bigO = new Ellipse(maxWidth, maxHeight);
        Ellipse smallO = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        o.add(bigO).remove(smallO);
        return o;
    }

}
