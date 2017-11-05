package ua.pp.darknsoft;
import java.util.concurrent.ThreadLocalRandom;

public class SumFirstElements{

	public static void main(String[] args){
		int masLng = 10;
		int n = 1;
		int sum = 0;
		
		if(args.length == 2){			
			n = Integer.parseInt(args[0]);
			masLng = Integer.parseInt(args[1]);
		}
		
		int[] someArray = new int[masLng];
		for(int i=0;i < someArray.length;i++){
			someArray[i] = ThreadLocalRandom.current().nextInt(1, 9 + 1); //I took it from
			// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		}
		
		for(int tmp:someArray){
			System.out.print(tmp + " ");
		}
		

		if(n<=masLng){
			for(int i=0;i < n;i++){
				sum += someArray[i];
			}
			System.out.println();
			System.out.println("The summ of the first "+ n +" elements of the array = " + sum);
		}else{
			System.out.println();
			System.out.println("A\'m sorry, but "+ n +" can\'t be more than " + masLng);
		}		
		
	
		
	}
}
