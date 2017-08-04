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

    private Elem head = null;

    public VeremDinamikus(){
        empty();
    }

    public void empty(){
        head = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void push(int elem){
        head = new Elem(elem, head);
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        } else {

            head = head.nextElem;
            return head.value;
        }
    }

    public int top(){
        if (isEmpty()){
            return -1;
        } else {
            return head.value;
        }
    }

}
