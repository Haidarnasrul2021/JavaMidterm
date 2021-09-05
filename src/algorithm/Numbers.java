package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {
    //By following above, Continue for rest of the Sorting Algorithm....


    //Come to conclusion about which Sorting Algo is better in given data set.
    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[1000000];
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "InsertingNumbers");
        List<String> insertingList = connectToSqlDB.readDataBase("insertion_sort", "InsertingNumbers");
        printValue(insertingList);
        int m = num.length;
        randomize(num, m);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Quick sort
        algo.quickSort(num);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "QuickNumbers");
        List<String> quickList = connectToSqlDB.readDataBase("quick_sort", "QuickNumbers");
        printValue(quickList);
        int o = num.length;
        randomize(num, o);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Heap sort
        algo.heapSort(num);
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "heapNumbers");
        List<String> heapList = connectToSqlDB.readDataBase("heap_sort", "heapNumbers");
        printValue(heapList);
        int p = num.length;
        randomize(num, p);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Merge Sort
        algo.mergeSort(num);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "mergeNumbers");
        System.out.println("Data showing form database :");
        List<String> mergeList = connectToSqlDB.readDataBase("merge_sort", "mergeNumbers");
        printValue(mergeList);
        int q = num.length;
        randomize (num, q);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Bucket Sort
        algo.bucketSort(num);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "BucketNumbers");
        System.out.println("Data showing form database :");
        List<String> bucketList = connectToSqlDB.readDataBase("bucket_sort", "BucketNumbers");
        printValue(bucketList);
        int r = num.length;
        randomize (num, r);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Bubble sort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "bubbleNumbers");
        List<String> buubleList = connectToSqlDB.readDataBase("bubble_sort", "InsertingNumbers");
        printValue(buubleList);
        int s = num.length;
        randomize(num, s);
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Shell sort
        algo.shellSort(num);
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in shell Sort take: " + shellSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "shellNumbers");
        List<String> shellList = connectToSqlDB.readDataBase("shell_sort", "ShellNumbers");
        printValue(shellList);
        int t = num.length;
        randomize(num,t);
        System.out.println("----------------------------------------------------------------------------------------------------");

    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int arr[], int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }

}
