package akhila.learning;
class Class1
{
	void printMe()
	{
		System.out.println("Class1");
	}
}
class Class2 extends Class1
{
	void printMe()
	{
		System.out.println("Class2");
	}
}
public class TypeCasting {
	public static void main(String[] args) {
		//Widening and Narrowing Type casting
		int i=1000;
		long l=i;
		double d = 1000.123; 
		char c;
		System.out.println("Widening: i = "+i+" l= "+l+" d= "+d);
		//Type cast
		c=(char)65537;
		i=(int)c;
		l=(long)d;
		System.out.println("Narrowing "+" l= "+l+" d= "+d+" c="+c+" i= "+i);
		Class1 c1= new Class2();
		c1.printMe();
		Class2 c2 = (Class2) new Class1();//Run time Exception here
		c2.printMe();
		
	}

}
