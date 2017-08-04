package org.szeged.queue;

public class QueueDinamic {

    //Belso osztaly
    class Elem {
        private int value;

        private Elem head;
        //private Elem tail;

        public Elem(int value, Elem head) {
            this.value = value;
            this.head = head;
        }


    }

    private Elem head = null;
    private Elem tail = null;


    public QueueDinamic() {
        empty();
    }

    public void empty() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(int elem) {
        head = new Elem(elem, head);
    }

    //Elhelyez a sorban egy elemet
    public void in(int value) {
        Elem ujElem = null;
        if (isEmpty()) {
            ujElem = new Elem(value, head);
        } else {
            ujElem = new Elem(value,tail);
        }
        tail = ujElem.head;
    }

    public int out() {
        if (isEmpty()) {
            return -1;
        } else {
            //TODO
            return head.value;
        }
    }

    public int first() {
        if (isEmpty()) {
            return -1;
        } else {
            return head.value;
        }
    }

}
