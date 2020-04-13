package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		List<String> landmarksOfNewYorkCity= new ArrayList<>();

		landmarksOfNewYorkCity.add("Freedom Tower");
		landmarksOfNewYorkCity.add("Statue Of Liberty");
		landmarksOfNewYorkCity.add("The Empire State Building");
		landmarksOfNewYorkCity.add("Brooklyn Bridge");
		landmarksOfNewYorkCity.add("Luna Park");

		List<String> landmarksOfNewYorkState =new ArrayList<>();

		landmarksOfNewYorkState.add("Niagara Falls");
		landmarksOfNewYorkState.add("Lake Placid");
		landmarksOfNewYorkState.add("Thousand Island");
		landmarksOfNewYorkState.add("Letchworth State Park");
		landmarksOfNewYorkState.add ("Bear Mountain State Park");

		Map<String,List<String>> aboutNewYork = new HashMap<String,List<String>>();

		aboutNewYork.put("City Landmark", landmarksOfNewYorkCity);
		aboutNewYork.put("State Landmark", landmarksOfNewYorkState);

		for (Map.Entry NewYork:aboutNewYork.entrySet()) {

			System.out.println(NewYork.getKey()+ " "+ NewYork.getValue());
		}


	}

}


