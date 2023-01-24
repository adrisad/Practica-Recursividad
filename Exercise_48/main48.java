package PracticaRecursividad.Exercise_48;

import EstructurasLineales.ListSE;
import EstructurasLineales.Pila;

public class main48 {
    public void Convertir_a_Pila(String texto,Pila<Letra> letras){
        Convertir_a_Pila(texto, letras, 0);
    }
    private void Convertir_a_Pila(String texto,Pila<Letra> letras,int i){
        if (i<texto.length()) {
            if (letras.empty()) {
                letras.push(new Letra(texto.charAt(i)));
                Convertir_a_Pila(texto, letras, i+1);
            }else{
                if (letras.verDato().getletra()==texto.charAt(i)) {
                    letras.verDato().AumentarOcurrencia();
                    Convertir_a_Pila(texto, letras, i+1);
                }else{
                    letras.push(new Letra(texto.charAt(i)));
                    Convertir_a_Pila(texto, letras, i+1);
                }
            }  
        }
    }
    public int MayorPatron(String texto,String patron){
        Pila<Letra> letras=new Pila<Letra>();
        Convertir_a_Pila(texto, letras);
        ListSE<Integer> res=new ListSE<Integer>();
        ListSE<Letra> PilaTransformada=new ListSE<Letra>();
        Convertir_a_lista(letras, res, PilaTransformada);
        Convertir_a_lista(letras, patron, patron.length()-1, res,0);
        return MayorPatron(res, 0, 0);
    }
    private int MayorPatron(ListSE<Integer> res,int i,int mayor){
        int respuesta=0;
        if (i<res.Longitud()) {
            if (res.acceder(i)>mayor) {
                mayor=res.acceder(i);
                respuesta=MayorPatron(res, i+1, mayor);
            }else{
                respuesta=MayorPatron(res, i+1, mayor);
            }
        }else{
            respuesta=mayor;
        }
        return respuesta;
    }
    public void Convertir_a_lista(ListSE<Letra> respuesta,String patron,int i,ListSE<Integer> res,int aux){
        if (i<respuesta.Longitud()) {
            if (respuesta.verDato().getletra()==patron.charAt(i)) {
                aux=aux+respuesta.pop().getOcurrencias();
                Convertir_a_lista(respuesta, patron, i-1, res,aux);
            }else{
                letras.pop();
                Convertir_a_lista(respuesta, patron, patron.length()-1, res,0);
            }
        }
        else{
            res.insertarInicio(aux);
            Convertir_a_lista(respuesta, patron, patron.length()-1, res,0);
        }
    }
    private void Convertir_a_lista(Pila<Letra> letras,ListSE<Integer> res,ListSE<Letra> respuesta){
        if (!letras.empty()) {
            respuesta.insertarInicio(letras.pop());
            Convertir_a_lista(letras, res, respuesta);
        }
    }
}
