package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {
	static int q =11;
	int p = 10;
	

	public static void main(String[] args) {
		//valid declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//valid initialization
		pi=3.14f;
		d=20.22d;
		e= 'v';
		
		a=10;
		b=10;
		c=10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(a);
		
		int myNum= 5;  //Integer
		float myFloatNum= 5.99f; //Floating point number
		char myLetter= 'D'; //character
		boolean myBoolean = true ;  //Boolean
		String myText= "Heelo";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBoolean);
		System.out.println(myText);
		
		
		
		double f;
		int i =10;
		f=i; //Type conversion
		
		double g= 10;
		int j;
		j=(int)g;  //Type casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k=10;
		boolean l=true;
		long m= 10L;
		float n= 1.2f;
		double o = 1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
	
		System.out.println(ABC.j); //data+Functions/methods
		
		ABC obj1= new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
	
		ABC obj2= new ABC();
		System.out.println(obj2.i);
		
		//System.out.println(obj1.j++);
		//System.out.println(obj1.j);
		
		ABC.typeConversionAndTypeCasting();
		
	}
	
	int r=10;
	void display() {
		int a=5;  // local Variable
		System.out.println("This is Display method!");
		System.out.println(a);
	}
}

class ABC{
	static int j= 10;  //class variable/static variables
	int i=10;
	static void display() {
		int a=5;  // local Variable
		System.out.println("This is Display method!");
		System.out.println(a);
}
	
	static void typeConversionAndTypeCasting() {
		double f; //64 slots
		int i=10; //32 slots
		f=i;
		System.out.println(f);
		
		double g=10; //64 slots
		int j; //32 slots
		j=(int)g; //TypeCasting
		
		System.out.println(i);
		System.out.println(j);
		
	}
}
