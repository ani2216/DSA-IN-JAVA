package stackandqueue;

public class StackUsingArray {
	
	int size,top;
	int[] arr;
	
	StackUsingArray(int size){
		this.size = size;
		top = -1;
		arr = new int[size];	
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public int getSize() {
		return top+1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is OverFlow!");
		} else {
			top++;
			arr[top] = data;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Underflow!");
		} else {
			int temp = arr[top];
			top--;
			return temp;
		}
		
		return 0;
	}
	
	public int top() {
		return arr[top];
	}
	
	public static void main(String[] args) {
		StackUsingArray s1 = new StackUsingArray(5);
		
		s1.push(1);
		s1.push(3);
		s1.push(0);
		
		System.out.println(s1.getSize());
		System.out.println(s1.top());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		
		s1.push(5);
		System.out.println(s1.top());
		System.out.println(s1.getSize());
		s1.pop();
		s1.pop();
		System.out.println(s1.getSize());
		s1.pop();
		System.out.println(s1.getSize());
		s1.pop();
		
	}
	

}
