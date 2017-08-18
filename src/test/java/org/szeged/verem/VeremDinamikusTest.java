package org.szeged.verem;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static org.junit.Assert.assertEquals;

public class VeremDinamikusTest {

    public static void main(String[] args) {
        VeremDinamikusTest test = new VeremDinamikusTest();
        test.dinamikusVeremIndex(12000L);
        //test.testVeremPop();
    }

    public void averageRunningTime(){
        for (int i = 0; i < 10; i++) {
            dinamikusVeremIndex(120000L);
        }
    }

    public Long dinamikusVeremIndex(Long limit) {
        long start = System.currentTimeMillis();

        VeremDinamikus verem = new VeremDinamikus();

        for (int i = 0; i < limit; i++) {
            verem.push(i);
        }
        long end = System.currentTimeMillis();

        Long runningTime = end - start;
        NumberFormat formatter = new DecimalFormat("#0.00000");

        System.out.print("Execution time is " + formatter.format((runningTime) / 1000d) + " seconds");
        return runningTime;
    }

    public void testVeremPop() {
        VeremDinamikus verem = new VeremDinamikus();

        for (int i = 0; i < 12; i++) {
            verem.push(i);
        }
        System.out.println("A verem legfelső eleme: " + verem.top());

        assertEquals(11, verem.pop());


        for (int i = 0; i < 11; i++) {
            System.out.println("A verem legfelső eleme: " + verem.pop() + "\t a verem mérete:\t" + verem.getSize());
        }
    }
}
