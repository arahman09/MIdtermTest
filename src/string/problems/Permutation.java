package string.problems;

import java.util.Scanner;

public class Permutation {

    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */
    public static void stringPermutation() {

        System.out.print("Plz enter the String: ");
        Scanner keayboard = new Scanner(System.in);
        String input = keayboard.nextLine();
        stringPermutation(" ", input);
    }

    private static void stringPermutation(String permutation, String input) {

        if (input.length()== 0) {
            System.out.println(permutation);
        } else {
            for (int i = 0;  i<input.length(); i++)
                stringPermutation(permutation + input.charAt(i), input.substring(0, i) +
                        input.substring(i + 1));

        }


    }

    public static void main(String[] args)
    {
       Permutation.stringPermutation();
    }
}


