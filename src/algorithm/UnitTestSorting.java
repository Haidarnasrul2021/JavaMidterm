package algorithm;

        import org.testng.Assert;
        import org.testng.annotations.Test;

        import java.util.Arrays;

public class UnitTestSorting {

    /*
  This class is about Unit testing for Sorting Algorithm.
 */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals("Array is not Sorted", sortedArray, String.valueOf(unSortedArray));
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the sorting algorithm...................below

    }
    @Test
    public void selectionSortTesting(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        int[] expectedArray = sortedArray;
        int[] actualArray = sort.selectionSort(unSortedArray);
        try {
            Assert.assertEquals("Array is not Sorted", expectedArray, Arrays.toString(actualArray));
        }catch(Exception ex){
            ex.getMessage();
        }
    }

    @Test
    public void insertionSortTesting(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        int[] expectedArray = sortedArray;
        int[] actualArray = sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals("Array is not Sorted", expectedArray, String.valueOf(actualArray));
        }catch(Exception ex){
            ex.getMessage();
        }
    }

    @Test
    public void bubbleSortTesting() {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        int[] expectedArray = sortedArray;
        int[] actualArray = sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals("Array is not Sorted", expectedArray, Arrays.toString(actualArray));
        } catch (Exception ex) {
            ex.getMessage();
        }
    }




}
