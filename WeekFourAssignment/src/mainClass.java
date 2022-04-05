//Grace Phillips
//Mr. Messner
//Week 4 assignment
//September 21st, 2020


//declaring imports
import java.util.Arrays;
import java.text.Collator;
import java.util.*; 
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class mainClass {

	public static void main(String[] args) throws ParseException {
		
		RandomGenerator<Integer> newList = new RandomGenerator<Integer>();
		
		//Sorting array
		System.out.printf("Before array: %s\n",
				Arrays.toString(newList.arr)); 
		
		long startTime = System.currentTimeMillis(); 
		
		for (int i = 0; i<newList.arr.length; i++)
		{
			for(int j = i + 1; j<newList.arr.length; j++)
			{
				if (newList.arr[i] >= newList.arr[j])
				{
					int temp = newList.arr[i];
					newList.arr[i] = newList.arr[j];
					newList.arr[j] = temp;
				}
			}
		}
		
		
		System.out.printf("After array sorting: %s\n",
				Arrays.toString(newList.arr)); 
		
		System.out.printf("\n");
		
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime); //execution times in milliseconds
		timer (duration);
		
		
		
		

		System.out.printf("\nBefore LinkedList: " + newList.linkedList); 
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i<newList.arr.length; i++) {
			for(int j = i+1; j<newList.arr.length; j++) {
				if (newList.linkedList.get(i) >= newList.linkedList.get(j)) {
					int temp = newList.linkedList.get(i);
					newList.linkedList.set(i,newList.linkedList.get(j));
					newList.linkedList.set(j, temp);
				}
			}
		}
	    
		endTime = System.currentTimeMillis();
		duration = (endTime - startTime);
		timer(duration);
		
		System.out.println("After LinkedList sorting:" + newList.linkedList); 
		 
		 
		
	}
	
	//timer setup

	private static void timer(long dur) {
		methodToTime1();
		
		System.out.println(dur + "Milli-seconds");
		
	}

	private static void methodToTime1() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

}
