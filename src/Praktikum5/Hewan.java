package Praktikum5;

public class Hewan {
	public static int JUMLAH_HEWAN = 0;
	public String spesies;
	
	public static void tambahHewan(){
		JUMLAH_HEWAN++;
	}
	
	public static void main(String args[]){
		Hewan objekHewan = new Hewan();
		objekHewan.JUMLAH_HEWAN=0;
		objekHewan.spesies = "Kucing";
		Hewan.tambahHewan();
		System.out.println(Hewan.JUMLAH_HEWAN);
		
		Hewan objekHewanDua = new Hewan();
		objekHewanDua.spesies = "Anjing";
		Hewan.tambahHewan();
		System.out.println(Hewan.JUMLAH_HEWAN);
		Hewan.tambahHewan();
		objekHewan.JUMLAH_HEWAN=0;
		System.out.println(objekHewan.JUMLAH_HEWAN);
		objekHewan.JUMLAH_HEWAN=2;
		Hewan.tambahHewan();
		System.out.println(objekHewanDua.JUMLAH_HEWAN);	
		
	}
	
	public static void test(){
		Hewan objekHewan = new Hewan();
		Hewan objekHewanDua = new Hewan();
		
	}
}
