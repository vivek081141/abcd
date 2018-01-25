package ds.tree.binary;

import ds.models.tree.binary.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vivek on 21-01-2018.
 *           1
 *        2    3
 *      4  5     8
 *
 */
public class BalanceTreeTest {
    private BalanceTree balanceTree= new BalanceTree();

    @Test
    public void IsBalancedTree() {
        Node node = createBalancedBinaryTree();
        List<String> array = new ArrayList<String>();
        Assert.assertTrue(balanceTree.transverse(node));
    }

    @Test
    public void unBalancedTree(){
        Node node = createUnBalancedBinaryTree();
        List<String> array = new ArrayList<String>();
        Assert.assertTrue(balanceTree.transverse(node));
    }

    private Node createBalancedBinaryTree() {
        Node node = new Node("1");
        node.left = new Node("2");
        node.right = new Node("3");
        node.left.left = new Node("4");
        node.left.right = new Node("5");
        node.right.right = new Node("8");
        return node;
    }

    private Node createUnBalancedBinaryTree() {
        Node node = new Node("1");
        node.left = new Node("2");
        node.right = new Node("3");
        node.left.left = new Node("4");
        node.left.right = new Node("5");
        node.right.right = new Node("8");
        node.right.right.right = new Node("8");
        return node;
    }
}
