package PracticaRecursividad.Exercise_48;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import EstructurasLineales.ListSE;
import EstructurasLineales.Pila;
import Exercise_15_CuantosDias.main;

public class Prueba {
    @Test
    public void Test_EncontrarPatrones(){
        main48 obj =new main48();
        Pila<Letra> letras=new Pila<Letra>();
        obj.Convertir_a_Pila("aaabbbbabcbbb", letras);
        ListSE<Integer> res=new ListSE<Integer>();
        obj.Convertir_a_lista(letras, "abc", 0, res, 0);
        assertEquals("[3]",res.toString());
        assertEquals(3,obj.MayorPatron("aaabbbbabcbbb", "abc"));
    }
    @Test
    public void Test_EncontrarPatrones2(){
        main48 obj =new main48();
        Pila<Letra> letras=new Pila<Letra>();
        obj.Convertir_a_Pila("aaabbbbccabcccabcbcabcbbbaaabbb", letras);
        ListSE<Integer> res=new ListSE<Integer>();
        obj.Convertir_a_lista(letras, "abc", 0, res, 0);
        assertEquals("[3]",res.toString());
        assertEquals(9,obj.MayorPatron("aaabbbbccabcccabcbcabcbbbaaabbb", "abc"));
    }
    @Test
    public void Test_EncontrarPatrones3(){
        main48 obj =new main48();
        Pila<Letra> letras=new Pila<Letra>();
        obj.Convertir_a_Pila("aaabbbbccabcccabcbcabcbbbaaabbb", letras);

        assertEquals(3,letras.verDato().getOcurrencias());
        assertEquals('b',letras.pop().getletra());
        
        assertEquals(3,letras.verDato().getOcurrencias());
        assertEquals('a',letras.pop().getletra());

        assertEquals(3,letras.verDato().getOcurrencias());
        assertEquals('b',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('c',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('b',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('a',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('c',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('b',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('c',letras.pop().getletra());

        assertEquals(1,letras.verDato().getOcurrencias());
        assertEquals('b',letras.pop().getletra());

        
        ListSE<Integer> res=new ListSE<Integer>();
        obj.Convertir_a_lista(letras, "abc", 0, res, 0);
        assertEquals("[3]",res.toString());
        assertEquals(9,obj.MayorPatron("aaabbbbccabcccabcbcabcbbbaaabbb", "abc"));
    }
}
