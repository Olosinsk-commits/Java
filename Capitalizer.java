/*
Write a static method that accepts a String object as an argument
and capitalizes the first character of each sentence in the string. 
In addition it removes all extra white spaces between words. 
For instance, if the string argument
is “hello.  my     name is Joe. what is your name?” the method should
manipulate the string so it contains “Hello. My name is Joe. What is your name?”
Assume that period, question mark, and exclamation mark are the only signals of the sentence ending. 
Suggestion: convert the String into a StringBuilder object to make string modification easier.
Test the new method in main(). 
Requirement: Make sure to pass through the string only once. Do not use nested loops
 */
package capitalizer;

import java.io.IOException;

/**
 *
 * @author olga.osinskaya
 */
public class Capitalizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String str = "hello.  my     name is Joe!   what is your name?";
        //String str = "";
        String newstr = StrCap(str);
        System.out.println(newstr);

    }

    /**
     * The StrCap method accepts a String object as an argument and capitalizes
     * the first character of each sentence in the string.
     * @param str 
     * @return new upgraded String
     */
    public static String StrCap(String str) {
        boolean capitalize = true;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isWhitespace(c) && i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
                continue;
            }

            if (c == '.' || c == '?' || c == '!') {
                capitalize = true;
            } else if (c != ' ' && capitalize) {
                //Capitalize the first letter of each sentence
                c = Character.toUpperCase(c);
                capitalize = false;
            }
            //Appends the argument to this string builder
            sb.append(c);
        }
        //return the formatted string as a string
        return sb.toString();
    }

}
