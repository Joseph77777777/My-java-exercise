/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/15/23 
*/


package gitpack;
import java.util.*;

class Interval {
	int start,end;
	Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
}
public class OverlappingIntervals {

	public static void mergeOverLapping(Interval[]arr) {
		if(arr.length<=0) {
			System.out.println("Invalid");
		}
		Stack<Interval>S=new Stack<>();
		Arrays.sort(arr,new Comparator<Interval>(){
			
			public int compare(Interval i1,Interval i2) {
				return i1.start-i2.start;
			}
		});
		
		S.push(arr[0]);
		for (int i=1;i<arr.length;i++) {
			Interval Top=S.peek();
			if(Top.end<arr[i].start) {
				S.push(arr[i]);
			}
			else if(Top.end<arr[i].end) {
				Top.end=arr[i].end;
				S.pop();
				S.push(Top);
			}
		}
		System.out.print("The intervals are: ");
		while(!S.isEmpty()) {
		Interval T=S.pop();
		System.out.print("[" +T.start +","+ T.end + "]");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        mergeOverLapping(arr);

	}

}
