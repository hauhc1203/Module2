package BST;

public class BST<E extends Comparable<E>> extends AbstractTree<E>{


    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = new TreeNode<>(e);
        else {

            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = new TreeNode<>(e);
            else
                parent.right = new TreeNode<>(e);
        }
        size++;
        return true;
    }



    @Override
    public int getSize() {
        return this.size;
    }
    @Override
    public void inOrder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> node) {
        if (node == null){
            // neu node = null thi return
            return;
        }else {
            // neu khong thi kiem tra de quy node con ben trai
            inorder(node.left);

        }
        // in gia tri node
        System.out.println(node.element + " ");
        // kiem tra de quy node con ben phai
        inorder(node.right);
    }
}