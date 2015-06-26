package Praktikum2;

public class Main {

	public static void main(String[] args)  throws Exception {
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
		
		Float refFloat = new Float(12.3F);
		float f = refFloat.floatValue();
		
		Double refDouble = new Double(12.3D);
		double d = refDouble.doubleValue();
		
		System.out.println("Boolean=" + bool);
		System.out.println("byte =" + b);
		System.out.println("Character=" + c);
		System.out.println("short=" + s);
		System.out.println("int =" + i);
		System.out.println("long=" + l);
		System.out.println("float=" + f);
		System.out.println("double=" + d);
	

}
}