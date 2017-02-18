package Graphs;
import java.util.LinkedList;
import java.util.Iterator;



public class breadthFirstSearch {
	 int V;
	 LinkedList<Integer> adj[];
	
	breadthFirstSearch(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; ++i){
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void BFS(int s){
		boolean visited [] = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size()!=0){
			s = queue.poll();
			System.out.println(s+" ");
		}
		
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				visited[n] = true;
				queue.add(n);
			}
		}
		
	}
	
	public static void main(String[] args){
		
		breadthFirstSearch graph = new breadthFirstSearch(4);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		graph.addEdge(3, 4);
		System.out.println("BFS");
		graph.BFS(2);
	}

}
