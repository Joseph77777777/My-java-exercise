/*@author Joseph Nakhle 


@version: 2023-03 (4.27.0)
@since release 10/31/23 
*/


package gitpack;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add() method.
		//This method will add elements according to the same sorting order mentioned during
		//the creation of the TreeSet.
	
		//Creating an empty TreeSet
		TreeSet<String> tree =new TreeSet<String>();
		
        //Using add() method to add elements into the TreeSet   
		tree.add("welcome");
		tree.add("to");
		tree.add("the");
		tree.add("world");
		
		//printing the TreeSet
		System.out.println("TreeSet: " +tree);
		
		
		//addAll() method.
		//This method is used to append all of the elements from the mentioned collection to the existing set.
		
		//Creating an empty TreeSet.
		TreeSet<Integer> tree1= new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet  
		tree1.add(1);
		tree1.add(3);
		tree1.add(4);
		
		//Displaying Tree1.
		System.out.println("Tree1 : " +tree1);
		
		//Creating another Tree.
		TreeSet<Integer> tree2= new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet .
		tree2.add(1);
		tree2.add(5);
		tree2.add(2);
		
		//Displaying Tree2.
		System.out.println("Tree2 : " +tree2);
		
		System.out.println("After adding all : ");
		
		//Using addAll() to append.
		tree1.addAll(tree2);
		
		//Displaying the final tree.
		System.out.println(tree1);
		
		//ceiling() method.
		//This method returns the least element in the set greater than or equal to the given value.
		
		//Creating an empty TreeSet.
		TreeSet<Integer> tree3=new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet .
		tree3.add(10);
		tree3.add(20);
		tree3.add(30);
		tree3.add(40);
		
		//Displaying Tree3.
		System.out.println("Tree3 : "+tree3);
		
		//Getting ceiling value for 25 using ceiling() method
		int value=tree3.ceiling(15);
		
		//Displaying the ceiling value.
		System.out.println("The value is : " + value);
		
		
		//clear() method.
		//This method is used to remove all the elements.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree4=new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree4.add("how");
		tree4.add("are");
		tree4.add("you");
		
		//Displaying Tree4.
		System.out.println("Tree4: "+ tree4);
		
		
		System.out.println("After clearing:");
		
		//Using clear() method to remove all the elements.
		tree4.clear();
		
		//Displaying Tree4 after clearing.
		System.out.println(tree4);
		
		//clone() method.
		//This method returns a copy of the set, which is just a simple copied set
		
		//Creating an empty TreeSet.
		TreeSet<String>tree5=new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree5.add("hello");
		tree5.add("world");
		
		//Displaying Tree5.
		System.out.println("Tree5: "+ tree5);
		
		//Creating a new Cloned set.
		TreeSet cloned=new TreeSet();
		
		//Cloning the set using clone() method.
		cloned=(TreeSet)tree5.clone();
		
		//Displaying the cloned set.
		System.out.println("Clone: "+cloned);
		
		
		//contains() method.
		//This method will return True if a given element is present in the Set else it will return False.
		
		//Creating an empty TreeSet.
		TreeSet<Integer> tree6=new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet.
		tree6.add(10);
		tree6.add(20);
		tree6.add(30);
		
		//Displaying tree6.
		System.out.println("Tree6: "+ tree6);
		
		//Check for specific element in the above TreeSet using contains() method.
        // Printing a boolean value.
		System.out.println("Tree6 containd 10? "+tree6.contains(10));
		System.out.println("Tree6 containd 40? "+tree6.contains(40));
		
		//descendingIterator() method.
		//This method returns an iterator over the elements in this Set in descending order.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree7=new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree7.add("A");
		tree7.add("B");
		tree7.add("C");
		tree7.add("D");
		
		//printing Tree7.
		System.out.println("Tree7: "+tree7);
		
		//creating descending iterator.
		//Using descendingIterator() method.
		Iterator<String> it=tree7.descendingIterator();
		
		System.out.println("Values after descendingIterator :");
		
		//Displaying the values.
		while(it.hasNext()) {
			System.out.println("Values : "+it.next());
		}
		
		
		//descendingSet() method.
		//This method returns a reverse order view of the elements in the Set.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree8 =new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree8.add("E");
		tree8.add("F");
		tree8.add("G");
		
		//Printing Tree8.
		System.out.println("Tree8: "+ tree8);
		
		//reverse order view of element using descendingSet() method
		NavigableSet<String> Tree8Reverse =tree8.descendingSet();
		
		//Displaying Tree8 reversed.
		System.out.println("Tree8reverse: " +Tree8Reverse);
		
		// first() method.
		//This method will return the first element in the Set.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree9=new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree9.add("hello");
		tree9.add("how");
		tree9.add("are");
		tree9.add("you");
	    
		//Printing Tree9.
		System.out.println("Tree9 : " +tree9);
		
		//Displaying the first element in Tree9 using first() method.
		System.out.println("The first element is : " +tree9.first());
		
		//floor() method.
		//This method returns the greatest element in the set less than or equal to the given value.
		
		//Creating an empty  TreeSet.
		TreeSet<Integer> tree10=new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet.
		tree10.add(10);
		tree10.add(15);
		tree10.add(30);
		
		//Printing Tree10.
		System.out.println("Tree10 : "+ tree10);
		
		//getting the floor value for 25 using floor() method.
		int x=tree10.floor(25);
		
		//Printing the floor value.
		System.out.println("The value is : "+x);
		
		//HeadSet() method.
		//This method will return elements of TreeSet who are less than the specified value.
		
		//Creating an empty TreeSet.
		TreeSet<Integer> tree11=new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet.
		tree11.add(1);
		tree11.add(2);
		tree11.add(3);
		tree11.add(4);
		tree11.add(5);
		
		 //Creating the headSet tree 
		TreeSet<Integer> treehead= new TreeSet<Integer>();
		
		//Limiting the values till 4.
		treehead=(TreeSet<Integer>)tree11.headSet(4);
		
		//Create an Iterator.
		Iterator<Integer> IT=treehead.iterator();
		
		System.out.println("The values are :");
		//Printing the values.
		while(IT.hasNext()) {
			System.out.println(IT.next()+ " ");
		}
		
		//Higher() method.
		//This method returns the least element in this set strictly greater than the given element.
		
		//Creating an empty TreeSet.
		TreeSet <Integer> tree12 =new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet.
		tree12.add(10);
		tree12.add(20);
		tree12.add(30);
		tree12.add(40);
		
		//Displaying Tree12.
		System.out.println("Tree12 : " +tree12);
		
		//Getting the Highest value for 25 using Higher() method.
		int element=tree12.higher(25);
		
		//Printing the element.
		System.out.println("The element is : "+ element);
		
		//isEmpty() method. 
		//This method will return True if the set contains no elements ,else it will return False.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree13 =new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree13.add("welcome");
		tree13.add("to");
		tree13.add("the");
		tree13.add("world");
		
		//Displaying Tree13.
		System.out.println("Tree13 :" + tree13);
		
		//Check if the TreeSet is empty using isEmpty() method.
        // Printing a boolean value.
		System.out.println("Is the set empty ?" + tree13.isEmpty());
	    
		//Removing all the elements using clear() method.
		tree13.clear();
		
		//Check if the TreeSet is empty using isEmpty() method.
        // Printing a boolean value
		System.out.println("Is the set empty ?" + tree13.isEmpty());
		
		//Last() method.
		//This method returns the last element in the TreeSet.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree14=new TreeSet<String>();
		
		//Using add() method to add elements into the TreeSet.
		tree14.add("welcome");
		tree14.add("to");
		tree14.add("the");
		tree14.add("world");
		
		//Displaying tree14.
		System.out.println("Tree14 : "+ tree14);
		
		//Printing the last element
		//using last() method
		System.out.println("The last element is : " +tree14.last());
		
		//Lower(element) method
		//This method will return the greatest element in the set strictly less than the given element.
		
		//Creating an empty TreeSet.
		TreeSet<Integer> tree15=new TreeSet<Integer>();
		
		//Using add() method to add elements into the TreeSet
		tree15.add(10);
		tree15.add(20);
		tree15.add(30);
		tree15.add(40);
		
		//Displaying Tree15
		System.out.println("Tree15 : " + tree15);
		
		//Getting the lowest value for 25.
		//using lower() method.
		int Value=tree15.lower(25);
		
		//Printing the value.
		System.out.println("The value is " + Value);
		
		// pollfirst() method will retrieve  and remove the first element.
		// polllast() method  will retrieve and remove the last element.
		
		//Creating an empty TreeSet.
		TreeSet<String> tree16=new TreeSet<String>();
		
		////Using add() method to add elements into the TreeSet
		tree16.add("welcome");
		tree16.add("to");
		tree16.add("the");
		tree16.add("world");
		
		//Displaying tree16.
		System.out.println("tree 16 :"+ tree16);
		
		// removing first element using pollFirst() method.
		System.out.println("The first element removed is : " + tree16.pollFirst());
		
		//Displaying tree16 after removing the first element.
		System.out.println("tree 16 after poll first :"+ tree16);
		
		// removing last element using pollFirst() method.
		System.out.println("The first element removed is : " + tree16.pollLast());
		
		//Displaying tree16 after removing the last element.
		System.out.println("tree 16 after poll last :"+ tree16);
		
		
	
	}

}
