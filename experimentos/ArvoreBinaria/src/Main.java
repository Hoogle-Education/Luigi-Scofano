import model.Tree;

public class Main {
    public static void main(String[] args) {
        Tree myTree = new Tree();

        myTree.add(2);
        myTree.add(1);
        myTree.add(4);
        myTree.add(3);
        myTree.add(5);

        System.out.println(myTree);
    }
}