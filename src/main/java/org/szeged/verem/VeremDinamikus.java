package org.szeged.verem;

public class VeremDinamikus {

    //Belso osztaly
    class Elem {
        private int value;

        private Elem nextElem;

        public Elem(int value, Elem nextElem){
            this.value = value;
            this.nextElem = nextElem;
        }
    }

    private int size;

    private Elem head = null;

    public VeremDinamikus(){
        empty();
        size = 0;
    }

    public void empty(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void push(int elem){
        head = new Elem(elem, head);
        size++;
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        } else {
            int value = head.value;
size--;
            head = head.nextElem;
            return value;
        }
    }

    public int top(){
        if (isEmpty()){
            return -1;
        } else {
            return head.value;
        }
    }

    public int getSize(){
        return size;
    }

}
