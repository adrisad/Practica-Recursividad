package PracticaRecursividad.Exercise_60;

public class Siames {
    public boolean isSiames(int number){
        boolean res=false;
        String numeroTransformado =number+"";
        if (numeroTransformado.length()%3==0) {
            int mitad=numeroTransformado.length()/2;
            String word1=separarPalabra(numeroTransformado, 0, mitad);
            String word2=separarPalabra(numeroTransformado, mitad, numeroTransformado.length());
            if (word1.equals(word2)) {
                res=true;
            }
        }
        return res;
    }
    public String separarPalabra(String text,int inicio,int fin){
        String res="";
        if (inicio<fin) {
            res=res+text.charAt(inicio)+separarPalabra(text, inicio+1, fin);
        }
        return res;
    }
}
