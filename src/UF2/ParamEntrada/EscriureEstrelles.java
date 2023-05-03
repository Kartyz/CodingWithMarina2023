package UF2.ParamEntrada;
public class EscriureEstrelles {
    public static void main(String[]args) {
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }
        public void inici(){
            Estrellar(4);
            Estrellar(10);
            Estrellar(20);
            Estrellar(10);
            Estrellar(20);
            Estrellar(10);
            Estrellar(20);
            Estrellar(10);
            Estrellar(20);
        }
        public void Estrellar(int es){
            for (int i = es; i > 0; i--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

