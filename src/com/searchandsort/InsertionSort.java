package com.searchandsort;

public class InsertionSort
{
    /**
     * Insertion Sort Simple and Inefficient
     * 
     * Logic: The first iteration of this algorithm takes the second element in
     * the array and, if it is less than the first element swaps it with the
     * first element. The second iteration looks at the third element and
     * inserts it into the correct position with respect to the first two
     * elements, so all three elements are in order. At the nth iteration of the
     * algorithm, the first i elements in the original array will be sorted.
     */

    private int[] data = new int[90];

    private void sort()
    {
        int insert; // temporary variable to hold element to insert

        //loop over data.length - 1 elements
        for ( int next = 1; next < data.length; next++) {
            //store value in current element
            insert = data[ next ];

            // initialize location to place element
            int moveItem = next;

            //search for place to put current element
            while (moveItem > 0 && data[ moveItem ] -1  > insert) {
                //shift element right one slot
                data[ moveItem ] = data[ moveItem - 1];
                moveItem--;
            }

            data[ moveItem ] = insert; // place inserted element
        }
    }
}
