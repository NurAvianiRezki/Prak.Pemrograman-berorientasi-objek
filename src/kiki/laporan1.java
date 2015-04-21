/**
 * 
 */
package kiki;

/**
 * @author Isnaeni
 *
 */
public class laporan1 {

	/**
	 * @param args
	 */
	static String Praktikum = "Praktikum Pertama ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Praktikum2 = "Praktikum Kedua";
		System.out.println("ini praktikum kedua");
		System.out.println("ini praktikum");
		System.out.println(Praktikum2);
		
		test();
		hitung();
		biodata();
		

	}
	public static void test()
	{
		System.out.println(Praktikum);
	}
	public static void hitung()
	{
		int a = 9*3;
		float b = 9/2;
		System.out.println("Perkalian" + a);
		System.out.println("Pembagian" + a);
	}
	public static void biodata()
	{
		String nama = "NuravianiR";
		String nim = "60200112046";
		System.out.println("nama" + nama +"\n Nim" + nim );
	}

}
