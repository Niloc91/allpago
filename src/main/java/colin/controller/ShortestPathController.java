package colin.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import colin.models.PathRequestData;
import colin.models.ShortestPathResult;
import colin.models.WeightedEdge;
import colin.calculation.*;

@RestController
public class ShortestPathController {

    @RequestMapping( method = RequestMethod.GET, value = "/test")
    public ShortestPathResult testRoute() {

        return new ShortestPathResult(5,2,"me","someoneelse");
    }
    
    
    @RequestMapping(method = RequestMethod.POST,value = "/post/pathdata")
    public ShortestPathResult pathRequest(@RequestBody PathRequestData data){
    	int HARD;
    	double cost;
    	String source = data.getSource();
    	String destination = data.getDestination();
    	String boxDimensions = data.getBox();
    	WeightedEdge[] w = data.getEdges();

   
    	BoxMaker b = new BoxMaker(boxDimensions);
    	PackageCalculator p = new PackageCalculator(b.getBox());
    	
    	ShortestPath path = new ShortestPath(w);
    	HARD = path.getShortestPath(source, destination);
    	cost = p.getShipCost(HARD);
    		
    	
    	return new ShortestPathResult(HARD,cost,source,destination);
    }
    
    
}
