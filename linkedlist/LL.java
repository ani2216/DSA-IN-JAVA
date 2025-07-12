package linkedlist;

class Node<T>{
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
	
}
	
public class LL<T> {
	
	Node<T> head;
	
	void insert(T data) {
		Node<T> a = new Node<>(data);
		
		if(isEmpty()) {
			head = a;
			return;
		}
		
		Node<T> temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = a;
		
	}
	
	void insertAtPos(T data,int pos) {
		Node<T> a = new Node(data);
		
		if(pos==0) {
			a.next = head;
			head = a;
			return;
		}
		
		if(pos==length()) {
			Node<T> temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			
			a.next = null;
			temp.next = a;
			return;
		}
		
		Node<T> prev = head;
		
		for(int i =0;i<pos-1;i++) {
			prev = prev.next;
		}
		
		a.next = prev.next;
		prev.next = a;
	}
	
	void delete(int pos) {
		
		if(pos==0) {
			head = head.next;
			return;
		}
		
		Node<T> prev = head;
		
		for(int i=0;i<pos-1;i++) {
			prev = prev.next;
		}
		
		prev.next = prev.next.next;
		
	}
	
	int length() {
		int size = 0;
		
		Node<T> temp = head;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		
		return size;
	}
	
	void print() {
		Node<T> temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void reverse() {
		
		if(length()==1) {
			print();
			return;
		}
		
		Node<T> curr = head;
		Node<T> prev = null;
		
		while(curr!=null) {
			Node<T> temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		while(prev!=null) {
			System.out.print(prev.data+" ");
			prev = prev.next;
		}
		
		System.out.println();
		
	}
	
	
	boolean isEmpty() {
		return head==null;
	}

	public static void main(String[] args) {
		LL a = new LL();
		a.insert(1);
		a.insert(2);
		a.insert(3);
		
		a.print();
		
		System.out.println(a.length());
		
		a.insertAtPos(4, 3);
		a.print();
		
		a.delete(3);
		a.print();
		
		a.reverse();
		
	}

}
