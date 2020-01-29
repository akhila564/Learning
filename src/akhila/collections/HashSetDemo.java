package akhila.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void  HSDemo()
	{
		Set<String> set1=new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("a");
		System.out.println("Set1 : "+set1);
	}
	public static void main(String[] args)
	{
		HSDemo();
	}
	

}
