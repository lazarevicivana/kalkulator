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
				 String[] pars = s.split(" ");
				 
				 if(pars.length != 3)
				{ 
					 if(s.equals("kraj"))
						 continue;
					 System.out.println("Pogresan format naredbe!");
					continue;
				}

				 

			}while(!s.equals("kraj"));
			
	}

}
 