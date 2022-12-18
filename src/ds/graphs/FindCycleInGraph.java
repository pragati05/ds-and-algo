package ds.graphs;

public class FindCycleInGraph {
	// 0 -> F , Parent
	
	static boolean isCycle(Graph g, int vertex, boolean[] isVisited , int parent){
		
		if(!isVisited[vertex]) {
			isVisited[vertex] = true;
			for(Integer e : g.graphAL.get(vertex)) {
				if(e != parent) {
					if(isCycle(g, e, isVisited, vertex))
						return true;
				}
			}
		}else {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {

		int vertex = 4;
		int[] s = new int[]{2,1,3,3,1};
		int[] d = new int[]{0,0,1,2,3};

		Graph g = Graph.createGraph(vertex, s, d);
		boolean[] isVisited = new boolean[g.vertex + 1];

		System.out.println("Is Cycle Present: " +  isCycle(g, 0, isVisited, -1));
		

	}

}
