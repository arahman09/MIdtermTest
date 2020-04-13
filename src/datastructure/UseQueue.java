package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> queue = new LinkedList<>();
		Scanner keyboard = new Scanner((System.in));
		System.out.print("How many Element do you want to put: ");
		int element = keyboard.nextInt();

		for (int i=0; i<element; i++) {
			queue.add(i);
		}

		System.out.println("Elements of queue= "+queue);

		int size = queue.size();
		System.out.println("Size of queue=" + size);

		int head = queue.peek();
		System.out.println("head of queue= " + head);

		int remove = queue.remove();
		System.out.println("Removed element= " + remove);

		System.out.println("After removed= "+queue);


	}

}
