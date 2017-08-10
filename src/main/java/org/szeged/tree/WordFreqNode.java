package org.szeged.tree;

/**
 * Created by istvan on 8/10/17.
 */
public class BinTreeFreqNode extends BinTreeNode {

    private Integer freq;

    public BinTreeFreqNode(int value, int freq, BinTreeNode rightNode, BinTreeNode leftNode) {
        super(value, rightNode, leftNode);
        this.freq = freq;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "BinTreeFreqNode{" +
                "freq=" + freq +
                "} " + super.toString();
    }
}
