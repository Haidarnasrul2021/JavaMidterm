package algorithm;

public class Sort {


    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here
        if(array.length<=1){
            return array;
        }
        int midpoint = array.length/2;
        int[]left = new int[midpoint];
        int[] right;
        if(array.length % 2 == 0){
            right = new int[midpoint];
        }else{
            right = new int[midpoint+1];
        }
        return list;
    }


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here
        int low, high, middle;


        return list;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



}

