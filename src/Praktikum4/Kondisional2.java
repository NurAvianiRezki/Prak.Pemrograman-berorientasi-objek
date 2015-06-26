package Praktikum4;

public class Kondisional2 
{
	public static void main(String[] args)
	{
		int nilaiAkhir=76;
		char nilaiHuruf;
		
		if (nilaiAkhir>=90) { nilaiHuruf='A'; }
		else if (nilaiAkhir>=80) { nilaiHuruf='B';}
		else if (nilaiAkhir>=70) { nilaiHuruf='C';}
		else if (nilaiAkhir>=60) { nilaiHuruf='D';}
		else { nilaiHuruf='E';}
	
		System.out.println("Nilai Huruf = "+nilaiHuruf);
		}
	}

