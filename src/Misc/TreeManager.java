package Misc;
import java.util.ArrayList;


public class TreeManager {
	
	public Node findMaxAverage(Node root){                                //recursive function which finds max average of the tree 
		MaxNode max= new MaxNode();
		max.maxAvg=Integer.MIN_VALUE;
		max.maxAvgNode=root;
		if(root==null)                                           
			return root;
		findMaxAverageUtil(root,max);
		return max.maxAvgNode;
	}
	private Data findMaxAverageUtil(Node root, MaxNode max) {               //utility function to find the maximum average
		if(root==null)
			return new Data();
		int sum=0;
		int elements=0;
		if(root.subNode.size()!=0)                                        //if the root has more subnodes, traverse them and find the average
		for(Node child: root.subNode){
			Data data=findMaxAverageUtil(child,max);
			sum+=data.sum;
			elements+=data.elements;
		}
		sum+=root.value;                                                  // calculate the average by adding the value of root also
		elements+=1;                                                 //increase the number of elements by 1 because even root is taken into consideration
		float avg= sum/elements;
		if(avg>max.maxAvg&&root.subNode.size()!=0){
			max.maxAvg=avg;                                          //check if average is greater than max average, if yes return that node 
			max.maxAvgNode=root;
		}
		Data dataUp= new Data();
		dataUp.sum=sum;
		dataUp.elements=elements;
		return dataUp;
	}
	class Data{
		int sum;
		int elements;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1= new Node();
		Node root2= new Node();
		Node root3= new Node();
		Node root4= new Node();
		Node root5= new Node();
		Node root6= new Node();
		Node root7= new Node();
		Node root8= new Node();
		root1.value=20;
		root2.value=12;
		root3.value=7;
		root4.value=11;
		root5.value=2;
		root6.value=3;
		root7.value=15;
		root8.value=8;
		
		root1.add(root2);
		root1.add(root3);
		root2.add(root4);
		root2.add(root5);
		root2.add(root6);
		root3.add(root7);
		root3.add(root8);
		
		System.out.println(new TreeManager().findMaxAverage(root1).value);
		
	}

}
class Node{                                                                      //node class
	public int value;
	public ArrayList<Node> subNode;
	/**
	 * 
	 */
	public Node() {
		subNode= new ArrayList<Node>();
	}
	public void add(Node node){
		subNode.add(node);
	}
}
class MaxNode{                                                                 //maxNode class
	float maxAvg;
	Node maxAvgNode;
}