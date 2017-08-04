package org.szeged.queue;

public class QueueDinamic {

    //Belso osztaly
    class Elem {
        private int value;

        private Elem nextElem;
        //private Elem tail;

        public Elem(int value, Elem nextElem) {
            this.value = value;
            this.nextElem = nextElem;
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
        Elem ujElem = new Elem(value, null);
        if (isEmpty()) {
            head = ujElem;
        } else {
            tail.nextElem = ujElem;
        }
        tail = ujElem;
    }

    public int out() {
        if (isEmpty()) {
            System.out.println("Ures a sor!");
            return -1;
        } else {
            int result = head.value;
            head = head.nextElem;
            if (head == null) {
                tail = null;
            }
            return result;
        }
    }

    public int first() {
        if (isEmpty()) {
            System.out.println("Ures a sor!");
            return -1;
        } else {
            return head.value;
        }
    }

}
