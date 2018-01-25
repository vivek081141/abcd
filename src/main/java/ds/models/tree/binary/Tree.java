package ds.models.tree.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vivek on 25-01-2018.
 */
public class Tree {

    public String data;
    public List<Tree> children;
    public boolean isVisited;

    public Tree(String b) {
        this.data=b;
    }

    public List<Tree> getChildren(){
        if(children==null){
            children=new ArrayList<Tree>();
        }
        return children;
    }

    public Tree addChildren(String data){
        getChildren().add(new Tree(data));
        return this;
    }
}
