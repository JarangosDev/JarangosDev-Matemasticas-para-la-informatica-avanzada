import co.edu.itm.undirectedgraph.Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix(scanner);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int matrixSize = scanner.nextInt();
        var squareMatrix = matrix.square(matrixSize);
        System.out.println(squareMatrix);
    }

}
