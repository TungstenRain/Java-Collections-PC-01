package ch19pc01;

import java.util.*;

/**
 * 
 * @author frank
 */
public class Ch19pc01 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate Scanner class
        Scanner keyboard = new Scanner(System.in);

        // Request input from user
        System.out.println("Welcome to the Word Set.");
        System.out.println("Enter a line of input: ");
        String str = keyboard.nextLine();

        // split string entered using split() function
        String[] stringArray = str.split("[\\s\\-\\.\\'\\?\\,\\_\\@]+");
        
        // sort the array
        Arrays.sort(stringArray);
        
        System.out.println("Contents of array in sorted order ...\n");
        // copy contents of args to arr
        for(int i = 0 ; i < stringArray.length ; i++ ) {
            System.out.println(stringArray[i]);
        }
    }
}
