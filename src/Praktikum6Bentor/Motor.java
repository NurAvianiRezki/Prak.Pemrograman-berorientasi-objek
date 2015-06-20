package Praktikum6Bentor;

import Praktikum6.Odong2;
import Praktikum6.Becak;
import Praktikum6utama.Bentor;

public class Motor extends Bentor {
	
	public Motor() {
		
	}
	
	public void balap() {
		odong1 = new Odong2();
		stater();
		nama = "Motor isna";
		System.out.println("Balappppp ");
	}

	public static void main(String args[]) {
		Motor motor = new Motor();
		motor.balap();
	}
	
	public void stater() {
		System.out.println("Tarik motor");
	}
}
