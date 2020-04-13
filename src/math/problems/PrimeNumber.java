package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */



		int number, count;
		int range = 1000000;

		System.out.println(" Prime Numbers from 1 to 1000000 are : ");
		for(number = 1; number <= range; number++)
		{
			count = 0;
			for (int i = 2; i <= number/2; i++)
				if (number % i == 0) {
					count++;
					break;
				}
			if(count == 0 && number != 1 )
			{
				System.out.print(number + " ");
			}
			}
		}
	}


