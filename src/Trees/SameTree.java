package Trees;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 13, 2017
 */
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p != null && q == null) return false;
        else if(p == null && q != null) return false;
        
        if(p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        
            
        
        return false;
    }
}

