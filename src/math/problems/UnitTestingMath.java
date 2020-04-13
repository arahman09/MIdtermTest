package math.problems;

import org.testng.Assert;

import java.util.Scanner;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial test = new Factorial();
        Assert.assertEquals(120, 120);

        // Find Missing Number

        int [] array = {1,2,3,5};
        FindMissingNumber.missingNumber(array);
        Assert.assertEquals(4,4);

    }

}



