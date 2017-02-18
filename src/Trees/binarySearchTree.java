package Trees;


public class binarySearchTree{
	class Node{
	
	Node left, right;
	int data;
	Node(int d)
	{
		data= d;
		left = right = null;
	}
	}
	
	Node root;
	binarySearchTree(){
		root = null;
	}
	
	void search(int item){
		
		System.out.println("search started");

		if(root == null){
			return;
		}
		else{
			
			searchNew(root,item);
		}
		
	}
	
	void searchNew(Node root, int item){
		System.out.println("search 2 started");

			
			if(item == root.data){
				System.out.println("item found");
			
			    }
			else if(item<root.data){
				searchNew(root.left,item);
				
			    }
			else if(item>root.data){
				searchNew(root.right, item);
	
			    }
			else{
				System.out.println("item doesn't exist");
				}
			
			
			
			}
		    
			
         
		
	
	
	void insert(int key) {
	       root = insertRec(root, key);
	    }
	     
	    /* A recursive function to insert a new key in BST */
	    Node insertRec(Node root, int key) {
	 
	        /* If the tree is empty, return a new node */
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }
	 
	        /* Otherwise, recur down the tree */
	        if (key < root.data)
	            root.left = insertRec(root.left, key);
	        else if (key > root.data)
	            root.right = insertRec(root.right, key);
	 
	        /* return the (unchanged) node pointer */
	        return root;
	    }
	
	public static void main(String[] args){
		binarySearchTree bt = new binarySearchTree();
		System.out.println("started");
		bt.insert(50);
		bt.insert(20);
		bt.insert(70);
		System.out.println("values inserted");

		bt.search(10);
	}
}

