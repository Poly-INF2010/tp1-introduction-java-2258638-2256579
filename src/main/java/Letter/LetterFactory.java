package Letter;

import Point.Point2d;
import Shape.*;


public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        return new BaseShape();
    }

    /** TODO
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

        Circle smallCircle = new Circle(halfMaxHeight/2);
        smallCircle.translate(smallCircle.getCoords(), new Point2d(0.0, halfMaxHeight/2));
        b.remove(smallCircle);
        smallCircle.translate(smallCircle.getCoords(), new Point2d(0.0,-halfMaxHeight ));
        b.remove(smallCircle);

        Rectangle stripe = new Shape.Rectangle(stripeThickness, maxHeight);
        stripe.translate(stripe.getCoords(), new Point2d(halfMaxWidth, 0.0));
        b.add(stripe);

        return b;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        Ellipse bigO = new Ellipse(maxWidth, maxHeight);
        Ellipse smallO = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        c.add(bigO).remove(smallO);
        Rectangle emptyLeft = new Rectangle(stripeThickness, halfMaxHeight);
        emptyLeft.translate(emptyLeft.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness,0.0));
        c.remove(emptyLeft);
        return c;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return new BaseShape();
    }

    /** TODO
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
