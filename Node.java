public class Node extends Info {
	protected Info info; 
    private Node left;
    private Node right;    
    
    public Node(Info info){
        this.setInfo(info);
        setLeft(null);
        setRight(null);
    }
    public Node() {}
 
    public Info getInfo() {return info;}
    public void setInfo(Info info) {this.info = info;}
    public Node getLeft() {return left;}
    public void setLeft(Node left) {this.left = left;}
    public Node getRight() {return right;}
    public void setRight(Node right) {this.right = right;}
}
