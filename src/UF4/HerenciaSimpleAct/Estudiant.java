package UF4.HerenciaSimpleAct;

public class Estudiant extends Persona {
    private int curs;
    private String assignatures;
    private String escola;
    private int notes;

    public Estudiant() {
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }
}
