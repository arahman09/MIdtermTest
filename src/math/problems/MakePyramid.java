package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=keyboard.nextInt();

        System.out.print("Enter Symbol : ");
        char c = keyboard.next().charAt(0);

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)

            {
                System.out.print(" ");
            }

            for(int j=0;j<(i*2)-1;j++)

                {
                    System.out.print(c);
                }
                System.out.println();
            }

        }
    }





