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

class GraphAM {
	int vertex;
	boolean[][] mat = null;

	GraphAM(int vertex) {
		this.vertex = vertex;
		mat = new boolean[vertex][vertex];
		
		
	}

	static GraphAM createGraph(int vetex, int[] s, int[] d) {

		GraphAM g = new GraphAM(vetex);

		for (int i = 0; i < s.length; i++) {

			g.mat[s[i]][d[i]] = true;
			g.mat[d[i]][s[i]] = true;
			

		}
		return g;
	
		
	}

	void print() {
		for(int i = 0 ; i < mat.length;i++) {
			for(int j = 0; j<mat.length; j++) {
				if(mat[i][j])
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}

	}


	void addEdge(int s, int d) {

		mat[s][d] = true;
		mat[d][s] = true;
		System.out.println("Added Edge: " + s + " -> " + d);

	}
	
	void removeEdge(int s, int d) {
		mat[s][d] = false;
		mat[d][s] = false;
		System.out.println("Removed Edge: " + s + " -> " + d);
	}
	
	void inEdges() {
		System.out.println("\n In Edges:");
		for(int i = 0;i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					System.out.println(i + " -> " + j);
				}
			}
			System.out.println();
		}
	}
	
	void outEdges() {
		inEdges();
	}

	
	boolean isValidEdge(int s, int d) {
		if(mat[s][d])
			return true;
		
		return false;
		
	}
}

public class GraphAdjancencyMatrix {

	public static void main(String[] args) {
		int vertex = 6;
		int[] s = new int[]{0,0,0,1,3};
		int[] d = new int[]{1,2,3,2,4};
		
		GraphAM g = GraphAM.createGraph(vertex, s, d);
		g.print();
		
		
//		System.out.println();
//		
//		vertex = 4;
//		s = new int[]{0,1};
//		d = new int[]{2,3};
//		
//		g = GraphAM.createGraph(vertex, s, d);
//		g.print();


		System.out.println();
		g.addEdge(0, 5);
		g.print();
		
		g.inEdges();
		
		System.out.println(g.isValidEdge(0,5));
	
		System.out.println();
		g.removeEdge(0, 5);
		g.print();


		
		
		System.out.println(g.isValidEdge(2,5));

	}

}
