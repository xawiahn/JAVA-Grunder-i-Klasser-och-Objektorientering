package com.xawiahn.klasser_objektorientering;
import java.util.Scanner;

//public class main {
	
	/* INTRO "UPPGIFTER"
	public static void main(String[] args)
	{
		class Elev
		{
			int provPoang;
			String elevNamn;
			void skrivut()
			{
				System.out.println("Namn: " + elevNamn + " Poäng: " + provPoang);
			}
			Elev(int pP, String eNamn)
			{
				provPoang = pP;
				elevNamn = eNamn;
			}
		}
		Elev student = new Elev(14, "Kalle Anka");
		student.skrivut();
		student.provPoang = 16;
		student.skrivut();
	}
}*/

	/* ÖVNING 1
	public static void main(String[] args) {
		
		int tal = 2;
		Scanner sc = new Scanner(System.in);
		while(tal <= 20)
		{
			System.out.println(tal);
			tal += 2;
		}
	}
}*/
	
	/* ÖVNING 2
	public static void main(String[] args) {
		
		int tal[] = new int[3], raknare = 0, summa;
		tal[0] = 1;
		tal[1] = 2;
		tal[2] = 3;
		Scanner sc = new Scanner(System.in);
		while(raknare <20)
		{
			summa = tal[0] + tal[1] + tal[2];
			System.out.println(summa);
			raknare += 1;
			tal[0] = tal[1];
			tal[1] = tal[2];
			tal[2] = summa;
		}
	}*/


	/* ÖVNING 4-7
	public class main
	{
		public static void main(String[] args){
			
			class Boll
			{
				int radie = 0;
				String farg = " ";
				void skrivutBollInfo()
				{
					System.out.println("Bollfärg: " + farg + " Radie = " + radie);
				}
				Boll(int r, String f)
				{
					radie = r;
					farg = f;
				}
				Boll(int r)
				{
					radie = r;
					farg = "Röd och Orange";
				}
			}
			Boll minaBollar[] = new Boll[3];
			minaBollar[0] = new Boll(5, "Grön");
			minaBollar[1] = new Boll(9);
			minaBollar[2] = new Boll(2, "Rosa");
			for(int i = 0; i < 3; i++)
			{
				minaBollar[i].skrivutBollInfo();
			}
		}
	}*/
//}