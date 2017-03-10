package colin.models;

public class WeightedEdge {
	private String source;
	private String destination;
	private int weight;
	
	public WeightedEdge(){
		
	}
	
	public WeightedEdge(String source,String destination,int weight){
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
