package Curs24;

public class MyStack<E> {
    MyLinkedList <E> container;

    public MyStack(){
        this.container =  new MyLinkedList<E>();
    }

    public void push (E element){
        this.container.add(element);
    }

    public E pop(){
        return this.container.remove(this.container.size - 1);
    }

    public E peek(){
        return this.container.get(this.container.size - 1);
    }

}
