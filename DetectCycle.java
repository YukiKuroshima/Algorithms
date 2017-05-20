import java.util.ArrayList;

public class DetectCycle {
//    public boolean hasCycle(Node head) {
//        // head is current
//        Node current = head;
//        ArrayList<Node> a = new ArrayList<>();
//        // while current is not null
//        while (current != null) {
//            // check is current is in the AL
//
//            for (Node n : a) {
//                if (n == current) {
//                    return true;
//                }
//            }
//            a.add(current);
//            current = current.next;
//        }
//        return false;
//    }

    public boolean hasCycle(Node head) {
        Node n1 = head;
        Node n2 = head;

        while (n1 != null && n2 !=null && n1.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
            if(n1 == n2) return true;
        }
        return false
    }
}
