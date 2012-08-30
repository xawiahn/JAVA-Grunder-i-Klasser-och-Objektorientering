package com.xawiahn.klasser_objektorientering;
import java.util.Scanner;

public class main {
	
	/* INTRO "UPPGIFTER"
	public static void main(String args[])
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
}