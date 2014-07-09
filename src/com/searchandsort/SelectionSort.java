package com.searchandsort;

public class SelectionSort
{
    /**
     * Selection Sort - Simple - inefficient
     * 
     * 
     * Big O of O(n²)
     * 
     * Logic: The first iteration of the algorithm selects the smallest element
     * in the array and swaps it with the first element. The second iteration
     * selects the second-smallest item and swaps it with the second element.
     * And so on until the last iteration selects the second-largest element and
     * swaps it with the second to last index, leaving the largest element in
     * the last index.
     */

    private int[] data = new int[90];

    public void sort()
    {
        int smallest; // index to the smallest element

        // loop over data.length -1 elements
        for (int i = 0; i < data.length - 1; i++)
        {
            smallest = i;

            // loop and find the smallest element
            for (int index = i + 1; index < data.length; index++)
            {
                if (data[index] < data[smallest])
                {
                    smallest = index;
                }
            }
            swap(i, smallest); // swap the smallest element into position
        }
    }

    // helper method to swap values in two elements
    public void swap(int first, int second)
    {
        int temporary = data[first]; // store the first in temporary
        data[first] = data[second]; // replace first with second
        data[second] = temporary; // put temporary in second
    }
}
