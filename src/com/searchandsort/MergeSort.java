package com.searchandsort;

public class MergeSort
{
    /**
     * Merge Sort efficient sorting algorithm, but is conceptually more complex
     * than selection sort and insertion sort Details: - The merge sort
     * algorithm sorts and array by splitting it into two equal-sized subarrays,
     * sorting each subarray and then merging them into one larger array. With
     * an odd number of elements, the algorithm creates the two subarrays such
     * that one has one more element than the other. - The implementation of
     * merge sort in this example is recursive. The base case is an array with
     * one element, which is, of course, sorted, so the merge sort immediately
     * returns in this case. The recursion step splits the array into two
     * approximately equal pieces, recursively sorts them, then merges the two
     * sorted arrays into one larger, sorted array.
     */

    private int[] data = new int[90];

    private void sort()
    {
        sortArray(0, data.length - 1); // split entire array
    }

    // splits array, sorts subarrays and merges subarrays into sorted array
    private void sortArray(int low, int high)
    {
        //test base case; size of array equals 1
        if ((high - low) >= 1) { //if not base case

            int middle1 = (low + high) /2; //calculate middle of array
            int middle2 = middle1 + 1; //calculate next element over

            //split array in half; sort each half (recursive calls)
            sortArray(low, middle1); //first half of array
            sortArray(middle2, high); // second half of array

            //merge two sorted arrays after split calls return
            merge( low, middle1, middle2, high);
        } //end if
    } //end method sortArray

    // merge two sorted subarrays into on sorted subarray
    private void merge(int left, int middle1, int middle2, int right)
    {
        int leftIndex = left; // index into left subarray
        int rightIndex = middle2; // index into right subarray
        int combinedIndex = left; // index into temporary working array
        int[] combined = new int[data.length]; // working array

        // merge arrays until reaching end of either
        while (leftIndex <= middle1 && rightIndex <= right)
        {
            // place smaller of two current elements into result
            // and move to nex space in arrays
            if (data[leftIndex] <= data[rightIndex])
            {
                combined[combinedIndex++] = data[leftIndex++];
            }
            else
            {
                combined[combinedIndex++] = data[rightIndex++];
            }
        } // end while

        // if left array is empty
        if (leftIndex == middle2)
        {
            // copy in rest of right array
            while (rightIndex <= right)
            {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }
        else
        {
            // right array is empty
            // copy in rest of left array
            while (leftIndex <= middle1)
            {
                combined[combinedIndex++] = data[leftIndex++];
            }
        }

        // copy values back into original array
        for (int i = left; i <= right; i++)
        {
            data[i] = combined[i];
        }
    }

}
