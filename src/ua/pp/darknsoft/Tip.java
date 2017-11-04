package ua.pp.darknsoft;

public class Tip{

	public static void main(String[] args){
		int cost = 0;
		if(args.length<=1){
			System.out.println("Please, enter parametrs - cost and service level");
		}else{
			cost = Integer.parseInt(args[0]);
			switch(args[1]){
				case "terrible":
					System.out.println("Result: " + (cost+(cost*0)/100));
					break;
				case "poor":
					System.out.println("Result: " + (cost+(cost*5)/100));
					break;
				case "good":
					System.out.println("Result: " + (cost+(cost*10)/100));
					break;
				case "great":
					System.out.println("Result: " + (cost+(cost*15)/100));
					break;
				case "excellent":
					System.out.println("Result: " + (cost+(cost*20)/100));
					break;
				default :
					System.out.println("Result: " + cost);
					break;
			}

		}

	}
	
}
