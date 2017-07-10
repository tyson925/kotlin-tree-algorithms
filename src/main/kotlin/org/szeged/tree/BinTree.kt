package org.szeged.tree

/**
 * Created by istvan on 7/10/17.
 */


data class BinTreeNode(val value: Int, val left: BinTreeNode?, val right: BinTreeNode?)


class BinTree() {

    fun search(root: BinTreeNode, searchValue: Int): BinTreeNode {
        var mozgo: BinTreeNode? = root

        while (mozgo != null && mozgo.value != searchValue) {
            if (searchValue < mozgo.value) {
                mozgo = mozgo.left
            } else {
                mozgo.right
            }
        }
        return mozgo!!
    }

    fun printTree(root: BinTreeNode?): BinTreeNode? {

        return if (root == null) {
            root

        } else {

            root.right ?: printTree(root.right)
            println(root.value)
            root.right ?: printTree(root.left)
        }
    }

    fun delete(root: BinTreeNode?) {

        if (root == null) {


        } else {
            root.left ?: delete(root.left)
            root.right ?: delete(root.right)
            root= null
        }
    }

}