package Curs24;

public class DoubleLinkedListNode <E>{

    private E value;
    private DoubleLinkedListNode next;
    private DoubleLinkedListNode previous;

    public DoubleLinkedListNode(E value,
                                DoubleLinkedListNode next,
                                DoubleLinkedListNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DoubleLinkedListNode(E value) {
        this(value, null, null);
    }

    public DoubleLinkedListNode() {}

    public void value(E value) {
        this.value = value;
    }

    public E value() {
        return value;
    }

    public DoubleLinkedListNode next() {
        return next;
    }

    public void next(DoubleLinkedListNode next) {
        this.next = next;
    }

    public DoubleLinkedListNode prev() {
        return previous;
    }

    public void prev(DoubleLinkedListNode previous) {
        this.previous = previous;
    }
}


