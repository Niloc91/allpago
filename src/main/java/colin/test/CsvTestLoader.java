package colin.test;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import com.opencsv.CSVReader;

import colin.models.test.CompleteTestCase;
import colin.models.*;
import colin.models.test.TestCase;

/**
 * Class to read csv files in /tmp/allpago directory
 * and to put into testcase data structures
 * 
 * 
 * @author colin
 *
 */
public class CsvTestLoader {
	Stack <CompleteTestCase> testCases;
	Stack<WeightedEdge> data = new Stack<WeightedEdge>();
	Stack<TestCase> test = new Stack<TestCase>();
	CSVReader reader;
	
	public CsvTestLoader() throws IOException{
		ScanDirectory();
		reader.close();
	     
	}
	
	//Scan test directory
	public void ScanDirectory() throws IOException{
		File folder = new File("/tmp/allpago");
		
	    for (File fileEntry : folder.listFiles()) {
	            if(fileEntry.getName().contains(".csv")){
	                try{
	                	testCases.push(parseCSV(fileEntry.getAbsolutePath()));
	                }catch(Exception e){
	                	
	                }
	            }
	    }
	}
	
	/**
	*Method to parse csv files and
	*populate vertexes and populate data
	*for test cases
	*
	*/
	public CompleteTestCase parseCSV(String fileName) throws IOException{

 		String name;
 		int HARD;
 		double cost;
 		
	    
	    reader = new CSVReader(new FileReader(fileName));

	    String [] nextLine;
	    while ((nextLine = reader.readNext()) != null) {
	        for(int i =0;i<nextLine.length;i++){
	        	
	        	//Populate Tests
	        	if(nextLine[0].contains("@")){
	        		if(nextLine[3].contains("~")){
	        			cost = -1;
	        		}else{
	        			cost = Double.parseDouble(nextLine[3]);
	        		}
	        		test.push(new TestCase(nextLine[1], nextLine[2],cost ));
	        		
	        	//Populate vertexes 	
	        	}else{
	        		
	        		if(i<nextLine.length-1){
		        		String[] temp = nextLine[i+1].split(":");
		        		name = temp[0];HARD = Integer.parseInt(temp[1]);
		        		data.push(new WeightedEdge(nextLine[0],name ,HARD));
	        		}

	        	}
	        	
	        }
	     }
	     
	     return new CompleteTestCase(data,test);
	}
	
	
	
	public Stack<CompleteTestCase> getTestCases(){
		return testCases;
	}
	
	
	
	
	
}
