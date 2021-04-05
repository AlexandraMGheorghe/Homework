package Curs22;

import Curs24.DoubleLinkedListNode;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;


public class BigNumbersLinkedList {
   public static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode temp = null;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);

            carry = sum / 10;

            if (temp == null) {
                temp = head = node;
            }

            else {
                temp.next = node;
                temp = temp.next;
            }
        }
         if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(head1, head2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}