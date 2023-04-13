import javax.swing.JOptionPane;
public class University {
    public static void main(String[] args) {
        bienvenida();
    }

    public static void bienvenida() {
        int opc;
        String cadena = JOptionPane.showInputDialog("Indique el proceso que desea efectuar:\n" +
                "                \"1. Finalizacion de semestre.\n" +
                "                \"2. Proceso de admision.");
        //JOptionPane.showMessageDialog(null, cadena);
        opc = Integer.parseInt(cadena);

        if (opc == 1) {
            finalizacionSemestre();
        } else if (opc == 2) {
            procesoAdmisiones();
        } else {
            JOptionPane.showMessageDialog(null, "Debes ingresar una opcion valida.");
            bienvenida();
        }
    }
    public static void finalizacionSemestre() {

        String totalStudents = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a registrar:");
        register(totalStudents);
    }

    public static void procesoAdmisiones() {
        String totalStudents = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a registrar:");
        register(totalStudents);
    }

    public static void register(String totalStudents) {
        int opc;
        int carreer=0;
        String name="";
        String gender="";
        double promMeca = 0;
        double promTele = 0;
        int cant =Integer.parseInt(totalStudents);
        int cantMTel = 0;
        int cantFTel = 0;
        int cantMMeca = 0;
        int cantFMeca = 0;
        double note = 0;
        double[] notes= {};

        carreer =Integer.parseInt(JOptionPane.showInputDialog("Escoja la carrera para la cual desea realizar el registro:\n" +
                "                \"1. Mecatronica.\n" +
                "                \"2. Telecomunicaciones."));

        for (int i = 1; i <= Integer.parseInt(totalStudents); i++) {
            name = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
            gender =JOptionPane.showInputDialog("Ingrese el genero del estudiante:\n" +
                    "F. Mujer." +
                    "M. Hombre");

            if(gender == "F" && carreer==1){
                cantFMeca++;
            }else if(gender == "M" && carreer==1){
                cantMMeca++;
            }else if(gender == "F" && carreer==2){
                cantMTel++;
            }else{
                cantFTel++;
            }
            for (int j = 0; j <= 5; j++) {
                note = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + " del estudiante:"));
                notes[j] = note ;
                if (carreer == 1){
                    promMeca = promMeca + notes[j];
                }else {
                    promTele = promTele + notes[j];
                }
            }

        }
            if (carreer == 1) {
                MecatronicStundent student = new MecatronicStundent(name, gender,notes);
            } else if (carreer == 2) {
                TelecomunicationStudent student = new TelecomunicationStudent(name, gender,notes);
                procesoAdmisiones();
            } else {
                JOptionPane.showMessageDialog(null, "Debes ingresar una opcion valida.");
            }
        }
}
