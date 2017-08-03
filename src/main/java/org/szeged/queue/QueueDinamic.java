package org.szeged.queue;

public class QueueDinamic {

    //Belso osztaly
    class Elem {
        private int ertek;

        private Elem head;
        private Elem tail;

        public Elem(int ertek, Elem head){
            this.ertek = ertek;
            this.head = head;
        }
    }

}
