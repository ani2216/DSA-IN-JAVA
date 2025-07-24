package stackandqueue;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}

public class StackUsingLL {
	Node head;
	Node top;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next !=null) {
				temp = temp.next;
			}
			
			temp.next = node;
			top = node;
		}	
	}
	
	public int top() {
		return top.data;
	}
	
	public int size() {
		int count = 0;
		
		Node temp = head;
		
		while(temp !=null) {
			temp = temp.next;
			count++;
		}
		
		return count;
	}
	
	public void pop() {
		
		System.out.println("Popped Element: "+top.data);
		
		Node curr = head, prev = null;
		
		while(curr != top) {
			prev = curr;
			curr = curr.next;
		}
		
		top = prev;
		top.next = null;
		
	}
	
	public static void main(String[] args) {
		StackUsingLL s1 = new StackUsingLL();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(5);
		
		System.out.println(s1.top());
		System.out.println(s1.size());
		
		s1.pop();
		
		System.out.println(s1.size());
		System.out.println(s1.top());
	}
	

}


