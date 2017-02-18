package Trees;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 13, 2017
 */
public class invertTree {
	public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        else{
            TreeNode temp = root. left;
            root.left = root.right;
            root.right = temp;
        }
        invertTree(root.left);
        invertTree(root.right);
       
           
        return root;
    }
}
class TreeNode{
	TreeNode left, right;
	int val;
	TreeNode(int d){
		val = d;
	}
}
