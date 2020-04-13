package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;


/*
 *Created by mrahman on 04/02/2018.
 */


public class Numbers {

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
		
		int [] num = new int[10];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		Sort algorithm = new Sort();

		//Selection Sort

		algorithm.selectionSort(num);
		long selectionSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort takes: "
				+ selectionSortExecutionTime + " millisecond");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort

		algorithm.insertionSort(num);
		long insertionSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort takes: " +
				insertionSortExecutionTime + " millisecond");

		//By following above, Continue for rest of the Sorting Algorithm....

		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbers1 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbers1);
		 n = num.length;
		randomize (num, n);


		//Bubble sort

		algorithm.bubbleSort(num);
		long bubbleSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort takes: " +
				bubbleSortExecutionTime + " millisecond");


		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
		List<String> numbers2 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbers2);
		n = num.length;
		randomize (num, n);


		//Merge sort

		algorithm.mergeSort(num,0,num.length-1);
		long mergeSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort takes: " +
				mergeSortExecutionTime + " millisecond");


		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers3);
		n = num.length;
		randomize (num, n);


		//Quick sort

		algorithm.mergeSort(num,0,num.length-1);
		long quickSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort takes: " +
				quickSortExecutionTime + " millisecond");


		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		List<String> numbers4 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers4);
		n = num.length;
		randomize (num, n);



		//Heap Sort

		algorithm.heapSort(num);
		long heapSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort takes: " +
				heapSortExecutionTime + " millisecond");


		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
		List<String> numbers5 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbers5);
		n = num.length;
		randomize (num, n);



		//Bucket Sort

		algorithm.bucketSort(num,maxValue(num));
		long bucketSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort takes: " +
				bucketSortExecutionTime + " millisecond");


		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		List<String> numbers6 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
		printValue(numbers6);
		n = num.length;
		randomize (num, n);

	// Shell sort

		algorithm.shellSort(num);
		long shellSortExecutionTime = algorithm.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in shell Sort take: " +
				shellSortExecutionTime + " millisecond");

		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		List<String> numbers7 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbers7);


		//Come to conclusion about which Sorting Algorithm is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();

		// Start from the last element and swap one by one.
		// We don't need to run for the first element that's why i > 0

		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void printValue(List<String> arr){
		for(String st:arr){
			System.out.println(st);
		}
	}
	public static int maxValue(int [] array){
		int max_value =0;
		for (int value : array)
			if (value > max_value)
				max_value = value;
			return max_value;
	}


}
