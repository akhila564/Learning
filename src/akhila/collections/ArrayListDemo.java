package akhila.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;



public class ArrayListDemo {

	private static List<Integer> aLMethods(List<Integer>  list1)
	{
		
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(2);
		list1.add(null);
		System.out.println("list1: "+list1);
		list1.remove(3);
		System.out.println("list1: "+list1);
		list1.remove(2);
		System.out.println("list1: "+list1);
		list1.add(0,10);
		System.out.println("list1: "+list1);
		System.out.println(list1.set(0, 9));
		System.out.println("list1: "+list1);
		
		Collection<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println("list2: "+list2);
		
		//Bulk opertions
		System.out.println("\n Bulk Methods");
		list1.removeAll(list2);
		System.out.println("After removeAll -list1: "+list1);
		list1.add(3);
		list1.add(1);
		list1.retainAll(list2);
		System.out.println("\nlist1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println("After retainAll -list1: "+list1);
		System.out.println("list1.containsAll(list2) - "+list1.containsAll(list2));
		System.out.println("list1.containsAll(list1) - "+list1.containsAll(list1));
		
		//Search Operation
		System.out.println("\n Search Methods");
		list1.add(5);
		list1.add(10);
		list1.add(11);
		list1.add(10);
		System.out.println("list1: "+list1);
		System.out.println("list1.contains(3) - "+list1.contains(3));
		System.out.println("list1.contains(15) - "+list1.contains(15));
		System.out.println("list1.indexOf(10) - "+list1.indexOf(10));
		System.out.println("list1.lastIndexOf(10) - "+list1.lastIndexOf(10));
		
		//Range views
		System.out.println("\n Range view Methods");
		List<Integer> list3 = list1.subList(2, 5);
		System.out.println("list1: "+list1);
		System.out.println("list3: "+list3);
		list3.set(0, 100);
		System.out.println("list1: "+list1);
		System.out.println("list3: "+list3);
		list3.add(0,0);
		System.out.println("list1: "+list1);
		System.out.println("list3: "+list3);
		list1.add(0,200);
		System.out.println("list1: "+list1);
		//System.out.println("list3: "+list3); run time concurrent modification exception
		
		// print - iterable
		for(int element : list1)
		{
			System.out.println("element: "+element);
			if(element==0)
			{
				//list1.remove(Integer.valueOf(element));//run time concurrent modification exception
			}
		}
		
		
		return list1;
		
		
		
	}
	public static void listIteratorDemo()
	{
		System.out.println("\nList Iterator Demo");
		List<String> list =new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		System.out.println("Displaying List");
		for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();)
		{
			System.out.println("listIterator.nextIndex: "+listIterator.nextIndex() + ", listIterator.next: "+ listIterator.next());
		}
		System.out.println("Adding removing setting");
		for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();)
		{			
			System.out.println("listIterator.nextIndex: "+listIterator.nextIndex() + ", listIterator.next: "+ listIterator.next());
			System.out.println("listIterator.previous() - "+listIterator.previous());
			System.out.println("Adding test");
			listIterator.add("test");
			System.out.println("listIterator.nextIndex: "+listIterator.nextIndex() + ", listIterator.next: "+ listIterator.next());
			System.out.println(" goto previous and remove");
			listIterator.previous();
			listIterator.previous();
			listIterator.remove();
			System.out.println("listIterator.nextIndex: "+listIterator.nextIndex() + ", listIterator.next: "+ listIterator.next());
		}
		
		
	}
	public static void iteratorDemo(List<Integer> list1)
	{
		System.out.println("\nIterator");
		System.out.println("list1 = "+list1);
		Iterator<Integer> iterator=list1.iterator();
		while(iterator.hasNext())
		{
			int element = iterator.next();
			System.out.println("element: "+element);
			if(element==0)
			{
				iterator.remove();
				System.out.println("removed 0");
				iterator.forEachRemaining(Filter::add);
			}
			
		}
		System.out.println("list1 after remove 0 = "+list1);
		System.out.println("print using forEach");
		list1.forEach(System.out::println);
		System.out.println("print using forEach Filter");
		list1.forEach(Filter::filter);
		System.out.println("print using Consumer");
		list1.forEach(new Filter());
		
	}
	 
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		aLMethods(list1);
		iteratorDemo(list1);
		listIteratorDemo();
	}
}
class Filter implements Consumer
{
	static void filter(Integer i)
	{
		if((int)i==1)
		{
			System.out.println("Filtering 1");
		}
	}
	@Override
	public void accept(Object i) {
		if((int)i==200)
		{
			System.out.println("Filtering 200");
		}
	}
	static void add(Integer i)
	{
		System.out.println("After adding 7 - "+ (i+7));
	}
	
}
