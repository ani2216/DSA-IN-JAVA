package stackandqueue;

public class QueueUsingArray {
	
	int front,rear,size;
	int[] arr;
	
	QueueUsingArray(int size){
		this.size = size;
		front = -1;rear = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		return rear==size-1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("OverFlowed!");
		} else {
			front = 0;
			rear++;
			
			arr[rear] = data;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("UnderFlow!");
			return 0;
		}
		
		int temp = arr[front];
		if(front>=rear) {
			front = -1; rear =-1;
		}
		front++;
		return temp;
	}
	
	public int getSize() {
		return rear-front+1;
	}
	
	public int peek() {
		if(front>=rear) {
			System.out.println("UnderFlow!");
			return 0;
		}
		return arr[front];
	}
	
	public static void main(String[] args) {
		QueueUsingArray q1 = new QueueUsingArray(5);
		q1.enqueue(1);
		q1.enqueue(3);
		System.out.println(q1.getSize());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.getSize());
		System.out.println(q1.peek());
	}

}
