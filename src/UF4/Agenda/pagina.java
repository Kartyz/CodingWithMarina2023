package UF4.Agenda;

public class pagina {
     int dia;
     int mes;
    public pagina(){}
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void afegirCita(cita c){}
    public void borrarCita(cita c){}
    public cita cercarCita(String titol){
        cita c = new cita();
        return c;
    }
}
