import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int valor) {
        root = insertR(root, valor);
    }

    private static Node insertR(Node raiz, int valor) {
        Scanner sc = new Scanner(System.in);
        if (raiz == null) {
            raiz = new Node(valor);
            return raiz;
        }

        System.out.print("Escoja la opción en la cual desea insertar el nodo hijo: \n" + "1. Izquierda.\n" + "2. Derecha.\n");
        int opc = sc.nextInt();

        if (opc == 1) {
            raiz.setLeft(insertR(raiz.getLeft(), valor));
        } else if (opc == 0) {
            raiz.setRight(insertR(raiz.getRight(), valor));
        }

        return raiz;
    }
}
