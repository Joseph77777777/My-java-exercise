/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/28/23 
*/
package gitpack;

import java.util.Stack;

public class MinStack {
public static Stack <Integer> S=new Stack<Integer>();
public static Stack<Integer> minStack=new Stack<Integer>();
public static void push(int value) {
	S.push(value);
	if(minStack.isEmpty() || value<=minStack.peek()) {
		minStack.push(value);
	}
}

public static void pop() {
	if(!S.isEmpty()) {
		int remove=S.pop();
	if(remove==minStack.peek()) {
		minStack.pop();
	}
	}
}
public static int getMin() {
	return minStack.isEmpty() ? -1 : minStack.peek();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinStack solution=new MinStack();
solution.push(3);
solution.push(5);
solution.push(2);
solution.push(1);

System.out.println("Minimum element: " + solution.getMin());

solution.pop();

System.out.println("Minimum element: " + solution.getMin());
	}

}
