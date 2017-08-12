
public TreeChecker{
    class Node {
        int data;
        Node left;
        Node right;
     }

    boolean checkBST(Node root) {

    }

    boolean check(Node r, Node n ,Node l){
        if(r.left)
        
        return check(r.data < n.data && n.data < l.data) && check(r.data < n.data && n.data < l.data);
    }
}