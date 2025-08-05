package test;

import java.util.Stack;

class TreeNode{
     int val;
     TreeNode left, right;

    public TreeNode( int val ){
        this.val = val;
    }
}
public class InorderTraversalIterative {

    public void inorder( TreeNode root ){

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while( !stack.isEmpty() || temp != null ){
            if( temp != null ){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.printf(temp.val+" ");
                temp = temp.right;
            }
        }
    }


    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \
          4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InorderTraversalIterative traversal = new InorderTraversalIterative();
        System.out.print("Inorder Traversal: ");
        traversal.inorder(root); // Output: 4 2 5 1 3
    }


}
