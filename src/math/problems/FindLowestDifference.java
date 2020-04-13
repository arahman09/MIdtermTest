package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        static int[] arr1 = {30, 12, 5, 9, 2, 20, 33, 1};
        static int[] arr2 = {18, 25, 41, 47, 17, 36, 14, 19};

        public static int findLowestDifference(int arr1[], int arr2[], int m, int n) {

            Arrays.sort(arr1); // {1, 2, 5, 9, 12, 20, 30, 33}
            Arrays.sort(arr2);// {14, 17, 18, 19, 25, 36, 41, 47}

            int a = 0, b = 0;

            int result = Integer.MAX_VALUE;


            while (a < m && b < n)
            {
                if (Math.abs(arr1[a] - arr2[b]) < result) //Math.abs() returns the absolute value of a given argument.
                    result = Math.abs(arr1[a] - arr2[b]);

                if (arr1[a] < arr2[b])
                    a++;

                else
                    b++;
            }

            return result;
        }
        public static void main(String[] args)
        {

            int m = arr1.length;
            int n = arr2.length;

            System.out.println("Lowest difference: "+ findLowestDifference(arr1, arr2, m, n));

        }
}