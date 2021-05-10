import java.io.Serializable;

public class InscricaoFormando implements Serializable {
    
private static final long serialVersionUID = 1L;
private int idFormando;
private int idCurso;

    public InscricaoFormando(int idFormando, int idCurso) {
        this.idFormando = idFormando;
        this.idCurso = idCurso;
    }

    InscricaoFormando() {
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "InscricaoFormando{" + "idFormando=" + idFormando + ", idCurso=" + idCurso + '}';
    }


}