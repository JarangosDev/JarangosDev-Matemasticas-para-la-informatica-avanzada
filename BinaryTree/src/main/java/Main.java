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
        int raiz;
        int flag;
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Ingrese la raíz del árbol binario:");
        raiz = sc.nextInt();
        binaryTree.insert(raiz);

        flag = 1;
        while (flag == 1) {
            System.out.print("¿Desea continuar?\n" + "1. Sí\n" + "0. No\n");
            flag = sc.nextInt();
            if (flag == 1) {
                System.out.print("Ingrese el valor del nodo: \n");
                int nodoValue = sc.nextInt();
                binaryTree.insert(nodoValue);
            } else {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.print("Escoja el tipo de recorrido que desea realizar al nodo:\n" + "1. Pre Order\n" + "2. In Order\n" + "3. Post Order\n");
            int opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("***Recorrido PreOrder***");
                recorridoPreOrder(binaryTree.getRaiz());
                System.out.println("************************");
            } else if (opc == 2) {
                System.out.println("***Recorrido InOrder***");
                recorridoInOrder(binaryTree.getRaiz());
                System.out.println("***********************");
            } else if (opc == 3) {
                System.out.println("***Recorrido PostOrder***");
                recorridoPostOrder(binaryTree.getRaiz());
                System.out.println("*************************");
            } else {
                System.out.println("Opción inválida.");
            }
        }


    }

    public static void recorridoInOrder(Nodo nodo) {
        if (nodo != null) {
            recorridoInOrder(nodo.getIzquierdo());
            System.out.println(nodo.getValor());
            recorridoInOrder(nodo.getDerecho());
        }
    }

    public static void recorridoPreOrder(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getValor());
            recorridoPreOrder(nodo.getIzquierdo());
            recorridoPreOrder(nodo.getDerecho());
        }
    }

    public static void recorridoPostOrder(Nodo nodo) {
        if (nodo != null) {
            recorridoPostOrder(nodo.getIzquierdo());
            recorridoPostOrder(nodo.getDerecho());
            System.out.println(nodo.getValor());
        }
    }
}
