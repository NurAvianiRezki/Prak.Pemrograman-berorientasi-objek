package Praktikum6utama;
import Praktikum6Bentor.Bajaj;
import Praktikum6Bentor.Motor;

public class BentorTest {
	
	public static void staterBentor(Bentor bentor) {
		bentor.stater();
	}
	
	public static void main(String args[])
	{
		Bentor bajaj = new Bajaj();
		Motor motor = new Motor();
		
		staterBentor(new Bentor());
		
		staterBentor(bajaj);
		
		staterBentor(motor);
	}
}
