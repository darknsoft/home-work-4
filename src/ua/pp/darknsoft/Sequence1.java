package ua.pp.darknsoft;

public class Sequence1{

	public static void main(String[] args){
	
		int j=0;
		for(int i=1000;i<10000;i+=3,j++){
			System.out.print(i + " ");			
		}
		System.out.println();
		System.out.println("Total items: " + j);
	}
}
