package UF4.Objectes;

public class triangle {
    private int costat1;
    private int costat2;
    private int costat3;
    private String color;

    public triangle( int c1, int c2, int c3, String col){
        costat1 = c1;
        costat2 = c2;
        costat3 = c3;
        color = col;
    }
    public int getCostat1(){
        return costat1;
    }
    public void setCostat1(int costat1){
        this.costat1 = costat1;
    }
    public int getCostat2(){
        return costat2;
    }
    public void setCostat2(int costat2){
        this.costat2 = costat2;
    }
    public int getCostat3(){
        return costat3;
    }
    public void setCostat3(int costat3){
        this.costat3 = costat3;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}


