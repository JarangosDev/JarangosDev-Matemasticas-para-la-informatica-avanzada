
import java.util.Scanner;
public class GrafosReto2 {

    public static void main(String[] args) {
    Reto2();
    }

    static void Reto2(){
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix(scanner);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int matrixSize = scanner.nextInt();
        var squareMatrix = matrix.square(matrixSize);
        System.out.println(squareMatrix.toString());
    }
}
