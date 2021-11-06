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

				 int x = Integer.parseInt(pars[0]);
				 int y = Integer.parseInt(pars[2]);
				 
				 if(pars[1].equals("-"))
				 {
					 substraction(x, y);
				 }

			}while(!s.equals("kraj"));
			
	}
	
	public static void substraction(int x, int y)
	{
		System.out.println(x-y);
	}
}
 