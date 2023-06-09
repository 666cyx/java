package erchashu;

public class TreeNode implements Comparable<TreeNode>{
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }

    @Override
    public int compareTo(TreeNode o) {
        return this.data - o.data;
    }
}
