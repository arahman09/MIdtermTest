package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String st = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(st);

        for (Map.Entry r : wordNLength.entrySet())
            System.out.println("longest word length: " + r.getKey() + " \nLongest word: " + r.getValue());

    }
                public static Map<Integer, String> findTheLargestWord (String s){
            Map<Integer, String> map = new HashMap<Integer, String>();
            String st = "";
            String word[]= s.split(" ");
            int i = 0;
            while (i < word.length) {

                if (word[i].length()>st.length())
                    st = word[i];
                i++;
            }
            map.put(st.length(), st);
            return map;


    }
}


