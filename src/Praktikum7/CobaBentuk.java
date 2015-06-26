package Praktikum7;
import Praktikum7Model.Model;
import Praktikum7Model.BujurSangkar;
import Praktikum7Model.SegitigaSamaKaki;
import Praktikum7Model.SegitigaSamaSisi;

public class CobaBentuk {
	
	public static void cetakBangun(Model b) {
		
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	
	public static void main(String args[]) {
		
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}
}
