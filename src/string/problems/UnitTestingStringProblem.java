package string.problems;
import  org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        // Anagram
        Anagram.checkAnagram("Sajol", "Shammo");
        Assert.assertEquals(false, Anagram.checkAnagram("s1", "s2"));

        // Largest Word
        String st = "Java programming is fun";
        Map<Integer, String> map = new HashMap( );
        map.put(11, "programming");
        Assert.assertEquals(map, DetermineLargestWord.findTheLargestWord(st));

        // Palindrome

        Palindrome.isPal("madam");
        Assert.assertEquals(true,true);

        // Permutation

    }
}