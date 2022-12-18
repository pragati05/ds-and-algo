package ds.graphs;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class IsConnectedGraph {

//	static boolean isConnected(Graph g) {
//		ConcurrentMap<Integer, LinkedList<Integer>> concurrentMap = new ConcurrentHashMap<> (g.graphAL);
//		Set<Integer> vertexes = concurrentMap.keySet();
//		
//		for(Integer v: vertexes) {
//			vertexes.remove((Integer) v);
//			for(Integer i: g.graphAL.get(v)) {
//				if(!vertexes.contains(i)) {
//					break;
//				}
//				vertexes.remove((Integer) i);
//			}
//		}
//		
//		if(vertexes.isEmpty())
//			return true;
//		
//		return false;
//	}
	static ArrayDeque<Integer> entry = new ArrayDeque<>();
	
	static boolean isConnectedBFS(int vertex, Graph g, boolean[] isVisited) {
		
		entry.addLast(vertex);
		
		while(!entry.isEmpty()) {
			Integer i = entry.removeFirst();
			isVisited[i] = true;
			LinkedList<Integer> edges = g.graphAL.get(i);
			for(Integer t: edges) {
				if(!isVisited[t])
					entry.addLast(t);
			}
		}
		
		for(int i = 0; i < isVisited.length; i++) {
			if(!isVisited[i]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int vertex = 7;
		int[] s = new int[]{0,1,1,2,3,5};
		int[] d = new int[]{1,2,3,3,4,6};
		Graph g = Graph.createGraph(vertex, s, d);
		boolean[] isVisited = new boolean[g.vertex];
		System.out.println(isConnectedBFS(0, g, isVisited));

	}

}
