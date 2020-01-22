package akhila.learning;

public class FibonacciSeries {
	 void fibonacci(int n)
	{
		if(n>=1)
		{
			System.out.print("1");
		}
		if(n>=2)
		{
			System.out.print(" 1");
		}
		int n1=1,n2=1,temp;
		for(int i=3;i<=n;i++)
		{
			temp= n1 + n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
			
		}
		System.out.println();
	}
	 int rfibonacci(int n)
	 {
		 return (n==1||n==2)? 1:(rfibonacci(n-1)+rfibonacci(n-2));
	 }
	public static void main(String[] args) {
		//int n;
		FibonacciSeries fs= new FibonacciSeries();
		for(int i=1; i<10;i++)
		{
		 
		 fs.fibonacci(i);
		 System.out.println(fs.rfibonacci(i));
		}
		
	}

}
