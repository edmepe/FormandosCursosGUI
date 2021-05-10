import java.io.Serializable;

public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nomeCurso;
    private int horasCurso;
    private int idCurso;

    public Cursos(String nomeCurso, int horasCurso, int idCurso) {
        this.nomeCurso = nomeCurso;
        this.horasCurso = horasCurso;
        this.idCurso = idCurso;
    }

    Cursos () {
        
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getHorasCurso() {
        return horasCurso;
    }

    public void setHorasCurso(int horasCurso) {
        this.horasCurso = horasCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "Cursos{" + "nomeCurso=" + nomeCurso + ", horasCurso=" + horasCurso + ", idCurso=" + idCurso + '}';
    }

}
