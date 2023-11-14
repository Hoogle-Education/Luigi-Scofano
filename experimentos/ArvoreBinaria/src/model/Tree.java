package model;

public class Tree {
    private Node root;

    public void add(int value) {
        root = add(value, root);
    }

    private Node add(int value, Node node) {

        // case base
        if(node == null) {
            System.out.println("Encontrei lugar vazio");
            node = new Node(value);
            return node;
        }

        System.out.println("Passando pelo... " + node.value);
        if(node.value > value) {
            System.out.println("vai a esquerda...");
            node.left = add(value, node.left);
        } else if(node.value < value){
            System.out.println("vai a direita...");
            node.right = add(value, node.right);
        }

        return node;
    }

    private String read(Node node) {
        if(node == null) return "";

        String leftValue = read(node.left);
        String rigthValue = read(node.right);

        return leftValue + " - " + node.value + " - " + rigthValue;
    }

    @Override
    public String toString() {
        String aux = "";

        aux += read(root);

        return aux;
    }
}
