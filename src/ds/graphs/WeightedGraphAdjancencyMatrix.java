package ds.graphs;

/**
 * Create a graph , using Adjacency list
	 * 1. Add element to the graph (Vertex or Edge)
	 * 2. Remove element from the graph. (Vertex or Edge)
	 * 3. Search element in the graph
	 * 
 * @author pragati
 *
 */


class GraphWeightAM{

	int vertex;
	int[][] mat = null;

	GraphWeightAM(int vertex) {
		this.vertex = vertex;
		mat = new int[vertex][vertex];
		
		
	}

	static GraphWeightAM createGraph(int vetex, int[] s, int[] d, int[] w) {

		GraphWeightAM g = new GraphWeightAM(vetex);

		for (int i = 0; i < s.length; i++) {

			g.mat[s[i]][d[i]] = w[i];
			g.mat[d[i]][s[i]] = w[i];
			

		}
		return g;
	
		
	}

	static void print(GraphWeightAM g) {
		for(int i = 0 ; i < g.mat.length;i++) {
			for(int j = 0; j<g.mat.length; j++) {
					System.out.print(g.mat[i][j]+ " ");
				
			}
			System.out.println();
		}

	}


}
public class WeightedGraphAdjancencyMatrix {

	
	public static void main(String[] args) {
		int vertex = 6;
		int[] s = new int[]{0,0,0,1,3};
		int[] d = new int[]{1,2,3,2,4};
		int[] w = new int[]{1,2,1,5,6};

		GraphWeightAM gw = new GraphWeightAM(vertex);
		GraphWeightAM g = gw.createGraph(vertex, s, d, w);
		gw.print(g);
	}

}
