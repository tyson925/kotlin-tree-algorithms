package org.szeged.verem;

public class VeremDinamikus {

    //Belso osztaly
    class Node{
        public int ertek;

        public Node kovetkezo;

        public Node(int ertek, Node kovetkezo){
            this.ertek = ertek;
            this.kovetkezo = kovetkezo;
        }
    }

    private Node head = null;

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
        head = new Node(elem, head);
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        } else {

            head = head.kovetkezo;
            return head.ertek;
        }
    }

    public int top(){
        if (isEmpty()){
            return -1;
        } else {
            return head.ertek;
        }
    }

}
