package Exercise_25;

import EstructurasLineales.Pila;

public class Exercise25 {
    public String EliminarRepeticiones(String texto){
        Pila<Character>letras=new Pila<Character>();
        EliminarRepeticiones(texto, 0, letras);
        return Invertir(letras);
    }
    public void EliminarRepeticiones(String texto,int i,Pila<Character>letras){
        if (i<texto.length()) {
            if (letras.empty()) {
                letras.push(texto.charAt(i));
                EliminarRepeticiones(texto, i+1, letras);
            }else{
                if (texto.charAt(i)==letras.verDato()) {
                    EliminarRepeticiones(texto, i+1, letras);
                }else{
                    letras.push(texto.charAt(i));
                    EliminarRepeticiones(texto, i+1, letras);
                }
            }
        }
    }
    public String Invertir(Pila<Character>letras){
        String res="";
        if (!letras.empty()) {
            res=letras.pop()+Invertir(letras);
        }
        return res;
    }
}
