package PracticaRecursividad.Exercise_60;

public class Siames {
    public boolean isSiames(int number){
        boolean res=false;
        if (number%3==0) {
            String number1 =number+"";
            int mitad=number1.length()/2;
            String word1=separarPalabra(number1, 0, mitad);
            String word2=separarPalabra(number1, mitad, number1.length());
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
