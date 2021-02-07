package Curs6;

import java.util.Arrays;

public class MyIntArrayList {

    private int[] elements;
    private int size;

    // Constructor 1
    public MyIntArrayList() {
        this(10);
    }

    // Constructor 2
    public MyIntArrayList(MyIntArrayList c){
        this.size = c.size;
        elements = new int[size];
        if (size!= 0){
            for ( int i = 0; i < this.size; i++){
                this.elements[i] = c.elements[i];
            }
        }
        this.elements = Arrays.copyOf(c.elements, c.size);
    }

    // Constructor 3
    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    // metoda void add
    public void add (int index, int element){
        if (index < 0 || index >= this.size) {
            System.out.println("Throwing IndexOutOfBoundsException when trying to add element at position" + index);
        }
        ArrayCapacity();

        for(int j = size; j > index; j--){
            this.elements[j] = this.elements[j-1];
        }
        this.elements[index] = element;
        this.size++;
    }

    public void  ArrayCapacity (){
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
    }

    // metoda boolean add
    public boolean add(int e) {
        ArrayCapacity();
        this.elements[size] = e;
        this.size++;
        return true;
    }

    //metoda size
    public int size() {
        return this.size;
    }

    // metoda boolean contains
    public boolean contains (int e){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i] == e ){
                return true;
            }
        }
        return false;
    }

    //metoda int get
    public int get(int index) {
        return this.elements[index];
    }

    //metoda indexOf
    public int indexOf(int e) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    //metoda lastIndexOf
    public int lastIndexOf (int e){
        for (int i = this.size -1; i >= 0; i--) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    //metoda boolean remove
    public boolean remove(int e){
        boolean found = false;
        int index = 0;
        for (int i = 0; i< this.size; i++){
            if (elements[i] == e){
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            for(int i = index; i < this.size; i++){
                elements[i] = elements[i+1];
            }
            this.size--;
        }
        return found;
    }

    //metoda removeElementAtIndex
    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Throwing IndexOutOfBoundsException when trying to remove element at position" + index);
            return -1;
        }
        int removeElement = this.elements[index];
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return removeElement;
    }

    //metoda clear
    public void clear() {
        this.size = 0;
    }

    //metoda set
    public int set(int index, int e){
        if (index < 0 || index >= this.size){
            System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
                    " the element " + e + " at position " + index);
            return -1;
        }
        int replacedElement = this.elements[index];
        this.elements[index] = e;
        return replacedElement;
    }

    //metoda boolean addAll
    public boolean addAll(MyIntArrayList c){
        if (c.size == 0) {
            System.out.println("NullPointerException ");
        }
        int [] newElements = Arrays.copyOf(elements, this.size+c.size);
        int noOfElement = 0;
        for (int i = this.size; i<newElements.length; i++){
            this.elements[i] = c.elements[noOfElement];
            noOfElement++;
        }
        this.elements = Arrays.copyOf(newElements, newElements.length);
        this.size = newElements.length;
        return true;
    }

    //metoda boolean addAll
    public boolean addAll (int index, MyIntArrayList c){
        if (c.size == 0) {
            System.out.println("NullPointerException ");
        }
        int [] newElements = Arrays.copyOf(elements, this.size+c.size);
        int noOfElement = 0;
        int valueIndex = index;
        for (int i = 0; i < newElements.length; i++){
            if (i < index) {
                newElements[i] = this.elements[i];
            }else if ( i>= index && i <index + c.size){
                newElements[i] = c.elements[noOfElement];
                noOfElement++;
            }else{
                newElements [i] = this.elements[valueIndex];
                valueIndex++;
            }
        }
        this.elements = Arrays.copyOf(newElements, newElements.length);
        this.size = newElements.length;
        return true;
    }

    //metoda toArray
    public  int[]toArray(){
        int [] array = Arrays.copyOf(this.elements, this.size);
        return array;
    }

    //metoda ensureCapacity
    public void ensureCapacity (int minCapacity){
        int [] array = Arrays.copyOf(this.elements, minCapacity);
    }

    //metoda trimToSize
    public void trimToSize(){
        int [] array = Arrays.copyOf(this.elements, this.size);

    }

}

