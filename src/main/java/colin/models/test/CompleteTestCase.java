package colin.models.test;

import java.util.Stack;

import colin.models.WeightedEdge;

public class CompleteTestCase {
	private Stack<WeightedEdge> data;
	private Stack<TestCase> test;
	
	public CompleteTestCase(Stack<WeightedEdge> data,Stack<TestCase> test){
		this.data = data;
		this.test = test;
	}

	public Stack<WeightedEdge> getData() {
		return data;
	}

	public void setData(Stack<WeightedEdge> data) {
		this.data = data;
	}

	public Stack<TestCase> getTest() {
		return test;
	}

	public void setTest(Stack<TestCase> test) {
		this.test = test;
	}
	
	
	
	
}
