
import java.io.Serializable;

public class Disciplinas implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nomeDisciplina;
    private int horasDisciplina;
    private int idDisciplina;

    public Disciplinas(String nomeDisciplina, int horasDisciplina, int idDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDisciplina = horasDisciplina;
        this.idDisciplina = idDisciplina;
    }

    Disciplinas() {
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getHorasDisciplina() {
        return horasDisciplina;
    }

    public void setHorasDisciplina(int horasDisciplina) {
        this.horasDisciplina = horasDisciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "nomeDisciplina=" + nomeDisciplina + ", horasDisciplina=" + horasDisciplina + ", idDisciplina=" + idDisciplina + '}';
    }
}
