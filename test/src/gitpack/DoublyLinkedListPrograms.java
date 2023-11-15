/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 10/25/23 
*/

package gitpack;
//create Class for Doubly Linked List
public class DoublyLinkedListPrograms {
	// Head of the list
	Node head;
	// tail of the list
	Node tail;
	int length;
	
	// Doubly Linked list Node
	class Node{
		int data;
		Node next;
		Node previous;
		
		// Constructor to create a new node
		Node(int data){
			this.data=data;
		}
	}
	
	public boolean isEmpty() {
		return length ==0;
	}
	
	//print elements in a doubly linked list in a forward way
	public void displayforward() {
		// Return head if it's empty
		if(head==null) {
			return;
		}
		//create a temporary Node which point to the head node.
		Node current=head;
		
		//encounter a while loop,and in while loop we place a condition
		//that whether current is equal to null or not.
		while(current!=null) {
			
			//print the data associated with this current node.
			System.out.print(current.data + "-->");
			
			//moving to the next node.
			current=current.next;
		}
		System.out.print("null");
		}
	//print elements in a doubly linked list in backward way
	public void displaybackward() {
		
		// Return head if it's empty
		if(head==null) {
			return;
		}
		//create a temporary Node which point to the tail node
		Node current=tail;
		
		//encounter a while loop,and in while loop we place a condition
		//that whether current is equal to null or not
		while(current!=null) {
			//print the data associated with this current node.
			System.out.print(current.data + "-->");
			
			//moving to the previous node.
			current=current.previous;
		}
		System.out.print("null");
	}
	
	//This method is used for adding node
	void add(int element) {
		
		Node temp=new Node(element);
		
		if(head==null) {
			//Move the head  point to temp
			head=temp;
			//Move the tail  point to temp
			tail=temp;
		}
		else {
			//Make next of tail as temp
			tail.next=temp;
			//Make previous of temp as tail
			temp.previous=tail;
			//Move the tail point to temp
			tail=temp;
		}
	} 
	
	//This method is used to insert a node at the beginning
	public void insertFirst(int element) {
		//Allocate the Node and Put in the data
		Node newNode=new Node(element);
		
		if(isEmpty()) {
			tail=newNode;
		}
		else {
			//Make previous of head as newNode
			head.previous=newNode;
		}
		//Make next of newNode as head
		newNode.next=head;
		
		//Move the head point to newNode
		head=newNode;
		
		//Increment the length of the list
		length++;
		
	}
	
	//This method is used to insert a node at the end.
	public void insertEnd(int element) {
		
		//Allocate the Node and Put in the data
		Node newNode= new Node(element);
		
		if(isEmpty()) {
			//Move the head point to newNode
			head=newNode;
		}
		else {
			//Make next of tail as newNode
			tail.next=newNode;
			//Make previous of newNode as tail
			newNode.previous=tail;
		}
		//Move the tail point to newNode
		tail=newNode;
	}
	
	//Remove First node in Doubly Linked List
	public Node deleteFirst() {
		if(isEmpty()) {
			System.out.println("The linkedlist is Empty");
		}
		//create a temporary Node which point to the head node.
		Node temp=head;
		
		if(head==tail) {
			//Move the tail point to null
			tail=null;
		}
		else {
			head.next.previous=null;
			
		}
		//Storing the next node
		head=head.next;
		
		//Make next of temp as null
		temp.next=null;
		
		return temp;
	}
	
	//Remove last node in Doubly Linked List
	public Node deleteLast() {
		if (isEmpty()) {
			System.out.println("the linkedlist is empty");
		}
		//create a temporary Node which point to the tail node.
		Node temp=tail;
		if(head==tail) {
			//Move the head point to null
			head=null;
		}
		else {
			tail.previous.next=null;
			
		}
		//Storing the next node
		tail=tail.previous;
		
		//Make previous of temp as null
		temp.previous=null;
		return temp;
		
	}
	
	//This method is used to reverse a doubly linked list
	public void reverse() {
		
		//create a temporary Node which point to the head node
		Node current=head;
		
		//create a temporary Node which point to null
		Node temp=null;
		
		//swap next and previous for all nodes of doubly linked list
		while(current!=null) {
			temp=current.previous;
			current.previous=current.next;
			current.next = temp;
			current=current.previous;
		}
		//Before changing head, check for the cases like empty list and list with only one node 
		if(temp!=null) {
			head=temp.previous;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListPrograms dll=new DoublyLinkedListPrograms();
		dll.add(10);
		dll.add(15);
		dll.add(20);
		dll.add(25);
    	dll.add(30);
    	
		dll.insertFirst(1);
		
		dll.insertEnd(10);
		
		dll.insertEnd(20);
		
	dll.displayforward();
	
	dll.deleteFirst();
	
	dll.displaybackward();
	}

}
