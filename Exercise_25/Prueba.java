package Exercise_25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import EstructurasLineales.Pila;

public class Prueba {
    @Test
    public void EliminarRepeticiones(){
        Exercise25 obj=new Exercise25();
        Pila<Character> letras=new Pila<Character>();
        obj.EliminarRepeticiones("aabbc", 0, letras);
        assertEquals('c', letras.pop());
        assertEquals('b', letras.pop());
        assertEquals('a', letras.pop());
    }
    @Test
    public void Invertir(){
        Exercise25 obj=new Exercise25();
        Pila<Character> letras=new Pila<Character>();
        obj.EliminarRepeticiones("aabbc", 0, letras);
        assertEquals("cba",obj.Invertir(letras));
    }
}
