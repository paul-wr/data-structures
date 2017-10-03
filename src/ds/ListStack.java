package ds;

import java.util.ArrayList;

public class ListStack<X> implements Stack<X> {
	private ArrayList<X> data;
	private int stackPointer;
	
	public ListStack(){
		data = new ArrayList<X>();
		stackPointer = 0;
	}

	@Override
	public void push(X newItem) {
		data.add(stackPointer++, newItem);
		
	}

	@Override
	public X pop() {
		if(stackPointer == 0){
			throw new IllegalArgumentException("No more items onb the stack.");
		}	
		return data.get(--stackPointer);
		
	}

	@Override
	public boolean contains(X item) {
		boolean found = false;
		
		for(int i = 0; i < stackPointer; i++){
			if(data.get(i).equals(item)){
				found = true;
				break;
			}
		}
		
		return found;
	}

	@Override
	public X access(X item) {
		while(stackPointer > 0){
			X tmpItem = pop();
			if(item.equals(tmpItem)){
				return tmpItem;
			}
		}
		
		throw new IllegalArgumentException("Could not item on the stack: " + item);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return stackPointer;
	}
	
}
