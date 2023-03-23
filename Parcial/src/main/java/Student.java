public class Student {
    public static void main(String[] args) {
        String y;
        y = prueba(17);
        System.out.println("Resultado: " + y);
        System.out.println(Professor.second("Jair"));
    }

    public static String prueba(int x){
        if (x > 18){
            return "Estás habilitado para votar.";
        }else {
            return "No estás habilitado para votar.";
        }
    }
}
