package colin.calculation;

import java.util.LinkedHashSet;
import java.util.Set;

import org.psjava.algo.graph.shortestpath.DijkstraAlgorithm;
import org.psjava.algo.graph.shortestpath.SingleSourceShortestPathResult;
import org.psjava.ds.graph.DirectedWeightedEdge;
import org.psjava.ds.graph.MutableDirectedWeightedGraph;
import org.psjava.ds.numbersystrem.IntegerNumberSystem;
import org.psjava.goods.GoodDijkstraAlgorithm;

import colin.models.WeightedEdge;

public class ShortestPath {
	private MutableDirectedWeightedGraph<String, Integer> graph;
	private WeightedEdge[] weightedEdges;
	
	public ShortestPath(){
		
	}
	
	public ShortestPath(WeightedEdge[] weightedEdges){
		this.weightedEdges = weightedEdges;
		this.graph = MutableDirectedWeightedGraph.create();
		setupVertexes(weightedEdges);
		setupEdges(weightedEdges);
	}
	
	
	public void setupVertexes(WeightedEdge[] w){
		Set<String> uniqueSet = new LinkedHashSet<>();
		
		//Populate with unique Vertexes
		for(WeightedEdge edge: w){
			uniqueSet.add(edge.getDestination());
			uniqueSet.add(edge.getSource());
		}
		
		//populate graph with unique Vextexes
		for (String unique : uniqueSet) {
			graph.insertVertex(unique);
			System.out.println(unique);
		}
	}
	
	private void setupEdges(WeightedEdge[] w){
		for(int i=0;i<w.length;i++){
				graph.addEdge(
					w[i].getSource(), 
					w[i].getDestination(), 
					w[i].getWeight());
			}
	}
	
	
	/***************************************************************************************
	*    Title: Dijkstra Algorithm
	*    Author: Unknown
	*    Date: 8th March 2017 - Retrieved
	*    Code version: 0.1.19
	*    Availability: http://psjava.org/algo/Dijkstra_Algorithm
	*
	***************************************************************************************/
	public int getShortestPath(String source, String destination){
    	IntegerNumberSystem NS = IntegerNumberSystem.getInstance();
    	DijkstraAlgorithm dijkstra = GoodDijkstraAlgorithm.getInstance();
    	
    	
    	SingleSourceShortestPathResult<String, Integer, DirectedWeightedEdge<String, Integer>> result = dijkstra.calc(graph, source, NS);
    	int HARD = result.getDistance(destination);
    	return HARD;
	}
	
}
