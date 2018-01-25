package ds.tree.binary;

import ds.models.tree.binary.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vivek on 21-01-2018.
 */
public class TransverseTreeTest {
    private TransverseTree transverseTree = new TransverseTree();

    @Test
    public void InOrderTransverse() {
        List<String> list1 = Arrays.asList("4", "2", "5", "1", "3");
        Node node = createBinaryTree();
        List<String> array = new ArrayList<String>();
        array = transverseTree.transverse(node, array);
        System.out.println(array);
        Assert.assertEquals(list1, array);

    }

    private Node createBinaryTree() {
        Node node = new Node("1");
        node.left = new Node("2");
        node.right = new Node("3");
        node.left.left = new Node("4");
        node.left.right = new Node("5");
        return node;
    }
}
