package ua.pp.darknsoft;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Calc{

	public static void main(String[] args){
		
		String operation="";			
		int i,j = 0;
		Scanner scanner = new Scanner(System.in);

		if(args.length == 0){			
			System.out.println("Сhoose OPERATION: addition, subtraction, multiplication, division, remainder, abs");
			System.out.println("End enter two nubers (be careful with parameters - String Int Int)");
			System.out.println("Enter OPERATION: ");
			operation = scanner.next();
			System.out.println("Enter first number: ");
			i = scanner.nextInt();
			if(!operation.equals("abs")){
				System.out.println("Enter second number: ");
				j = scanner.nextInt();
			}							
			System.out.println("Result: " + calculate(operation,i,j));
			
		}else{
			if(!args[0].equals("abs") ){
				System.out.println("Result: " + calculate(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
			}else{
				System.out.println("Result: " + calculate(args[0],Integer.parseInt(args[1]),j));
			}
			
		}
		
	}

	private static int calculate(String operation,int i, int j){
		
		int result = 0;		
		switch(operation){
			
			case "addition":
				result = i + j;
				break;
			
			case "subtraction":
				result = i - j;
				break;

			case "multiplication":
				result = i * j;
				break;

			case "division":
				if(j!=0){
					result = i / j;
				}else{
					result = 0;
				}
				break;

			case "remainder":
				if(j!=0){
					result = i % j;
				}else{
					result = 0;
				}
				break;			

			case "abs":
				result = abs(i);
				break;
		}
	
	return result;
		
	}
}
