package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		 String textFile = System.getProperty("user.dir") + "data/self-driving-car.txt";

		//String textFile = System.getProperty("user.dir") + "/Volumes/D/midTerm/MidtermMarch2020/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(textFile);
			br = new BufferedReader(fr);

		} catch (FileNotFoundException e) {

			System.out.println("File path was not right");
		}

		String line = "";


		try {
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
		} catch (IOException e) {

			System.out.println("File path was not right so we could not read");
		}
		finally {
			if(fr != null) {
				try {
					fr.close();
					fr = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br !=null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
//		BufferedReader objReader = null;
//		try {
//			String strCurrentLine;
//
//			objReader = new BufferedReader(new FileReader("/D/midTerm/MidtermMarch2020/src/data/self-driving-car.txt"));
//
//			while ((strCurrentLine = objReader.readLine()) != null) {
//
//				System.out.println(strCurrentLine);
//			}
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//
//		} finally {
//
//			try {
//				if (objReader != null)
//					objReader.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}
//	}
//}
