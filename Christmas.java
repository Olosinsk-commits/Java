package christmas;

/**
 *
 * @author olga.osinskaya
 */
public class Christmas {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Print the name of the song 
        System.out.println("The Twelve Days of Christmas: ");
        int i; // a numbers of verses
        // Prints the verses 0 to 12 
        for (i = 1; i <= 12; i++) {
            System.out.print("\nOn the ");
            //display number of verses 
            switch (i) {
                case 1:
                    //statement 1 
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default:
                    break;
            }

            System.out.println("day of Christmas ");
            System.out.println("my true love sent to me: ");

            switch (i) {
                case 12:
                    System.out.print("Twelve drummers drumming,\n");
                case 11:
                    System.out.print("Eleven pipers piping,\n");
                case 10:
                    System.out.print("Ten lords a leaping,\n");
                case 9:
                    System.out.print("Nine ladies dancing,\n");
                case 8:
                    System.out.print("Eight maids a milking,\n");
                case 7:
                    System.out.print("Seven swans a swimming,\n");
                case 6:
                    System.out.print("Six geese a laying,\n");
                case 5:
                    System.out.print("Five golden rings,\n");
                case 4:
                    System.out.print("Four calling birds,\n");
                case 3:
                    System.out.print("Three French Hens,\n");
                case 2:
                    System.out.print("Two turtle doves\n");
                case 1:
                    //add "And a" before 1st statement for verses 2-12  
                    if (i > 1) {
                        System.out.print("And a ");
                    }
                    System.out.print("Partridge in a pear tree.\n ");
                default:
                    break;

            }
        }
    }
}
