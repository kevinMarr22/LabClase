public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt = bt.createBinaryTree();
        bt.traverseInOrder(bt.root);
    }
}