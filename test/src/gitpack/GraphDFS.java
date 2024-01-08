/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/28/23 
*/

package gitpack;

import java.util.LinkedList;
import java.util.ListIterator;

public class GraphDFS {
private static int V;
private static LinkedList<Integer>adj[];

GraphDFS(int v){
	V=v;
	adj=new LinkedList[v];
	for(int i=0;i<v;i++) {
		adj[i]=new LinkedList();
	}
}

public static void addEdge(int v,int w) {
	adj[v].add(w);
}

	public static void DFSutil(int v,boolean visited[]) {
		visited[v]=true;
		System.out.println(v + " ");	
}
	ListIterator<Integer>i=adj[V].listIterator();{
while(i.hasNext()) {
	int n=i.next();
	boolean[] visited = null;
	if(!visited[n]) {
	DFSutil(V,visited);
	}
}
	}
	void DFS(int v){
		boolean visted[]=new boolean[V];
		DFSutil(v,visted);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GraphDFS G=new GraphDFS(4);
G.addEdge(0, 1);
G.addEdge(0, 2);
G.addEdge(1, 2);
G.addEdge(2, 0);
G.addEdge(2, 3);
G.addEdge(3, 3);

System.out.print("Following is Breadth First Traversal starting from vertex 2 : ");
G.DFS(2);
	}

}
