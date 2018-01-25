package ds.graph;

import ds.models.tree.binary.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Vivek on 25-01-2018.
 */
public class BreadthFirstSearch {

    public List<String> bfs(List<String> list,Tree tree){
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(tree);
        while(!queue.isEmpty()){
            Tree temp = queue.remove();
            if(!temp.isVisited){
                temp.isVisited=true;
                list.add(temp.data);
                System.out.print(temp.data);
            }
            for(Tree node : temp.getChildren()){
                if(!node.isVisited){
                    queue.add(node);
                }
            }
        }

        return list;
    }
}
