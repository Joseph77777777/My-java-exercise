/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 10/20/23 
*/


package gitpack;

public class SinglyLinkedListPrograms {

	Node head;
	
	public static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
					
		}
	}
	
	//print elements in a singly linked list
	public void display() {
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
	//This function is in SinglyLinkedListProgram class. 
	 //Inserts a new Node at the beginning of a linkedlist
	
	public void insertFirst(int element) {
		
		//Allocate the Node and Put in the data
		Node newNode=new Node(element);
		
		//Make next of new Node as head
		newNode.next=head;
		
		//Move the head  point to new Node 
		head=newNode;
	}
	
	//insert a new node at the end.
	public void insertLast(int element) {
		
		////Allocate the Node and Put in the data
		Node newNode =new Node(element);
		
		//If the Linked List is empty, then make the new node as head 
		if(head==null) {
			head=newNode;
		}
		//traverse till the last node
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		//Change the next of last node 
		current.next=newNode;
	}
	
	//Remove First Element In Linked List
	public void removeFirst() {
		// Return head if it's empty
		if(head==null) {
			return;
		}
		// else if next pointer of head is equal to null 
		else if(head.next==null) {
			//updating head as null
			head=null;
		}
		// else if next pointer of head is not equal to null 
		else if(head.next!=null) {
			//create a temporary Node which point to the head node.
			Node current=head;
			//Storing the next node
			head=head.next;
			//updating the next pointer of current to null
			current.next=null;
		}
	}
	
	//Delete node from the end of a linked list
	public void removeLast() {
		// Return head if it's empty
		if(head==null) {
			return;
		}
		// else if next pointer of head is equal to null 
		else if (head.next==null) {
			//updating head as null
			head=null;
		}
		// else if next pointer of head is not equal to null
		else if (head.next!=null) {
			
			//create a temporary Node which point to the head node.
			Node current=head;
			
			//create a temporary Node which point to null.
			Node previous=null;
			
			//using while loop
			while(current.next!=null) {
				
				//updating previous as current 
				previous=current;
				
				//updating the next pointer of current
				current=current.next;
			}
			//updating the next pointer of previous
			previous.next=null;
		}
	}
	//Search an element in a linked list
	public boolean search(int Key) {
		// Return false if head equal to  null
		if (head==null) {
			return false;
		}
		//create a temporary Node which point to the head node
		Node current=head;
		
		//using while loop
		while(current!=null) {
			
			if(current.data==Key) {
				// data found
				return true;
				
			}
			//move to the next node
			current=current.next;
		}
		// data found
		return false;
	
	}
	//finding the length of the linked list:
	public  int size() {
		
		//Initialize count as 0 
		int count=0;
		//create a temporary Node which point to the head node
		Node current=head;
		// Do following while current is not NULL
		while(current!=null) {
			current=current.next;
			
			//increment count
			count++;
		}
		return count;
	}
	
	//remove duplicate from sorted Singly Linked List
	public void removeDuplicate() {
		
		// Return head if it's empty
		if(head==null) {
			return;
		}
		// create node current which will point to the head
		Node current=head;
		// using while loop 
		while(current.next!=null && current.next.next!=null) {
			
			//Compare current node data with the next node data
			if(current.data==current.next.data) {
				
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
	}
	
	//Move last element to front of a given Linked List
	public Node moveFront(Node head) {
		//If linked list is empty or it contains only one node then simply return head.
		if(head==null || head.next==null) {
			return head;
		}
		//create node current which will point to the head
		Node current=head;
		//using while loop 
		while (current.next.next!=null)
		{
			//moving to the next node
			current=current.next;
		}
		//create a temporary Node which point to the next node of current.
		Node last=current.next;
		
		//updating the next pointer of current
		current.next=null;
		
		//updating the next pointer of last
		last.next=head;
		
		return last;
	}
	
	//reverse a singly linked list 
	public Node reverse() {
		
		//create a temporary Node which point to the head node.
		Node current=head;
		//create a temporary Node which point to null
		Node next=null;
		//create a temporary Node which point to null
		Node previous=null;
		
		//encounter a while loop,and in while loop we place a condition
		//that whether current is equal to null or not.
		while(current!=null) {
			
			//Before changing the next of current, store the next node
			 next=current.next;
			 
			 //updating the next pointer of current to previous
			 current.next=previous;
			 
			 //updating previous as current and current as next
			 previous=current;
			 current=next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListPrograms sll =new SinglyLinkedListPrograms();
		
		Node p1= new Node(10);
		Node p2= new Node(20);
		Node p3=new Node(30);
		
		p1.next=p2;
		p2.next=p3;
		sll.head=p1;
		
		sll.display();
		
		sll.insertFirst(50);
		System.out.println();
		sll.display();
		
		sll.insertLast(40);
		System.out.println();
		sll.display();
		
		sll.removeFirst();
		System.out.println();
		sll.display();
		
		sll.removeLast();
		System.out.println();
		sll.display();
		
		System.out.println();
		if(sll.search(10)) {
			System.out.println("Key found");
		}
		else {
			System.out.println("Key not found");
		}
		
		
		System.out.print(sll.size());
		System.out.println();
		
		
	}
	
	

}

