package erchashu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
       /* TreeNode root = new TreeNode(0);
        root.leftChild = new TreeNode(1);
        root.rightChild = new TreeNode(2);
        root.leftChild.leftChild = new TreeNode(3);
        root.leftChild.leftChild.leftChild = new TreeNode(7);
        root.leftChild.leftChild.rightChild = new TreeNode(8);

        root.leftChild.rightChild = new TreeNode(4);
        root.leftChild.rightChild.leftChild = new TreeNode(9);

        root.rightChild.leftChild = new TreeNode(5);
        root.rightChild.rightChild = new TreeNode(6);
        System.out.println(root);
        show(root);
        System.out.println("先序遍历：");
        preOrder(root);
        System.out.println("\n中序遍历");
        inOrder(root);
        System.out.println("\n后序遍历：");
        lastOrder(root);
        System.out.println("\n叶子节点数：");
        leaf(root);
        System.out.println("\n所有叶子节点个数："+leafCount(root));
        System.out.println("树的高度为："+rootHigh(root));
        System.out.println("树的所有节点："+countTree(root));*/
        int[] a={23,5,17,4,9,31,29,18};
        TreeNode root=createHuffmanTree(a);
            show(root);
    }
    public static TreeNode createHuffmanTree(int[] arr) {
        List<TreeNode> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            // 用数组的元素作为节点的权值，并把节点保存在 list 集合中
            list.add(new TreeNode(arr[i]));
        }
        while (list.size() > 1) {
            // 排序，从小到大排序
            Collections.sort(list);
            // System.out.println("list = " + list);
            //这个一定是权值最小的节点
            TreeNode minNode = list.get(0);
            //除了 minNode 节点，该节点就是权值最小的节点，只是该节点比 minNode 节点大， 比其他节点都小
            TreeNode secondMinNode = list.get(1);
            //构建一棵新的二叉树
            TreeNode parentNode = new TreeNode(minNode.data
                    + secondMinNode.data);
            parentNode.leftChild= minNode;
            parentNode.rightChild=secondMinNode;
            //从 list 集合中删除2棵已经构建成一棵二叉树的2个节点
            list.remove(minNode);
            list.remove(secondMinNode);
            //将新的二叉树的父节点加入到 list 集合中
            list.add(parentNode);
        }
        //构建完哈夫曼树后，list 集合中的第一个节点肯定是根节点，除非该方法传入的数组arr是空的
        return list.get(0);
    }


  static int count=0;
    public static  int countTree(TreeNode root){
        if (root==null){
            return 0;
        }
        count++;
        countTree(root.leftChild);
        countTree(root.rightChild);
        return count;
    }

    public static int rootHigh(TreeNode root){
        int lhigh=0;
        int rhigh=0;
        if (root==null){
            return  0;
        }
        lhigh=rootHigh(root.leftChild);
        rhigh=rootHigh(root.rightChild);
        if (lhigh>rhigh){
            return lhigh+1;
        }else {
            return rhigh+1;
        }
    }


public static int leafCount(TreeNode root){
        if(root==null){
            return  0;
        }
        if(root.leftChild==null&&root.rightChild==null){
            return 1;
        }else {
            return leafCount(root.leftChild)+leafCount(root.rightChild);
        }
}

    public static void leaf(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.leftChild==null&&root.rightChild==null){
            System.out.print(root.data+" ");
        }
        leaf(root.leftChild);
        leaf(root.rightChild);
    }
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.leftChild);
        System.out.print(root.data + " ");
        inOrder(root.rightChild);
    }
    public static void lastOrder(TreeNode root){
        if (root==null){
            return;
        }
        lastOrder(root.leftChild);
        lastOrder(root.rightChild);
    System.out.print(root.data+" ");
}
    //打印二叉树
    private static void writeArray(TreeNode currNode, int rowIndex, int columnIndex, String[][] res, int treeDepth) {
        // 保证输入的树不为空
        if (currNode == null) return;
        // 先将当前节点保存到二维数组中
        res[rowIndex][columnIndex] = String.valueOf(currNode.data);

        // 计算当前位于树的第几层
        int currLevel = ((rowIndex + 1) / 2);
        // 若到了最后一层，则返回
        if (currLevel == treeDepth) return;
        // 计算当前行到下一行，每个元素之间的间隔（下一行的列索引与当前元素的列索引之间的间隔）
        int gap = treeDepth - currLevel - 1;

        // 对左儿子进行判断，若有左儿子，则记录相应的"/"与左儿子的值
        if (currNode.leftChild != null) {
            res[rowIndex + 1][columnIndex - gap] = "/";
            writeArray(currNode.leftChild, rowIndex + 2, columnIndex - gap * 2, res, treeDepth);
        }

        // 对右儿子进行判断，若有右儿子，则记录相应的"\"与右儿子的值
        if (currNode.rightChild != null) {
            res[rowIndex + 1][columnIndex + gap] = "\\";
            writeArray(currNode.rightChild, rowIndex + 2, columnIndex + gap * 2, res, treeDepth);
        }
    }

    public static void show(TreeNode root) {
        if (root == null) System.out.println("EMPTY!");
        // 得到树的深度
        int treeDepth = getTreeDepth(root);

        // 最后一行的宽度为2的（n - 1）次方乘3，再加1
        // 作为整个二维数组的宽度
        int arrayHeight = treeDepth * 2 - 1;
        int arrayWidth = (2 << (treeDepth - 2)) * 3 + 1;
        // 用一个字符串数组来存储每个位置应显示的元素
        String[][] res = new String[arrayHeight][arrayWidth];
        // 对数组进行初始化，默认为一个空格
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                res[i][j] = " ";
            }
        }

        // 从根节点开始，递归处理整个树
        // res[0][(arrayWidth + 1)/ 2] = (char)(root.val + '0');
        writeArray(root, 0, arrayWidth / 2, res, treeDepth);

        // 此时，已经将所有需要显示的元素储存到了二维数组中，将其拼接并打印即可
        for (String[] line : res) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length; i++) {
                sb.append(line[i]);
                if (line[i].length() > 1 && i <= line.length - 1) {
                    i += line[i].length() > 4 ? 2 : line[i].length() - 1;
                }
            }
            System.out.println(sb.toString());
        }
    }

    // 用于获得树的层数
    public static int getTreeDepth(TreeNode root) {
        return root == null ? 0 : (1 + Math.max(getTreeDepth(root.leftChild), getTreeDepth(root.rightChild)));
    }
}
