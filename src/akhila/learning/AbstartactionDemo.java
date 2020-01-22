package akhila.learning;

interface Shape
{
	  
	 int area();
	 int perimeter() ;
}

abstract class Quadrilateral implements Shape
{
	private final int a,b,c,d;
	 Quadrilateral(int a,int b,int c,int d)
	 {
		 this.a=a;
		 this.b=b;
		 this.c=c;
		 this.d=d;
	 }
	
	 public int perimeter() {
		 return a+b+c+d;
	 }
	 String getName()
	 {
		 return "Quadrilateral";
	 }
	
}
 class Rectangle extends  Quadrilateral
 {
	 int l,b;
	
	  Rectangle(int l,int b)
	 {
		  super(l,b,l,b);
		 this.l=l;
		 this.b=b;
	 }
	  
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return l*b;
	}
	String getName()
	 {
		 return "Rectangle";
	 }
	String getOrigName()
	{
		return super.getName();
	}
	 
	 
 }
 class Square extends Quadrilateral
 {
	 int a;
	 Square(int a)
	 {
		 super(a,a,a,a);
		 this.a=a;
	 }
	@Override
	public
	int area() {
		// TODO Auto-generated method stub
		return a*a;
	}
 }
 class Trapezoid extends Quadrilateral
 {
	 int a,b,c,d,h;
	 Trapezoid (int a,int b,int c,int d,int h)
	 {
		 super(a,b,c,d);
		 this.a=a;
		 this.b=b;
		 this.c=c;
		 this.d=d;
		 this.h=h;
	 }

	@Override
	public
	int area() {
		// TODO Auto-generated method stub
		return ((a+c)/2)*h;
	}

	 
 }
 class Circle implements Shape
 {
	 int r;
	 Circle(int r)
	 {
		 this.r=r;
	 }

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (r*r*22)/7;
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (2*r*22)/7;
	}
	 
 }
public class AbstartactionDemo {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,3);
		System.out.println("Rectangle Area = "+ r.area());
		System.out.println("Rectangle Perimeter ="+r.perimeter());
		System.out.println("Rectangle getName ="+r.getName());
		System.out.println("Rectangle getOrigName ="+r.getOrigName());
		Square s=new Square(5);
		System.out.println("Square Area = "+ s.area());
		System.out.println("Square Perimeter ="+s.perimeter());
		System.out.println("Square getName ="+s.getName());
		Trapezoid t=new Trapezoid(5,4,7,4,3);
		System.out.println("Trapezoid Area = "+ t.area());
		System.out.println("Trapezoid Perimeter ="+t.perimeter());
		Circle c=new Circle(5);
		System.out.println("Circle Area = "+ c.area());
		System.out.println("Circle Perimeter ="+c.perimeter());
		
	}
	

}
