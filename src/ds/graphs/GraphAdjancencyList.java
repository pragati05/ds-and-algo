package ds.graphs;

import java.util.HashMap;
import java.util.LinkedList;


/**
 * Create a graph , using Adjacency list 
 * 1. Add element to the graph (Vertex or Edge) 
 * 2. Remove element from the graph. (Vertex or Edge) 
 * 3. Search edge in the graph
 * 
 * @author pragati
 *
 */

class Graph {
	int vertex;
	HashMap<Integer, LinkedList<Integer>> graphAL = null;

	Graph(int vertex) {
		this.vertex = vertex;
		graphAL = new HashMap<>();
	}

	static Graph createGraph(int vetex, int[] s, int[] d) {
		Graph g = new Graph(vetex);

		for (int i = 0; i < vetex; i++) {
			g.graphAL.put(i, new LinkedList<>());
		}

		for (int i = 0; i < s.length; i++) {

			g.graphAL.get(s[i]).add(d[i]);
			g.graphAL.get(d[i]).add(s[i]);

		}
		return g;
	}

	void print() {
		System.out.println(graphAL + "\n");
	}

	void addVertex(int vertex) {
		if (graphAL.containsKey(vertex)) {
			System.out.println("Vertex already present");
		} else {
			graphAL.put(vertex, new LinkedList<>());
			System.out.println("Added Vertex : " + vertex);
		}
	}

	
	void removeVertex(int v) {
		LinkedList<Integer> inEdges = graphAL.get(v);
		//System.out.println("Incoming/Outgoing edges for vertex: "+ v + " is: " + inEdges);
		for(Integer e: inEdges ) {
			graphAL.get(e).remove((Integer)v);
		}
		
		graphAL.remove(v);
		
		System.out.println(v + " vertex removed");
	}
	
	void addEdge(int s, int d) {

		graphAL.get(s).add(d);
		graphAL.get(d).add(s);
		System.out.println("Added Edge: " + s + " -> " + d);

	}
	
	void removeEdge(int s, int d) {
		graphAL.get(s).remove((Integer)d);
		graphAL.get(d).remove((Integer)s);
		System.out.println("Removed Edge: " + s + " -> " + d);
	}
	
	void inEdges() {
		print();
	}
	
	void outEdges() {
		print();
	}

	
	boolean isValidEdge(int s, int d) {
		if(graphAL.get(s).contains(d))
				return true;
		
		return false;
		
	}
}

public class GraphAdjancencyList {

	public static void main(String[] args) {
//		int vertex = 4;
//		int[] s = new int[] { 0, 1, 3 };
//		int[] d = new int[] { 3, 2, 2 };
		
		int vertex = 6;
		int[] s = new int[]{0,0,0,1,3};
		int[] d = new int[]{1,2,3,2,4};

		Graph g = Graph.createGraph(vertex, s, d);
		g.print();

		g.addVertex(5);
		g.print();
		
		g.addEdge(0, 5);
		g.print();
		
		System.out.println(g.isValidEdge(0,5));
		
		g.removeEdge(0, 5);
		g.print();

		g.removeVertex(0);
		g.removeVertex(1);
		g.removeVertex(3);
		g.print();
		
		
		System.out.println(g.isValidEdge(2,5));
		/**
		 * 0 ->(1,2,3) 1 ->(0,2) 2 ->(0,1) 3 ->(0,4) 4 ->(3) 5 ->()
		 */

	}

}
