package PracticaRecursividad.Exercise_60;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class prueba {
    @Test
    public void Test_separarPalabra(){
        Siames obj=new Siames();
        String word="hola";
        int mitad=word.length()/2;
        assertEquals(2, mitad);
        assertEquals("ho", obj.separarPalabra(word, 0,mitad));
        assertEquals(1,mitad-1);
        assertEquals("la", obj.separarPalabra(word,mitad, word.length()));
    }
    @Test
    public void Test_isSiames(){
        Siames obj=new Siames();
        assertEquals(true, obj.isSiames(123123));
        assertEquals(false, obj.isSiames(123124));
    }
}
