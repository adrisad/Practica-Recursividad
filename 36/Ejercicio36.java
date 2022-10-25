public class Ejercicio36 {
    public static void TrasponarHistograma(char[][] asteriscos){
        char[][] res=new char[asteriscos.length+1][asteriscos[0].length+1];
        TrasponarHistograma(asteriscos,res, 0, 0);
        mostrar(res, 0, 0);
    }
    private static void TrasponarHistograma(char[][] asteriscos,char[][] res,int fila,int columna){
        if (fila<asteriscos.length) {
            if (columna<asteriscos[0].length) {
                if (asteriscos[fila][columna]=='*'&&columna<res.length) {
                    res[columna][fila]='*';
                }else if (asteriscos[fila][columna]=='.'&&columna<res.length) {
                    res[columna][fila]='.';
                }
                TrasponarHistograma(asteriscos, res, fila, columna+1);
            }else{
                TrasponarHistograma(asteriscos, res, fila+1, 0);
            }
        }
    }
    private static void mostrar(char[][] tabla,int fila,int columna){
        if (fila<tabla.length) {
            if (columna<tabla[0].length) {
                System.out.print(tabla[fila][columna]+" ");
                mostrar(tabla, fila, columna+1);
            }else{
                System.out.println();
                mostrar(tabla, fila+1,0);
            }
        }
    }
    public static void main(String[] args) {
        char[][] tabla={{'.','.','.','.','.','*'},
                        {'.','.','.','*','*','*'},
                        {'.','.','.','*','*','*'},
                        {'.','.','*','*','*','*'},
                        {'*','*','*','*','*','*'}};
        mostrar(tabla, 0, 0);
        TrasponarHistograma(tabla);
    }
}
