package Trees;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 13, 2017
 */
import java.util.*;
public class BinaryTreePath {
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root != null) search(root, "", res);
        return res;
    }
    
    public void search(TreeNode root, String path, List<String> res){
        if(root.left == null && root.right == null) res.add(path+ root.val);
        if(root.left != null) search(root.left, path + root.val + "->", res);
        if(root.right != null) search(root.right, path + root.val + "->", res);
    }

}


