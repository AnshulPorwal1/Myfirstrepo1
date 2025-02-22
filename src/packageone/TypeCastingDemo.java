package packageone;

public class TypeCastingDemo {

	public static void main(String[] args) 
	{
		/*
		 * Primitive to Primitive Casting 
		 * 1. Implicit 
		 * 
		 * 2. Explicit
		 */
		//Implicit small size --> large size 
		//byte-->char-->short-->int-->long-->float-->double
		
		/*byte b1=66;
		char c1=(char)b1;
		System.out.println("byte to char conversion is:"+c1);
		*/
		int i=6;
		long l=i;
		System.out.println("int to long conversion is:"+l);
		
		char c='B';
		int i1=c;
		System.out.println("char to int conversion is:"+i1);
		
		//Explicit Manual Casting 
		//double-->float-->long-->int-->short-->char-->byte
		
		double d1=9999.999;
		float f1=(float)d1;
		System.out.println("double to float Explicit conversion is:"+f1);
		

	}

}
