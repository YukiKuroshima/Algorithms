
public TreeChecker{
    class Node {
        int data;
        Node left;
        Node right;
     }

    boolean checkBST(Node root) {
        ArrayList<Node> a = new ArrayList<>();
        inorder(root);
        int prev = -1;
        for(Node n: a){
            if(n.data >= prev) return false;
        }
        return true;
    }

    void inorder(Node n){
        if(n == null){
            return;
        }
        inorder(n.left);
        a.add(node);
        inorder(n.right);
    }
}