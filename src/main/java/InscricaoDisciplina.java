import java.io.Serializable;

public class InscricaoDisciplina implements Serializable {
    
private static final long serialVersionUID = 1L;
private int idDisciplina;
private int idCurso;

    public InscricaoDisciplina(int idDisciplina, int idCurso) {
        this.idDisciplina = idDisciplina;
        this.idCurso = idCurso;
    }

    InscricaoDisciplina() {
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "InscricaoDisciplina{" + "idDisciplina=" + idDisciplina + ", idCurso=" + idCurso + '}';
    }


}
