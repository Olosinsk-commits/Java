package pattern;

/**
 *
 * @author olga.osinskaya 
 */
public class Pattern {

    public static void main(String[] args) {
        Treugolnik box = null;
        box = new Treugolnik();
        System.out.println("Pyramid pattern of star in Java : \n");
        //call patternDisplay method 
        try {
        box.patternDisplay(4, '#', false);
               } catch (Exception e) // handle the exception below
        {
            System.out.print("Size cannot be negative ");
            return;
            // System.out.println(e.getMessage());
        }
    }
}

