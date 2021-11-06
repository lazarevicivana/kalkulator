package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner skener;
		skener = new Scanner(System.in);
		String s;
	
			do 	{
				 s = skener.nextLine();
				 if(s.equals("")) 
				 {
					 continue;
				 }

			}while(!s.equals("kraj"));
			
	}

}
 