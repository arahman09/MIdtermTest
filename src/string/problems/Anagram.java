package string.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */

   // public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


    public class Anagram {

        public static boolean checkAnagram(String s1, String s2)

        {

            s1 = s1.replaceAll("s", " ");

            s2 = s2.replaceAll("s", " ");

            if (s1.length() != s2.length())

                return false;

                else
                {

                    char[] arr1 = s1.toLowerCase().toCharArray(); // Convert both Strings into
                    char[] arr2 = s2.toLowerCase().toCharArray(); //lower case and into Character Array

                    Arrays.sort(arr1);

                    Arrays.sort(arr2);

                    return (Arrays.equals(arr1, arr2));

                }

            }

    public static void main(String[] args)

    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First String : ");

        String s1 = scanner.nextLine();

        System.out.print("Enter the Second String : ");

        String s2 = scanner.nextLine();

        if(checkAnagram(s1, s2))

            System.out.println(s1+" and "+s2+" are Anagrams");

        else

            System.out.println(s1+" and "+s2+" are NOT Anagrams");

        scanner.close();

    }
}
