package packageone;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		//boolean true/false 1bit
		boolean status = true;
		System.out.println("Boolean data type is:"+status);
		status = false;
		System.out.println("Boolean data type is:"+status);
		
		System.out.println("******************************");
		/*
		 * Character data type size is 2 byte 
		 * 1. Single Character
		 * 2. Special Character
		 * 3. UniCode(Ascii) 
		 * Comes under Numeric family 
		 * A to Z = 65 to 90
		 * a to z = 97 to 122
		 * 0 to 9 = 48 to 57
		 */
		char c1 = 'A';
		System.out.println("Single Character data is:"+c1);
		
		char c2 = '@';
		System.out.println("Special Character data is:"+c2);
		
		char c3 = 90;
		System.out.println("Unicode Character data is:"+c3);
		
		char c4 = 99;
		System.out.println("Unicode Character data is:"+c4);
		
		char c5 = 53;
		System.out.println("Unicode Character data is:"+c5);
		
		System.out.println("*****************************");
		
		/*
		 * Integral ---> Integer
		 * 1. byte 2. short 3. int (by default any number) 4. long 
		 */
		//byte 2byte -128 to 127 
		byte b1=125;
		System.out.println("Byte data is:"+b1);
		byte b2=-125;
		System.out.println("Byte data is:"+b2);
		
		//short 2byte -32,768 to 32,767
		short s1=32767;
		System.out.println("Short data is:"+s1);
		short s2=-32768;
		System.out.println("Short data is:"+s2);
		
		//Integer 4byte -2147483648 to 2147483647
		int i1=2147483647;
		System.out.println("Integer data is:"+i1);
		int i2=-2147483648;
		System.out.println("Integer data is:"+i2);
		
		//Long 8byte -9223372036854775808 to 9223372036854775807 ( -suffix L)
		long l1=9223372036854775807L;
		System.out.println("Long data is:"+l1);
		long l2=-9223372036854775808L;
		System.out.println("Long data is:"+l2);
		long l3=751839084;
		System.out.println("Long data is:"+l3);
		System.out.println("*****************************");
		
		/*
		 * Floating Point --> 4byte (suffix F)
		 * Double data --> 8byte
		 */
		float f1=55.66F;
		System.out.println("Float data is:"+f1);
		double d1=9999.9999;
		System.out.println("Double data is:"+d1);
		
		
	}

}
