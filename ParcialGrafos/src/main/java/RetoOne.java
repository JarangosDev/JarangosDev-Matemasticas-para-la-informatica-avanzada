import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetoOne {

    private Scanner scanner;

    public RetoOne(Scanner scanner){
        this.scanner = scanner;
    }
    public List<List<Integer>> adjacency(int size){
        List<List<Integer>> matrixOne = new ArrayList<>();
        for(int i=1;i<=size; i++){
            List<Integer> row = new ArrayList<>();
            int edges;
            System.out.println(
            String.format("Ingrese la cantidad de nodos adyacentes del vertice %d:",i));
            edges = scanner.nextInt();
            for(int j = 1; j<=edges; j++){
                System.out.println(
                        String.format("Ingrese la adyacencia %d, del vector %d:",j,i));
                int value2 = scanner.nextInt();
                row.add(value2);
            }
            matrixOne.add(row);
        }
        return matrixOne;
    }
    void dynamic(int rows, int cols){

    }
}