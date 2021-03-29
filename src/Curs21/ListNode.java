package Curs21;

public class ListNode<I extends Number> {

  int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode<Number> next) { this.val = val; this.next = next; }

    public static ListNode deleteDuplicates(ListNode<Number> head) {
        ListNode<Number> aux = head;

        while(aux != null && aux.next != null){
            if (aux.next.val == aux.val) {
                aux.next = aux.next.next;
            } else {
                aux = aux.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        System.out.println(deleteDuplicates(head));

    }

    @Override
    public String toString() {
        return " " + val +  ", " + next ;
    }
}
