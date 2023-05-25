
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {

    public String Matriz() {
        int size = 5;
        Scanner sc = new Scanner(System.in);
        int value = 0;
        List<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> data = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Ingrese el valor de la posición: " + (i + 1) + (j + 1));
                value = sc.nextInt();
                data.add(value);
            }
            matrix.add(data);
        }
        return "Funciona";

    }

}
