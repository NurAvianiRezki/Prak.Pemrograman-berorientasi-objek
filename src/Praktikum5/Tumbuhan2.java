package Praktikum5;

public class Tumbuhan2 {
	
	private String namaSpesies;
	private int LebarDaun;
	
	private Tumbuhan2()
	{
		namaSpesies = "Sayur";
		LebarDaun=30;
	}

	private Tumbuhan2(String nama, int lebar){
		namaSpesies = nama;
		LebarDaun = lebar;
	}
	
	public void cetakTumbuhan2() {
		System.out.println(namaSpesies + " " + LebarDaun);
	}
	
	public static void main(String args[]) {
		Tumbuhan2 tumbuhan = new Tumbuhan2 ();
		tumbuhan.cetakTumbuhan2();
		tumbuhan = new Tumbuhan2("Buah", 20);
		tumbuhan.cetakTumbuhan2();
	}
}
