package org.szeged.verem;


public class VeremDinamikusGenerics<T>{


    //Belso osztaly
    class NodeGenerics<T extends Comparable<?>> {
        private T value;

        private NodeGenerics nextNode;

        public NodeGenerics(T value, NodeGenerics nextNode){
            this.value = value;
            this.nextNode = nextNode;
        }

        public T getValue() {
            return value;
        }

        int compareTo(NodeGenerics node){
            if (this.value > node.value){
                return -1;
            } else {
                return 1;
            }
        }
    }

    private int size;

    private NodeGenerics head = null;

    public VeremDinamikusGenerics() {
        empty();
        size = 0;
    }

    public void empty() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(T value) {
        head = new NodeGenerics(value, head);
        size++;
    }

    public  T pop() {
        if (isEmpty()) {
            System.out.println("A lista ures");
            return null;
        } else {
            T value = head.getValue();
            size--;
            head = head.nextNode;
            return value;
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return head.value ;
        }
    }


    public int getSize() {
        return size;
    }

}
