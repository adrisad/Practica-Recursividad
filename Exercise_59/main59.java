package PracticaRecursividad.Exercise_59;

public class main59 {

    public void generarText(String text,int anchoDeColumna){
        generarText(text, anchoDeColumna, 0, 0);
    }

    public void generarText(String text,int anchoDeColumna,int i,int catCar){
        if (i<text.length()) {
            if (anchoDeColumna>=catCar) {
                System.out.print(text.charAt(i));
                generarText(text, anchoDeColumna, i+1, catCar+1);
            }else{
                System.out.println();
                generarText(text, anchoDeColumna, i, 0);
            }
        }
    }
    public static void main(String[] args) {
        main59 obj =new main59();
        obj.generarText("Esta es una prueba de escribir un texto en columnas de 50 de ancho. Que es muy diferente a lo que se puede escribir en 100 espacios.", 50);
    }
}
