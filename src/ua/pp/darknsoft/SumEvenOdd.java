package ua.pp.darknsoft;
import java.util.concurrent.ThreadLocalRandom;

public class SumEvenOdd{

	public static void main(String[] args){
		int masLng = 10;
		int sumEven = 0;
		int sumOdd = 0;
		
		if(args.length == 1){			
			masLng = Integer.parseInt(args[0]);
		}
		
		int[] someArray = new int[masLng];
		for(int i=0;i < someArray.length;i++){
			someArray[i] = ThreadLocalRandom.current().nextInt(1, 9 + 1); //I took it from
			// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		}
		
		for(int tmp:someArray){
			System.out.print(tmp + " ");
		}
		

		
			for(int i=0;i < someArray.length;i++){
				if(someArray[i]%2==0) sumEven += someArray[i];
				else sumOdd += someArray[i];
			}
			System.out.println();
			System.out.println("sumEven = " + sumEven);
			System.out.println("sumOdd = " + sumOdd);
		
	
		
	}
}
