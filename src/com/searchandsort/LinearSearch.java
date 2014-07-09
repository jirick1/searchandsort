package com.searchandsort;

public class LinearSearch
{
    /**
     * Linear Search
     * 
     * Searching data involves determining whether a value is present in the
     * data and, if so, finding its location.
     * 
     * Benefits of Linear search - - if the element is at the beginning of the
     * array / data set it will have the best performance. - Simplest of the
     * other searches and easy to implement.
     * 
     * Linear search algorithm - search each element in an array sequentially.
     * If the search key does not match an element in the array, the algorithm
     * tests each element, and when the end of the array is reached, informs the
     * user that the search key is not present. If the search key is in the
     * array, the algorithm tests each element until it finds one that matches
     * the search key and returns the index of that element.
     * 
     * Sorting places the data in order based on one or more sort keys.
     * 
     * Big O notation - amount of effort they require to complete each search.
     * The worst case run time for an algorithm. How hard an algorithm may have
     * to work to solve a problem.
     * 
     * 
     * Constant Runtime - The algorithm is completely independent of the number
     * of elements in the array. O(1) O(1) = the number of comparison is
     * constant. In other words, it does not grow as the size of the array
     * increases.
     * 
     * An algorithm that test whether the first element of an array is equal to
     * any of the other elements o the array will required at most n -1
     * comparison. n = the number of elements in the array.
     * 
     * An algorithm that requires n -1 is said to be O(n). An O(n) algorithm is
     * referred to as having a linear run-time. O(n) is often pronounced
     * "on the order of n" or "order n"
     * 
     * Big O is concerned with how an algorithm's run time grows in relation to
     * the number of items processed. O(n²) mean the algorithm is quadratic
     * run-time or "order n-squared"
     */

    private int[] data = new int[90];

    public int linearSearch(int searchKey)
    {
        for (int index = 0; index < data.length; index++)
        {
            if (data[index] == searchKey) return index;
        }
        return -1;
    }
}
