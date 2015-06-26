package Lpr2;

public class laporan2 {
	
		static boolean bool;
		static byte by;
		static char ch;
		static double d;
		static int i;
		
		static char c = 0xffff;
		static byte b = 0x7f;
		static short s = 0x7fff;
		static int i1 = 0x2f;
		static int i2 = 0X2F;
		static int i3 = 0177;
		static long n1 = 200L;
		static long n2 = 2001;
		static long n3 = 200;
		static float f1 = 1;
		static float f2 = 1F;
		static float f3 = 1f;
		static float f4 = 1e-45f;
		static float f5 = 1e+9f;
		static double d1 = 1d;
		static double d2 = 1D;
		static double d3 = 47e47d;
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			i+=2;
			
			if (bool==false){
				if (i==3){
					System.out.println("char = " +c);
					System.out.println("byte = " +b);
					System.out.println("short = " +s);
					System.out.println("init i1 = " +i1);
					System.out.println("init i2 = " +i2);
					System.out.println("init i3 = " +i3);
					System.out.println("long n1 = " +n1);
					System.out.println("long n2 = " +n2);
					System.out.println("long n3 = " +n3);
					System.out.println("float f1 = " +f1);
					System.out.println("float f2 = " +f2);
					System.out.println("float f3 = " +f3);
					System.out.println("float f4 = " +f4);
					System.out.println("float f5 = " +f5);
					System.out.println("double d1 = " +d1);
					System.out.println("double d2 = " +d2);
					System.out.println("double d3 = " +d3);
					kiki();
				}
				else
				{
					System.out.println("boolean = " +bool);
					System.out.println("byte = " +by);
					System.out.println("char = " +ch);
					System.out.println("double = " +d);
					System.out.println("int = " +i);
				}
			}
		}
		
		static void kiki(){
			Boolean refBoolean = new Boolean(true);
			boolean bool = refBoolean.booleanValue();

			Byte refByte = new Byte((byte) 123);
			byte b = refByte.byteValue();

			Character refChar = new Character('x');
			char c = refChar.charValue();

			Short refShort = new Short((short) 123);
			short s = refShort.shortValue();

			Integer refInt = new Integer(123);
			int i = refInt.intValue();

			Long refLong = new Long(123L);
			long l = refLong.longValue();

			Double refDouble = new Double(12.3D);
			double d = refDouble.doubleValue();

			System.out.println("Boolean       = " + bool);
			System.out.println("Byte       = " + b);
			System.out.println("Charackter = " + c);
			System.out.println("Short      = " + s);
			System.out.println("Integer    = " + i);
			System.out.println("Long       = " + l);
			System.out.println("Double     = " + d);
		}

	}



