import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {

    private Scanner scanner;

    public Matrix(Scanner scanner){
        this.scanner = scanner;
    }
    public List<List<Boolean>> square(int size){
        boolean symmetry = true;
        List<List<Boolean>> matrix = new ArrayList<>();
        for(int i=1;i<=size; i++){
            List<Boolean> row = new ArrayList<>();
            for(int j=1; j<=size; j++){
                System.out.println(
                        String.format("Ingrese la posición %d,%d:",i,j));
                boolean value = scanner.nextBoolean();
                row.add(value);
            }
            matrix.add(row);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j){
                    if (matrix.get(i).get(j) ==true) symmetry = false;
                }
            }

        }
        if (symmetry){
            System.out.println("La matriz ingresada es simétrica y cuadrada.");
        }else{
            System.out.println("La matriz ingresada NO es simétrica cuadrada.") ;
        }
        return matrix;
    }
    void dynamic(int rows, int cols){

    }
}