package Curs24;

public class MyLinkedList<E> {

    private DoubleLinkedListNode [] myIntLinkedList;
    private DoubleLinkedListNode<E> head;
    private DoubleLinkedListNode<E> tail;
    public int size;

    public MyLinkedList() {
        this.myIntLinkedList = null;
        this.head = null;
        this.tail = null;
    }

    public MyLinkedList(DoubleLinkedListNode[] myIntLinkedList) {
        this.myIntLinkedList = myIntLinkedList;
        this.head = null;
        this.tail = null;
    }

    public void add (int index, E element){
        if (index > this.size ){
            System.out.println("Nu se poate adauga element pe acea pozitie");
        }

        this.size +=1;

        if(index == 0){
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<E>(element);
            this.head.prev(node);
            node.next(head);
            this.head = node;
        }

        if(index == this.size){
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
            this.tail.next(node);
            node.prev(tail);
            this.tail = node;
        }

        DoubleLinkedListNode <E> it = this.head;
        int counter = 1;
        while (counter < index){
            it = it.next();
            counter += 1;
        }
        DoubleLinkedListNode <E> aux = it;
        DoubleLinkedListNode <E> aux1 = it.next();
        DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
        aux.next(node);
        aux1.prev(node);
        node.next(aux1);
        node.prev(aux);
    }

    public int size() {
        return this.size;
    }

    public boolean contains (E element){
        DoubleLinkedListNode value = new DoubleLinkedListNode(element);
        DoubleLinkedListNode it = head;

        while (it != null) {
            if (it == value) {
                return true;
            }
            it = it.next();
        }
        return false;
    }

    public int indexOf(E element) {

        int counter = 0;

        DoubleLinkedListNode value = new DoubleLinkedListNode(element);
        DoubleLinkedListNode it = head;

        while (it != null) {
            if (it.value() == value.value()) {
                return counter;
            }
            counter++;
            it = it.next();
        }
        return -1;
    }

    public int lastIndexOf(E element) {
        int counter = 0;
        int poz = -1;

        DoubleLinkedListNode elem = new DoubleLinkedListNode(element);
        DoubleLinkedListNode it = head;
        while (it != null) {
            if (it.value() == elem.value()) {
                poz = counter;
            }
            counter++;
            it = it.next();
        }

        return poz;
    }

    public boolean remove(E element) {
        DoubleLinkedListNode elem = new DoubleLinkedListNode(element);
        DoubleLinkedListNode it = head;

        while (it != null) {
            if (it.value() == elem.value()) {
                it = it.prev();
                it.next(it.next().next());
                it = it.next();
                it.prev(it.prev().prev());
                return true;
            }
            it = it.next();
        }
        return false;
    }
    public void clear() {
        this.head = null;
        this.head.next(null);
        this.tail = null;
        this.tail.prev(null);
    }

    public E set(int index, E element) {
        if (index > size()) {
            System.out.println("Nu se poate seta elementul pe pozitia" + index);
        }

        DoubleLinkedListNode it = head;

        for (int i = 0; i < index; i++) {
            it.value(element);
        }
        return element;
    }

    public boolean addAll(MyLinkedList c) {
        DoubleLinkedListNode it = tail;
        it.next(c.head);
        it = it.next();
        it.prev(it.prev().prev());
        tail = c.tail;
        return true;
    }

    public boolean addAll(int index, MyLinkedList c) {
        if (index > size()) {
            return false;
        }

        DoubleLinkedListNode it = head;

        for (int i = 0; i < index; i++) {
            it = it.next();
        }
        DoubleLinkedListNode left = it;
        DoubleLinkedListNode right = it.next();
        c.head.prev(left);
        left.next(c.head);
        c.tail.next(right);
        right.prev(c.tail);

        return true;
    }

    public int[] toArray() {
        int[] array = new int[this.size];

        DoubleLinkedListNode it = head;
        for (int i = 0; i < this.size; i++) {
            array[i] = it.value();
            it = it.next();
        }

        return array;
    }




    public void add(E element) {
        if (head == null && tail == null) {
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<E>(element);
            this.tail = node;
            this.head = node;
            this.tail.prev(head);
            this.head.prev(tail);
        } else {
            DoubleLinkedListNode<E> node = new DoubleLinkedListNode<>(element);
            this.tail.next(node);
            node.prev(tail);
            this.tail = node;
        }
        this.size += 1;
    }



    public E get(int index) {
        if (index > this.size) {
            return null;
        }
        DoubleLinkedListNode <E> it = this.head;
        int counter = 0;
        while (counter < index) {
            it = it.next();
            counter += 1;
        }
        return it.value();
    }

    public E remove (int index){
        if (index> this.size){
            return null;
        }
        this.size -=1;

        if(index == 0){
            E value = this.head.value();
            this.head = this.head.next();
            this.head.prev(null);
            return value;
        }

        if(index == this.size){
            E value = this.tail.value();
            this.tail = this.tail.prev();
            this.tail.next(null);
            return value;
        }

        DoubleLinkedListNode <E> it = this.head;
        int counter = 1;
        while (counter < index){
            it = it.next();
            counter += 1;
        }
        DoubleLinkedListNode <E> aux = it.next();
        it.next(it.next().next());
        it.next().prev(it);
        return aux.value();
    }




}
