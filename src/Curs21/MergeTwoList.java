package Curs21;

public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }
        ListNode newList=new ListNode(0);
        ListNode temp=newList;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        if(l1!=null){
            while(l1!=null){
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        return newList.next;

    }
}
