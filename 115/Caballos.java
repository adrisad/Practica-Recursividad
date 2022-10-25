import java.util.*;
public class Caballos {
    private boolean [][]visitado;
   public Caballos(){
       visitado=new boolean[8][8];
       mostrar();
   }
   public void mostrar(){
       mostrar(0,0);
   }
   private void mostrar(int i, int j){
       if (i<8){
           if (j<8){
               System.out.print(visitado[i][j]+"  ");
               mostrar(i,j+1);
            }
            else{
                System.out.println();
                mostrar(i+1,0);
            }
        }
     }
   
   private void mostrarLista(ArrayList <Coordenada> res){
       System.out.println();
       System.out.print("{");
       mostrarLista(res,0);
       System.out.print("}");
   }
   private void mostrarLista(ArrayList <Coordenada> res, int pos){
       if (pos<res.size()){
         Coordenada coor=res.get(pos);
         coor.mostrar();
         System.out.print(" , ");
         mostrarLista(res,pos+1);
       }
   }
   private boolean validar(int x, int y){
        return (x>=0 && x<8 && y>=0 && y<8);
   }
   public ArrayList<Coordenada> getPosiciones(int x, int y){
       ArrayList <Coordenada> res=new ArrayList<Coordenada>();
       backtracking(x,y,res);
       System.out.println("la cantidad de posiciones visitadas: "+res.size());
       mostrarLista(res);
       return res;
   }
   public void backtracking(int x, int y,ArrayList <Coordenada> res){
       if (validar(x,y)){
           if(!visitado[x][y]){
               visitado[x][y]=true;
               res.add(new Coordenada(x,y));
               backtracking(x-2,y+1,res);//1. ir 2 pos arriba y una a la derecha
               backtracking(x-2,y-1,res);//2. ir 2 pos arriba y una a la izq
               backtracking(x-1,y+2,res);//3. ir 2 a la derecha y una arriba
               backtracking(x+1,y+2,res);//4. ir 2 a la derecha y uno abajo
               backtracking(x+2,y+1,res);//5. ir 2 abajo y uno a la derecha
               backtracking(x+2,y-1,res);//6. ir 2 abajo y uno a la izquierda
               backtracking(x-1,y-2,res);//7. ir 2 a la izq uno arriba
               backtracking(x+1,y-2,res);//8. ir 2 a la izq uno abajo
           }
       }
   }
   public static void main(String[] args) {
        Caballos caballo=new Caballos();
        caballo.getPosiciones(0, 0);
   }
}