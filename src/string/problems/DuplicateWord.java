package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.

         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

public class DuplicateWord {


    public static void main(String[] args) {


        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] words = string.split(" ");

        Map<String,String> wordMap = new HashMap<String,String>();


        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase();

            if(wordMap.get(word)!=null) {
                System.out.println("Duplicate Word:"+word);

                    }

            else {
                wordMap.put(word, word);
            }
        }
    }
}
