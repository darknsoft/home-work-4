package ua.pp.darknsoft;

public class Sequence1{

	public static void main(String[] args){
	
		int total=0;
		for(int i=1000;i<10000;i+=3,total++){
			System.out.print(i + " ");			
		}
		System.out.println();
		System.out.println("Total items: " + total);
	}
}
