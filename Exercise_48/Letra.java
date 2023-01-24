package PracticaRecursividad.Exercise_48;

public class Letra {
    private int ocurrencia;
    private char letra;
    public Letra(char letra){
        this.letra=letra;
        ocurrencia=1;
    }
    public char getletra(){
        return letra;
    }
    public void AumentarOcurrencia(){
        ocurrencia++;
    }
    public int getOcurrencias(){
        return ocurrencia;
    }
}
