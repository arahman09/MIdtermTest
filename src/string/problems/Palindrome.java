package string.problems;

import java.util.Scanner;

public class Palindrome {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM, DAD, MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        //My Method to check
        public static boolean isPal(String string) {

            // if length is 0 or 1 then String is palindrome

            if(string.length() == 0 || string.length() == 1)
                return true;

            if(string.charAt(0) == string.charAt(string.length()-1))

                return isPal(string.substring(1, string.length()-1));

                return false;
        }

        public static void main(String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the String for check: ");
            String string = scanner.nextLine();

            if(isPal(string))
                System.out.println(string + " is a palindrome");
            else
                System.out.println(string + " is not a palindrome");
        }
    }