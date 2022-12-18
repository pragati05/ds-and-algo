package ds.graphs;

import java.util.LinkedList;

public class CheckPathExists {

	static boolean isPathExists(Graph g ,int s, int d, boolean[] isVisited) {
		LinkedList<Integer> edges = g.graphAL.get(s);
		
		if(edges.contains(d))
			return true;
		else {
			isVisited[s] = true;
			for(Integer e : edges ) {
				if(!isVisited[e])
					if(isPathExists(g, e, d, isVisited))
						return true;
			}
			
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int vertex = 6;
		int[] s = new int[]{0,0,0,1,3};
		int[] d = new int[]{1,2,3,2,4};
		Graph g = Graph.createGraph(vertex, s, d);
		boolean[] isVisited = new boolean[g.vertex];
//		System.out.println(isPathExists(g, 1, 3,isVisited));
//		System.out.println(isPathExists(g, 1, 2,isVisited));
		
		
//		vertex = 3;
//		s = new int[]{0,0,1};
//		d = new int[]{1,2,2};
//		g = Graph.createGraph(vertex, s, d);
//		isVisited = new boolean[g.vertex];
//		System.out.println(isPathExists(g, 0, 2,isVisited));
//		System.out.println(isPathExists(g, 0, 1,isVisited));
		
		
		
		vertex = 8;
		s = new int[]{0,1,1,2,3,5,6};
		d = new int[]{1,2,3,3,4,6,7};
		g = Graph.createGraph(vertex, s, d);
		isVisited = new boolean[g.vertex];
		System.out.println(isPathExists(g, 1, 5,isVisited));
		System.out.println(isPathExists(g, 5, 7,isVisited));
		System.out.println(isPathExists(g, 4, 1,isVisited));//
		System.out.println(isPathExists(g, 1, 4,isVisited));//
//		System.out.println(isPathExists(g, 6, 2,isVisited));
//		System.out.println(isPathExists(g, 0, 4,isVisited));
		
		
	
		
		

	}

}
