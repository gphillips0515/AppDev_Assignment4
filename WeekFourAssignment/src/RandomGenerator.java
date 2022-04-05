//declaring imports

import java.util.Random;
import java.util.LinkedList; 


public class RandomGenerator<T>
{
	Random generator = new Random();
	
		LinkedList<Integer> linkedList = new LinkedList<>(); 
		int[] arr = new int [5000];
		
		//Constructor 
		
		public RandomGenerator()
		{
			for(int i = 0; i <5000; i++)
			{
				int num = generator.nextInt(500);
				arr [i] = num;
				linkedList.add(num); 
			}
		}
		
		
		
		
	
	
	
	
	
	
}
