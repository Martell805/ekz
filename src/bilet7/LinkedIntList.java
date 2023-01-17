package bilet7;

public class LinkedIntList {
    private ListNode front;

    public class ListNode{
        public int data;
        public ListNode next;
    }

    public void removeAll(LinkedIntList list2) {
        ListNode prevNode = null;
        ListNode curNode = front;
        ListNode curCheckNode = list2.front;

        while (curNode != null && curCheckNode != null) {
            if(curCheckNode.data > curNode.data) {
                prevNode = curNode;
                curNode = curNode.next;
                continue;
            }

            if(curCheckNode.data < curNode.data) {
                curCheckNode = curCheckNode.next;
                continue;
            }

            if(prevNode != null) {
                prevNode.next = curNode.next;
            }

            curNode = curNode.next;
        }
    }
}
