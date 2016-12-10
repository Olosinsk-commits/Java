package Cell;

/**
 * Write a static method that takes a string as argument, then prints out a
 * table: for each character that occurs in the string, the table contains the
 * character and its frequency of occurrence. Assume that the string contains
 * only ASCII characters. Suggested approach: Create an array of short integers,
 * where each element is holding frequency of occurrence of a character with
 * specific character code. The element of the array is associated with the
 * character ASCII code via element index, for example element with index 65 is
 * holding the frequency of character A. Use the array as storage for the
 * frequencies of the characters, incrementing the corresponding frequency each
 * time you encounter the character in the given string. Requirement: The method
 * must be efficient – it must complete the task with only ONE pass through the
 * string.
 *
 *
 * @author olga.osinskaya
 */
public class Occurence {
    
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(nums[i] + " ");
        }
    }
}
