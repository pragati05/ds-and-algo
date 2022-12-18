package ds.graphs;

import java.util.HashSet;
import java.util.Set;

public class FindMSTUsingPrims {

	void mst(GraphWeightAM g) {
		int V = g.mat.length;
		
		System.out.println("All Vertex: " + V);
		
		int no_edges = 0;
		int INF = Integer.MAX_VALUE;
		
		
		Set<Integer> U = new HashSet<>();
		U.add(0);
		while(no_edges < V-1) {
			int min=INF;
			int x = -1;
			int y = -1;
			
			for(Integer i: U) {
				for(int j = 0 ; j<V;j++) {
					if(!U.contains(j) && g.mat[i][j]!=0 ) {
						if(g.mat[i][j] < min) {
							min = g.mat[i][j];
							x = i;
							y = j;
						}
					}
				}
			}
			
			System.out.println("Edge : " + x + "-"+y + "\t weight : " + min);
			U.add(y);
			no_edges++;
		}
		
	}
	public static void main(String[] args) {
		int vertex = 6;
		int[] s = new int[]{0,0,1,2,2,2,3,4};
		int[] d = new int[]{1,2,2,3,4,5,5,4};
		int[] w = new int[]{4,4,2,3,2,4,3,3};

		GraphWeightAM gw = new GraphWeightAM(vertex);
		GraphWeightAM g = gw.createGraph(vertex, s, d, w);
		gw.print(g);
		
		
		 new FindMSTUsingPrims().mst(g);
		

	}

}
