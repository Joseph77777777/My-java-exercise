/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/20/23 
*/

package gitpack;

import java.util.*;

public class Graph {
private int V;

private LinkedList<Integer> adj[];
//constructor
Graph(int v){
	V=v;
	adj=new LinkedList[v];
	for(int i=0;i<v;i++) {
		adj[i]=new LinkedList();
	}
}
//Function to add an edge into the graph
void addEdge(int v,int w) {
	adj[v].add(w);
} 
//prints Breadth first search traversal from a given source.
void BFS(int s) {
	//Mark all the vertices as not visited
	boolean visited[]=new boolean[V];
	//Create a queue.
	LinkedList<Integer> queue=new LinkedList<Integer>();
	//Mark the current node a visited and print it.
	visited[s]=true;
	queue.add(s);
	
	while(queue.size()!=0) {
		s=queue.poll();
		System.out.print(s + " ");
	}
	//Get all adjacent vertices of the dequeued vertex s
    Iterator<Integer> i=adj[s].listIterator();
    while(i.hasNext()) {
    	int n=i.next();
    	if(!visited[n]) {
    		visited[n]=true;
    		queue.add(n);
    	}
    }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Graph g=new Graph(4);
g.addEdge(0, 1);
g.addEdge(0, 2);
g.addEdge(1, 2);
g.addEdge(2, 0);
g.addEdge(2, 3);
g.addEdge(3, 3);

System.out.print("Following is Breadth First Traversal starting from vertex 2 : ");
g.BFS(0);
	}

}
