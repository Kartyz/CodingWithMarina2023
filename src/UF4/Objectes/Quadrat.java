package UF4.Objectes;

public class Quadrat{
     private int costat;
     private String color;

     public Quadrat(int cos, String col){
        costat = cos;
        color = col;
     }
     public int getCostat(){

         return costat;
     }
     public void setCostat(int costat){

         this.costat = costat;
     }
     public String getColor(){
         return color;
     }
     public void setColor(String color){
         this.color = color;
     }
}
