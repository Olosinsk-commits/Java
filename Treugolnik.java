/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author olga.osinskaya
 */
public class Treugolnik {

    /**
     * The patternDisplay method prints patterns of symbols.
     *
     * @param size defines the size of pattern, in particular the size of the
     * longest sequence of characters in the pattern
     * @param c defines the choice of character that is used to display the
     * patters
     * @param direction defines the direction of the pattern.
     * @throws IllegalArgumentException Argument Exception when size is negative
     * number
     */
    public static void patternDisplay(int size, char c, boolean direction) throws IllegalArgumentException {

        if (size < 0) {
            throw new IllegalArgumentException("Size "
                    + " cannot be negative");
        }
        
        String var = "";
        if (direction == true) {
            for (int i = 0; i < size; i++) {
                var = var + c;
                System.out.println(var);
            }
        } else {
            for (int i = 0; i < size; i++) {
                var = var + c;
            }
            for (int i = size; i > 0; i--) {

                System.out.println(var.substring(0, i));
                //substring(int beginIndex, int endIndex) - returns a new string that is a substring of this string.
            }
        }

    }
//        if (direction == true) {
//            for (int i = 0; i < size; i++) {
//                for (int j = 0; j <= i; j++) {
//                    
//                    System.out.print(c);
//                }
//                System.out.println();
//            }
//        } else {
//
//            for (int i = 1; i <= size; i++) {
//                for (int j = size; j >= i; j--) {
//                    System.out.print(c);
//                }
////                System.out.println();
////            }
//        }
}
