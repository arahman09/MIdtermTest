package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

	// Selection Sort

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
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

    //Insertion Sort

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

            for(int i=1; i<array.length; i++) {
                int cursor = array[i];
                int j =i-1;

                while(j>=0 && array[j]>cursor)
                {
                    array[j+1]=array[j];
                    j=j-1;
                }
                array[j+1]=cursor;
            }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // Bubble Sort

    public int[] bubbleSort(int [] array){
        int [] list = array;

        final long startTime = System.currentTimeMillis();
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)

                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }

    // Merge Sort

    public int [] mergeSort(int [] array, int l, int r){
        int [] list = array;
        final long startTime = System.currentTimeMillis();

        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            mergeSort(array,l,m);
            mergeSort(array , m+1, r);

            // Merge the sorted halves
            merge(array, l, m, r);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;

    }

    // Quick Sort

    public int [] quickSort(int [] array,int low,int high){
        int [] list = array;

        final long startTime = System.currentTimeMillis();
        if (low < high)
        {

            int part = partition(array, low, high);
            quickSort(array, low, part-1);
            quickSort(array, part+1, high);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
        

    }

    // Heap Sort

        public int [] heapSort(int [] array){
            int [] list = array;
            //implement here
            int n = array.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--)
                heap(array, n, i);

            // One by one extract an element from heap
            for (int i=n-1; i>0; i--)
            {
                // Move current root to end
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // call max heapify on the reduced heap
                heap(array, i, 0);
            }

            return list;
        }

    //Bucket Sort

    public int [] bucketSort(int [] array,int max_value){
        int [] list = array;

        int[] bucket = new int[max_value + 1];
        int[] sorted_arr = new int[array.length];

        for (int i= 0; i <array.length; i++)
            bucket[array[i]]++;

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted_arr[pos++] = i;

        return  sorted_arr;

    }

    // Shell Sort

    public int [] shellSort(int [] array) {
        int[] list = array;

        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {

                int temp = array[i];

                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }


        return list;

    }

    public static void printSortedArray(int [] array){

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    //Merge Sort

    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    //quick sort
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

//      heap sort

    void heap (int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heap(arr, n, largest);
        }

    }
}

