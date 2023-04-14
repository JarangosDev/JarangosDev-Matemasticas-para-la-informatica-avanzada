
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        retoOne();
        retoTwo();
    }

        static  void retoOne(){
            Scanner scanner = new Scanner(System.in);
            RetoOne matrixOne = new RetoOne(scanner);
            System.out.print("*/////////////////////////////////Bienvenido al reto 1://///////////////////////////////*\n");
            System.out.print("Ingrese el tamaño de la matriz: ");
            int matrixSize = scanner.nextInt();
            var matrixAdy = matrixOne.adjacency(matrixSize);
            System.out.println("//////////La matriz ingresada es://////////");
            System.out.println(matrixAdy.toString());
            System.out.println("//////////Visualización de adyacencia://////////");
            for (int i = 0; i < matrixAdy.size(); i++) {
                System.out.println("El vertice: " + i + " es adyacente con el (los) vertice(s): ");
                System.out.println(matrixAdy.get(i));
            }

        }
    static void retoTwo(){
        Scanner scanner = new Scanner(System.in);
        RetoTwo retoTwo = new RetoTwo(scanner);
        System.out.print("*/////////////////////////////////Bienvenido al reto 2://///////////////////////////////*\n");
        System.out.print("Ingrese el tamaño de la matriz: ");
        int matrixSize = scanner.nextInt();
        var squareMatrix = retoTwo.square(matrixSize);
        retoTwo.print(squareMatrix);
    }


}
