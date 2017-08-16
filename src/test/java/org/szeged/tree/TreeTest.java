package org.szeged.tree;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by istvan on 8/16/17.
 */
public class TreeTest {

    public static void main(String[] args) {
        TreeTest test = new TreeTest();
        test.insertToTree();

    }

    public void insertToTree(){
        long start = System.currentTimeMillis();
        BinTreeJava tree = new BinTreeJava();
        BinTreeNode root = tree.insertNode(null,0);
        for (int i=1; i< 12000; i++){
            tree.insertNode(root,i);
        }
        long end = System.currentTimeMillis();

        //tree.printTree(root);
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }

    public void insertRandomValuesToTree(){

    }
}
