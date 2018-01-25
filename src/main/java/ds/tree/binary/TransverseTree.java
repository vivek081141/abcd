package ds.tree.binary;

import ds.models.tree.binary.Node;

import java.util.List;

/**
 * Created by Vivek on 21-01-2018.
 * Write a program to transverse through a binary tree
 *  (a) Inorder (Left, Root, Right) :
    (b) Preorder (Root, Left, Right) :
    (c) Postorder (Left, Right, Root) :
 *
 *
 */
public class TransverseTree {

    public static void main(String args[]){

    }

    /**
     * Inorder transverse
     * @param node
     */
    public List<String> transverse(Node node, List<String> arrays){
        if(node == null){
            return arrays;
        }

        transverse(node.left,arrays);
        arrays.add(node.data);
        System.out.print(node.data);
        transverse(node.right,arrays);
        return arrays;

    }
}
