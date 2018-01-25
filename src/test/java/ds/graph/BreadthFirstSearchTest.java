package ds.graph;

import ds.models.tree.binary.Tree;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vivek on 25-01-2018.
 *              A
 *           B    C     D
 *         E  F   G    H  K
 *        I               L
 *
 */
public class BreadthFirstSearchTest {

    private BreadthFirstSearch bfs =new BreadthFirstSearch();

    @Test
    public void breadthSearch() {
        String[] array = {"A","B","C","D","E","F","G","H","K","I","L"};
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        Tree tree = populateTree();
        Assert.assertEquals(list, bfs.bfs(new ArrayList<String>(), tree));;
    }

    private Tree populateTree() {
        Tree tree = new Tree("A");
        Tree subTree = new Tree("B");
        subTree.addChildren("E").addChildren("F");
        subTree.children.get(0).addChildren("I");
        tree.getChildren().add(subTree);

        subTree = new Tree("C");
        subTree.addChildren("G");
        tree.getChildren().add(subTree);

        subTree = new Tree("D");
        subTree.addChildren("H").addChildren("K");
        subTree.children.get(1).addChildren("L");
        tree.getChildren().add(subTree);

        return tree;
    }
}
