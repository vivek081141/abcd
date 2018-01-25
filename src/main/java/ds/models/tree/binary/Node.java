package ds.models.tree.binary;

/**
 * Created by Vivek on 21-01-2018.
 */
public class Node {

    public String data;
    public Node right;
    public Node left;

    public Node(String s) {
        this.data=s;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
