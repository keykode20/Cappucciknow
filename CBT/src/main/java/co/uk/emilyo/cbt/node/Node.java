package co.uk.emilyo.cbt.node;

/**
 * Created by Emilio on 08/07/2018.
 */
public abstract class Node {

    private Node nextNode;

    public abstract Object action(Object o);

    public Object start(Object o){
        Object r = null;
        if(this != null){
            r = this.action(o);
        }
        if(this != null && this.nextNode != null){
            r = this.nextNode.action(r);
        }
        return r;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}