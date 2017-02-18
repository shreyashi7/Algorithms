package Graphs;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 12, 2017
 */
import java.util.*;
public class TopologicalSort{
	private int V;
	private LinkedList<Integer> adj[];
	TopologicalSort(int v){
		V = v;
		adj = new LinkedList[V];
		for(int i= 0; i<v; i++){
			adj[i] = new LinkedList();
		}
	}
	 void addEdge(int v, int w){
		 adj[v].add(w);
		}
	 void topologicalSortUtil(int v, boolean visited[], Stack st){
		 visited[v] = true;
		 Integer i;
		 Iterator<Integer> itr = adj[v].iterator();
		 while(itr.hasNext()){
			 i = itr.next();
			 if(!visited[i]){
				 topologicalSortUtil(i,visited,st);
			 }
				 }
		   st.push(new Integer(v));
		 }
	 
	 
	 void topologicalSort(){
		 Stack st = new Stack();
		 boolean visited[] = new boolean[V];
		 for(int i= 0; i< V; i++){
			 visited[i] = false;
		 }
		 for(int i  = 0; i< V; i++){
			 if(visited[i] == false) topologicalSortUtil(i, visited, st);
		 }
		 while(st.empty() == false){
			 System.out.println(st.pop()+ " ");
		 }
	 }
		 
	public static void main(String[] args){
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        
        System.out.println("The topological order is: ");
        g.topologicalSort();
	}

   
}
