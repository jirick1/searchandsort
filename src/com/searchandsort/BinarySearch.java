package com.searchandsort;

public class BinarySearch
{
    /**
     * Binary Search
     * 
     * Binary search is more efficient than the linear search algorithm, but it
     * requires that the array be sorted.
     * 
     * Big O or O(log n) Binary search has a logarithmic run-time
     * 
     * Logic: The first iteration of this algorithm tests the middle element in
     * the array. If this matches the search key, the algorithm ends. Assuming
     * the array is sorted in ascending order, then if the search key is less
     * than the middle element, it cannot match any element in the second half
     * of the array and the algorithm continues with only the first half of the
     * array. If the search key is greater than the middle element, it cannot
     * match any element in the first half and the algorithm conies with only
     * the second half of the array. Each iteration tests the middle value and
     * the remaining portion of the array. If the search key does not match the
     * element, the algorithm eliminates half of the remaining elements. The
     * algorithm ends by either finding an element that matches the search key
     * or reducing the sub array to zero size.
     */

    public int binarySearch(int searchElement, int[] data)
    {
        int low = 0;
        int high = data.length - 1; // gets the last value from the sorted array
        int middle = (low + high + 1) / 2; // middle element
        int location = -1; // return value if not found

        do
        {
            if (searchElement == data[middle])
            {
                location = middle; // location is the current middle
            }
            else if (searchElement < data[middle])
            {
                high = middle - 1; // eliminate the higher half
            }
            else
            {
                low = middle + 1; // eliminate the lower half
            }

            middle = (low + high + 1) / 2; // recalculate the middle
        }
        while ((low <= high) && (location == -1));

        return location; // return the location of the search key
    }
}
