package pointlist;

/**
 * (Chapt 18, #3) PointList Class The PointList class keeps a list of Point
 * objects in an ArrayList. The PointLIst class accepts any object that is an
 * instance of the Point class, or a subclass of Point.
 *
 * @author olga.osinskaya
 */
public class PointList {

    // generic method printArray
    public static < Point> void printArray(Point[] ArrayList) {
        // Display array elements
        for (Point element : ArrayList) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
