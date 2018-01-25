package ds.graph;

import ds.models.tree.binary.Tree;

import java.util.List;

/**
 * Created by Vivek on 25-01-2018.
 */
public class DepthFirstSearch {

    public List<String> deptSearch(List<String> array,Tree tree) {

        if(tree==null){
            return array;
        }

        if(!tree.isVisited){
            tree.isVisited=true;
            System.out.print(tree.data);
            array.add(tree.data);
        }

        for (Tree temp : tree.getChildren()) {
                deptSearch(array,temp);
        }

        return  array;
    }
}
