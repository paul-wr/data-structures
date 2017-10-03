package apps;

import ds.BasicStack;
import ds.Stack;

public class App {

	public static void main(String[] args) {
		Stack stack = new BasicStack();
		
		stack.push("Hello");
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
	}

}
