import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetoTwo {

    private Scanner scanner;

    public RetoTwo(Scanner scanner){
        this.scanner = scanner;
    }
    public List<List<Boolean>> square(int size){
        boolean symmetry = true;
        List<List<Boolean>> matrix = new ArrayList<>();
        for(int i=1;i<=size; i++){
            List<Boolean> row = new ArrayList<>();
            for(int j=1; j<=size; j++){
                System.out.println(
                        String.format("Ingrese (TRUE O FALSE) en la posición %d,%d:",i,j));
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
        System.out.println("//////////Visualización de resultado://////////");
        if (symmetry){
            System.out.println("La matriz ingresada es simétrica y cuadrada.");
        }else{
            System.out.println("La matriz ingresada NO es simétrica, pero si cuadrada.") ;
        }

        return matrix;
    }
    void dynamic(int rows, int cols){

    }

    public void print(List<List<Boolean>> matrix)
    {
        for (List<Boolean> result :matrix)
        {
            List<Integer> valuesint = new ArrayList<>();

            for ( Boolean value: result)
            {
                valuesint.add(this.convertion(value));
            }
            System.out.println(valuesint);
        }
    }

    private int convertion(Boolean value)
    {
        return value == Boolean.TRUE ? 1:0;
    }
}