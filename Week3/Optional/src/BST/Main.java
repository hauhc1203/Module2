package BST;

public class Main {
    public static void main(String[] args) {
        //create a BST
//        BST<String> tree= new BST<String>();
//        tree.insert("George");
//        tree.insert("Michael");
//        tree.insert("Tom");
//        tree.insert("Adam");
//        tree.insert("Jones");
//        tree.insert("Peter");
//        tree.insert("Daniel");
        //traverse tree


        BST<Integer> tree=new BST<Integer>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);


        System.out.println("Inorder (sorted): ");
        tree.inOrder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
