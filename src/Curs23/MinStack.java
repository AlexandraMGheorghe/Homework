package Curs23;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private static Deque<Integer> stack = new ArrayDeque<>();
    private static Deque<Integer> minStack = new ArrayDeque<>();


    public MinStack() {
         minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int el = stack.pop();
        if (el == minStack.peek()) {
            minStack.pop();
        }
    }

    public static int top() {
        return stack.peek();
    }

    public static int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
  }

