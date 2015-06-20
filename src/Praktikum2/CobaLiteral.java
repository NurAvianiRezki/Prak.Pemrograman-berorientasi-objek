package Praktikum2;

public class CobaLiteral {

	public static void main(String[] args) {

		char c = 0xffff;
		byte b = 0x7f;
		short s = 0x7fff;
		int i1 = 0x2f;
		int i2 = 0x2f;
		int i3 = 0177;
		long n1 = 200L;
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		float f4 = 1e-45f;
		float f5 = 1e+9f;
		double d1 = 1d;
		double d2 = 1D;
		double d3 = 47e47d;

		System.out.println("char=" + c);
		System.out.println("byte =" + b);
		System.out.println("short=" + s);
		System.out.println("int i1=" + i1);
		System.out.println("int i2=" + i2);
		System.out.println("int i3=" + i3);
		System.out.println("long n1=" + n1);
		System.out.println("long n2=" + n2);
		System.out.println("long n3=" + n3);
		System.out.println("float f1=" + f1);
		System.out.println("float f2=" + f2);
		System.out.println("float f3=" + f3);
		System.out.println("float f4=" + f4);
		System.out.println("float f5=" + f5);
		System.out.println("double d1=" + d1);
		System.out.println("double d2=" + d2);
		System.out.println("double d3=" + d3);
	}
}
