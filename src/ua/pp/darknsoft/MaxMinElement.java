package ua.pp.darknsoft;
import java.util.concurrent.ThreadLocalRandom;

public class MaxMinElement{

	public static void main(String[] args){
		int masLng = 10;
		int min = 0;
		int max = 0;
		int temp = 0;
		
		if(args.length == 1){			
			masLng = Integer.parseInt(args[0]);
		}
		
		int[] someArray = new int[masLng];
		for(int i=0;i < someArray.length;i++){
			someArray[i] = ThreadLocalRandom.current().nextInt(1, 100 + 1); //I took it from
			// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		}
		
		for(int tmp:someArray){
			System.out.print(tmp + " ");
		}
		

		//Arrays.sort(someArray);
		//or one step coctail sort (Shake-shake)
		for(int i=0;i < someArray.length-1;i++){
			if(someArray[i]>(someArray[i+1])){
				temp = someArray[i];
				someArray[i] = someArray[i+1];
				someArray[i+1] = temp; 
					
			}
		}
		for(int i=someArray.length-1;i > 0 ;i--){
			if(someArray[i]<(someArray[i-1])){
				temp = someArray[i];
				someArray[i] = someArray[i-1];
				someArray[i-1] = temp; 
					
			}
		}
		max = someArray[masLng-1];
		min = someArray[0];
		System.out.println();
		System.out.println("max " + max);
		System.out.println("min " + min);	
	
		
	}
}
