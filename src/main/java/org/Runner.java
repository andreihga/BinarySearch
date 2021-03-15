package org;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Runner
{
    public static void main( String[] args ) {
        int[] sortedArray = {14, 8, 5, 54, 41, 10, 1, 500};
        Arrays.sort(sortedArray);
        int index = Logic.getElementIndex(sortedArray,11);
        if(index == -1){
            System.out.println("The element is not in the array");
        } else
            System.out.println("The element can be found at the position " + index + ".");
    }
}
