
public class Ejercicio47 {
    public static String Chinos(int nivelReunion){
        String res="";
        if (esUnNumeroValido(nivelReunion)) {
            if (nivelReunion==1) {
                res="(-.-)";
            }else{
                res="(-."+Chinos(nivelReunion-1)+".-)";
            }
        }
        return res;
    }
    private static boolean esUnNumeroValido(int number){
        return number>0;
    }
    // Compi
    public static void main(String[] args) {
        System.out.println(Chinos(1));
    }
}
