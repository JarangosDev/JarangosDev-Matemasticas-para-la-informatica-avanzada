import java.util.Scanner;

public class BinaryTree {
    private Nodo raiz;

    public BinaryTree() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void insert(int valor) {
        raiz = insertarR(raiz, valor);
    }

    private static Nodo insertarR(Nodo raiz, int valor) {
        Scanner sc = new Scanner(System.in);
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        System.out.print("Escoja la opción en la cual desea insertar el nodo hijo: \n" + "1. Izquierda.\n" + "2. Derecha.\n");
        int opc = sc.nextInt();

        if (opc == 1) {
            raiz.setIzquierdo(insertarR(raiz.getIzquierdo(), valor));
        } else if (opc == 0) {
            raiz.setDerecho(insertarR(raiz.getDerecho(), valor));
        }

        return raiz;
    }
}
