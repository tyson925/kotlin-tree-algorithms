package org.szeged.list;

import org.szeged.queue.QueueDinamic;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static org.junit.Assert.assertEquals;

/**
 * Created by istvan on 8/16/17.
 */
public class LinkedListTest {



    public static void main(String[] args) {
    LinkedListTest test = new LinkedListTest();
    test.testListAdd();
//test.testListGet();
    }

    public void testListAdd() {
        long start = System.currentTimeMillis();

        LinkedList list = new LinkedList();

        for (int i = 0; i < 12000; i++) {
            list.insertFirst(i);
        }
        long end = System.currentTimeMillis();

        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

    }

    public void testListGet(){

        LinkedList list = new LinkedList();

        for (int i = 0; i < 12; i++) {
            list.insertFirst(i);
        }
        System.out.println("A list aktuális eleme: " + list.getActualValue());

        assertEquals(11,list.getActualValue());

        for (int i = 0; i < 11; i++) {
            System.out.println("A sor aktuális eleme: " + list.getActualValue() + "\t a sor mérete:\t" + list.getSize());
            list.stepForeward();
        }
    }


}
