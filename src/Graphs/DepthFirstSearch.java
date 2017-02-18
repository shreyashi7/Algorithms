package Graphs;
import java.util.LinkedList;
import java.util.Iterator;

public class DepthFirstSearch {
	int V;
	LinkedList<Integer> adj[];
    
	DepthFirstSearch(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++){
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void DFSUtil(int s, boolean visited[]){
		visited[s] = true;
		
		System.out.println(s+" ");
		
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
            DFSUtil(n,visited);			
            }
		}
	}
	
	void DFS(int s){
		boolean visited[] = new boolean[V];
		
		DFSUtil(s, visited);
	}
	
	
	public static void main(String[] args){
		DepthFirstSearch dfs = new DepthFirstSearch(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		
		System.out.println("DFS");
		
		dfs.DFS(2);
	}
}
