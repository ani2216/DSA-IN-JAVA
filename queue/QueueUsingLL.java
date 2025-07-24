package stackandqueue;

class Nodes{
	int data;
	Nodes next;
	Nodes(int data){
		this.data = data;
		next = null;
	}
}

public class QueueUsingLL {
	
	Nodes front,rear;
	
	boolean isEmpty() {
		return front==null;
	}
	
	void enqueue(int data) {
		Nodes node = new Nodes(data);
		
		if(isEmpty()) {
			front = node;
			rear = node;
		} else {
			Nodes temp = front;
			
			while(temp.next!=null) {
				temp = temp.next;
			}
			
			temp.next = node;
			rear = temp.next;
			node.next = null;
		}
	}
	
	void size() {
		int count = 0;
		
		Nodes temp = front;
		
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		
		System.out.println("Size: "+count);
	}
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Empty Queue!");
			return;
		}
		System.out.println("Peeked:"+front.data);
	}
	
	void dequeue() {
		
		if(isEmpty()) {
			System.out.println("Emtpy Queue!");
		}
		System.out.println("Deleted Element: "+front.data);
		
		if(front.next!=null) {
		front = front.next;
		} else {
			front = null;rear = null;
		}
	}
	
	public static void main(String[] args) {
		QueueUsingLL q1 = new QueueUsingLL();
		
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(71);
		
		q1.size();
		q1.peek();
		
		q1.dequeue();
		
		q1.size();
		q1.peek();
		
		q1.dequeue();
		q1.dequeue();
		
		q1.size();
		q1.peek();
		
		q1.dequeue();
		
		q1.peek();
		q1.size();
		
	}
	
}
