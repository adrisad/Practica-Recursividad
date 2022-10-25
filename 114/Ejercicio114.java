public class Ejercicio114 {
    public class Estrella {
        public static int SecuenciaEstrella(int nivel){
            int res;
            if (nivel==1) {
                res=10;
            }else{
                res=SecuenciaEstrella(nivel-1)+5*9*Potencia(4, nivel-2);
            }
            return res;
        }
        private static int Potencia(int base,int exponente){
            int res;
            if (exponente==0) {
                res=1;
            }else if (exponente==1) {
                res=base;
            }else{
                res=base+Potencia(base, exponente-1);
            }
            return res;
        }
        public static void main(String[] args) {
            System.out.println(SecuenciaEstrella(3));
        }
    }
}
