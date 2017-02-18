package Trees;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 13, 2017
 */
public class MinimumDepth {
	public int minDepth(TreeNode root) {
        
	       
        if(root == null) return 0;
        int leftmin = minDepth(root.left);
        int rightmin = minDepth(root.right);
        return (leftmin == 0 || rightmin == 0) ? leftmin + rightmin + 1: Math.min(leftmin,rightmin) + 1;
      
        
    }

}


