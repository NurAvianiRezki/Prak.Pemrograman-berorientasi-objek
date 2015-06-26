package Praktikum5;

public class Orang2 {
	
	public String nama;
	public String alamat;
	public int tinggibadan;
	public float beratbadan;
	
	public void cetakOrang()
	{
		System.out.println(nama + "," + alamat + "," + tinggibadan + "," + beratbadan);
	}

	public static void main (String[] args){
		Orang2 objekOrang = new Orang2();
		objekOrang.nama = "Isnaeni";
		objekOrang.alamat = "Manuruki";
		objekOrang.tinggibadan = 170;
		objekOrang.beratbadan = 60.4f;
		objekOrang.cetakOrang();
		
		Orang2 objekOrangDua = new Orang2();
		objekOrangDua.nama = "Isna Amalia";
		objekOrangDua.alamat = "Perdos UNM";
		objekOrangDua.tinggibadan = 150;
		objekOrangDua.beratbadan = 80.9f;
		objekOrangDua.cetakOrang();			
	}
}
