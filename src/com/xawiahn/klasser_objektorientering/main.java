package com.xawiahn.klasser_objektorientering;

public class main {
class Elev
{
	int provPoang;
	String elevNamn;
	
	Elev(int pP, String eNamn)
	{
		provPoang = pP;
		elevNamn = eNamn;
	}
	void skrivut()
	{
		System.out.println("Namn: " + elevNamn + " Po�ng: " + provPoang);
	}

}
public static void main(String args[])
{
	Elev student = new Elev(14, "Kalle Anka");
	student.skrivut();
	student.provPoang = 16;
	student.skrivut();
}
}
