package ds.tree.binary;

import ds.models.tree.binary.Node;

/**
 * Created by Vivek on 22-01-2018.
 * To check if a binary tree is balanced or not
 *          1
 *        2    3
 *      4  5     8
 */
public class BalanceTree {


    public boolean isBalancedTree(Node node){
        if(node==null){
            return true;
        }
        int leftHeight =  getLeftHeight(node);
        int rightHeight = getRightHeight(node);

        if(Math.abs(leftHeight - rightHeight ) > 1 ){
            return  false;
        }
        transverse(node.left);
        transverse(node.right);
        return true;
    }

    public boolean transverse(Node node){
        if(node==null){
            return true ;
        }
        int leftHeight =  getLeftHeight(node);
        int rightHeight = getRightHeight(node);

        if(Math.abs(leftHeight - rightHeight ) > 1 ){
            return  false;
        }

        System.out.println("Left Height of node "+ node.data +" is "+leftHeight);
        System.out.println("Right Height of node "+ node.data +" is "+rightHeight);

        transverse(node.left);
        transverse(node.right);
        return true;
    }

    private int getRightHeight(Node node) {
        if(node==null){
            return -1;
        }

        int right = getRightHeight(node.right)+1;

        return right;
    }

    private int getLeftHeight(Node node) {
        if(node==null){
            return -1;
        }

        int left = getLeftHeight(node.left)+1;

        return left;
    }
}
