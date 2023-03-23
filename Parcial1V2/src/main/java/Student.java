import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        register();
    }
    public static void register(){
        int promedioT, promedioG = 0;
        String name, gender, age = "";
        var myList = new ArrayList<ArrayList<>>();
        String[] student = {};
            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de estudiantes a registrar."));
        var data = new ArrayList<String>();
        var notes = new ArrayList<Integer>();

            for (int i = 0; i <= cantidad; i++){
                data.add(JOptionPane.showInputDialog("Ingrese el nombre del estudiante."));
                data.add(JOptionPane.showInputDialog("Ingrese el género del estudiante."));
                data.add(JOptionPane.showInputDialog("Ingrese la edad del estudiante."));

                for (int j = 0; j <= cantidad; j++){
                notes.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota" + (j + 1) +" de estudiante.")));
                }
                myList.add(data);
                myList.add(notes);
            }
        JOptionPane.showMessageDialog(null, cantidad);
    }
}
