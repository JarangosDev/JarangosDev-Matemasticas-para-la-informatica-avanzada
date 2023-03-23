package co.edu.itm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int dato = 1;
        String dato2 = "mi dato";
        boolean isTrue = false;
        float dato3 = 2.5F;
        char letra = 'a';
        Date date = new Date();
        long otro = 1;
        String[] names = {"Juan", "Pedro"}; //Tienen tamaño que no se puede cambiar.
        ArrayList<String> names2 = new ArrayList<>(); //Son la mejora de los Arrays, se puede cambiar y es dinámico.
        names2.add("Juan"); //Agrega elementos siempre al final de la lista.
        names2.add("José");

        List<String> names3 = new ArrayList<>();


        System.out.println("El valor de names2 es: " + names2 + ".");


        Student  Diomedes = new Student();
        Diomedes.setId("1005677420");
        Diomedes.setEmail("jairarango10@gmail.com");
        Diomedes.setFullName("Jair Emir Arango Berdugo");


        System.out.println(Diomedes.getId());
        System.out.println(Diomedes.getFullName());
    }
}