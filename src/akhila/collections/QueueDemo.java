package akhila.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
	public static void main(String[] args) {
		dequeDemo();
	}

	private static void dequeDemo() {
		System.out.println("Demo of Queue");
		Deque<String> deque=new ArrayDeque<>();
		deque.add("c");
		deque.add("c++");
		deque.add("java");
		System.out.println("printing Queue");
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		//Stack
		deque.push("c");
		deque.push("c++");
		deque.push("java");
		System.out.println("\nprinting stack");
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		
	}

}
