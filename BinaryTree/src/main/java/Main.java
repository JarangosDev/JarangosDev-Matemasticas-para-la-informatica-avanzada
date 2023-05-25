import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    /*
     * Pasos:
     * 1. Tener claro cuando debe parar la recursividad.
     * 2. Cada nodo del árbol es un objeto(instancia de la clase).
     * 3.
     * */
    public static void main(String[] args) {
        System.out.println("***Bienvenido***");
        System.out.println("A continuación, ingrese el árbol binario que desea procesar:\n");
        tree();
    }

    public static void tree() {
        Scanner sc = new Scanner(System.in);
        int root;
        int flag;
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Ingrese la raíz del árbol binario:");
        root = sc.nextInt();
        binaryTree.insert(root);

        flag = 1;
        while (flag == 1) {
            System.out.print("¿Desea continuar?\n" + "1. Sí.\n" + "0. No.\n");
            flag = sc.nextInt();
            if (flag == 1) {
                System.out.print("Ingrese el valor del nodo: \n");
                int nodeValue = sc.nextInt();
                binaryTree.insert(nodeValue);
            } else if (flag == 0) {
                flag = 0;
            } else {
                System.out.println("Opción inválida. Escoja una opción correcta.");
            }
        }
        if (flag == 0) {
            System.out.print("Escoja el tipo de recorrido que desea realizar al nodo:\n" + "1. Pre Order.\n" + "2. In Order.\n" + "3. Post Order.\n");
            int opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("***Recorrido PreOrder***");
                preOrderRoute(binaryTree.getRoot());
                System.out.println("************************");
            } else if (opc == 2) {
                System.out.println("***Recorrido InOrder***");
                inOrderRoute(binaryTree.getRoot());
                System.out.println("***********************");
            } else if (opc == 3) {
                System.out.println("***Recorrido PostOrder***");
                postOrderRoute(binaryTree.getRoot());
                System.out.println("*************************");
            } else {
                System.out.println("Opción inválida. Escoja una opción correcta.");
            }
            System.out.println("***¡Hasta pronto!***");
        }
    }
    public static void inOrderRoute(Node node) {
        if (node != null) {
            inOrderRoute(node.getLeft());
            System.out.println(node.getValue());
            inOrderRoute(node.getRight());
        }
    }
    public static void preOrderRoute(Node node) {
        if (node != null) {
            System.out.println(node.getValue());
            preOrderRoute(node.getLeft());
            preOrderRoute(node.getRight());
        }
    }
    public static void postOrderRoute(Node node) {
        if (node != null) {
            postOrderRoute(node.getLeft());
            postOrderRoute(node.getRight());
            System.out.println(node.getValue());
        }
    }
}
