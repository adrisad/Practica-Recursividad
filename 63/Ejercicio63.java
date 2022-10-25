public class Ejercicio63 {
    public class Tranformar {
        public static int numeroDeTransformaciones(int n){
            return numeroDeTransformaciones(n,n);
        }
        private static int numeroDeTransformaciones(int n,int m){
            int cat;
            int PrimerDigito=m/10;
            int ultimoDigito=m%10;
            int suma =PrimerDigito+ultimoDigito;
            int unido= (ultimoDigito*10) + (suma%10) ;
            if (unido==n) {
                cat=1;
            }else{
                cat=1+numeroDeTransformaciones(n,unido);
            }
            return cat;
        }
        public static void main(String[] args) {
            System.out.println(numeroDeTransformaciones(26));
        }
    }
}
