package algorithm.base.tree;

/**
 * @ClassName LinkedBiTree
 * @Description [链表实现二叉树]
 * @Author ANGLE0
 * @Date 2019/12/25 21:18
 * @Version V1.0
 **/
public class LinkedBiTree {

    private BiNode root;

    public LinkedBiTree() {
        this.root.data = null;
        this.root.Lchild = null;
        this.root.Rchild = null;
    }

    public LinkedBiTree(Object data) {
        this.root = new BiNode();
        this.root.data = data;
        this.root.Rchild = null;
        this.root.Lchild = null;
    }

    public void PreOrder(BiNode tRoot) {
        if (null != tRoot) {
            visit(tRoot.data);
            PreOrder(tRoot.Lchild);
            PreOrder(tRoot.Rchild);
        }
    }

    public void InOrder(BiNode tRoot) {
        if (null != tRoot) {
            PreOrder(tRoot.Lchild);
            visit(tRoot.data);
            PreOrder(tRoot.Rchild);
        }
    }

    public void PostOrder(BiNode tRoot) {
        if (null != tRoot) {
            PreOrder(tRoot.Lchild);
            PreOrder(tRoot.Rchild);
            visit(tRoot.data);
        }
    }

    public void visit(Object data) {
        System.out.print(" " + data);
    }

    public BiNode getRoot() {
        return root;
    }

    public void setRoot(BiNode root) {
        this.root = root;
    }

    class BiNode {

        Object data;
        BiNode Lchild;
        BiNode Rchild;

        public BiNode() {
        }

        public BiNode(Object data) {
            this.data = data;
            this.Lchild = null;
            this.Rchild = null;
        }
    }
}
