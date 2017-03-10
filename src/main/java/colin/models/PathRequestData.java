package colin.models;

public class PathRequestData {
	private String source;
	private String destination;
	private WeightedEdge[] edges;
	private String box;
	
	public PathRequestData(){
		
	}
	
	public PathRequestData(String source,String destination,String box,WeightedEdge[] edges){
		this.source = source;
		this.destination = destination;
		this.edges = edges;
		this.box = box;
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

	public WeightedEdge[] getEdges() {
		return edges;
	}

	public void setEdges(WeightedEdge[] edges) {
		this.edges = edges;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}
	
}
