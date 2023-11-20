/*@author Joseph Nakhle 


@version: 2023-03 (4.27.0)
@since release 10/30/23 
*/


package gitpack;

public class CircularLinkedListPrograms {
	Node last;
	int length;
	
	// Define the Node class
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	CircularLinkedListPrograms(){
		last=null;
		length=0;
	}
	
	int length(){
		return length;
	}
	

	boolean isEmpty() {
		return length==0;
	}
	
	// Initialize the Nodes.
	public void createCircularlinkedlist() {
		Node first= new Node(1);
		Node second= new Node(5);
		Node third= new Node(10);
		Node fourth= new Node(15);
		
		// Connect nodes
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		
		last=fourth;
	}
	//Print elements in a circular linked list 
	public void display() {
		// Return last if it's empty
		if(last==null) {
			return;
		}
		//create a temporary Node which point to the next of last node.
		Node first=last.next;
		
		//encounter a while loop,and in while loop we place a condition
		//that whether first is equal to last or not.
		while(first!=last) {
			//print the data associated with this current node.
			System.out.print(first.data + " ");
			
			//moving to the next node.
			first=first.next;
		}
		System.out.print(first.data);
	}
	
	//This method is used to insert a node at the beginning
	public void inserFirst(int element) {
		
		//Allocate the Node and Put in the data
		Node newNode= new Node(element);
		
		if(last==null) {
			last=newNode;
		}
		else {
			newNode.next=last.next;
		}
		//Make next of last as newNode
		last.next=newNode;
		//increment the length of the list
		length++;
	}
	//This method is used to insert a node at the end.
	public void insertLast(int element) {
		//Allocate the Node and Put in the data
		Node newNode=new Node(element);
		
		if(last==null) {
			//Move the last point to newNode
			last=newNode;
			//Make next of last as last
			last.next=last;		
	}
	else {
		newNode.next=last.next;
		//Make next of last as newNode.
		last.next=newNode;
		//Move the last point as newNode.
		last=newNode;
	}
		//increment the length of the list
		length++;
	}
	
	//Remove First node in Circular Linked List
	public Node removeFirst() {
		
		if(isEmpty()) {
			System.out.println("The linkedlist is empty");
		}
		//create a temporary Node which point to the next of last.
		Node temp=last.next;
		
		if(last.next==last) {
			//Move the last point to null
			last=null;
		}
		else {
			last.next=temp.next;
			
		}
		temp.next=null;
		length--;
		return temp;
		
	}
	//Remove last node in Circular Linked List
	public Node removeLast() {
		if(isEmpty()) {
			System.out.println("The linkedlist is empty");
		}
		//create a temporary Node which point to the next of last node.
		Node temp=last.next;
		if(last.next==last) {
			//Move the last point to null
			last=null;
			//Make next of temp as null
			temp.next=null;
		}
		else {
			temp.next.next=last.next;
			//Make next of last as null
			last.next=null;
			
			//Storing the next node
			last=temp.next;
			
		}
		
		length--;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedListPrograms cll=new CircularLinkedListPrograms();
		cll.createCircularlinkedlist();
		cll.inserFirst(2);
		cll.inserFirst(5);
		cll.insertLast(10);
		cll.insertLast(20);
		cll.display();
		System.out.println();
		cll.removeFirst();
		cll.display();
		System.out.println();
		cll.removeLast();
		cll.display();
	}

}


