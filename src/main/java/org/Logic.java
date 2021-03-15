package org;

public class Logic {
    public static int getElementIndex(int[] sortedArray, int value) {
        int smallestIndex = 0;
        int largestIndex = sortedArray.length;
        int index = -1;

        while (largestIndex >= smallestIndex) {
            int middleElement = (smallestIndex + largestIndex) / 2;

            if (sortedArray[middleElement] < value) {
                smallestIndex = middleElement + 1;
            } else if (sortedArray[middleElement] > value) {
                largestIndex = middleElement - 1;
            } else if (sortedArray[middleElement] == value) {
                index = middleElement;
                break;
            } else return index;
        }
        return index;
    }
}

