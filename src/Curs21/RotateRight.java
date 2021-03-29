package Curs21;

public class RotateRight {
    public ListNode rotateTight (ListNode head, int k){
        if(head == null || k== 0){
            return head;
        }


        int count = 1;

        ListNode it = head;
        while (it.next != null){
            it = it.next;
            count +=1;
        }
        it.next  = head;

        k = k % count;
        int positionToBreak = count - k;

        count = 1;
        it = head;
        while (count < positionToBreak){
            it = it.next;
            count += 1;
        }
        ListNode first = it.next;
        it.next = null;
        return first;
    }
}
