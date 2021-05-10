
import java.io.Serializable;

public class Formando implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nomeFormando;
    private String pais;
    private int ano;
    private int altura;
    private int idFormando;

    public Formando(String nomeFormando, String pais, int ano, int altura, int idFormando) {
        this.nomeFormando = nomeFormando;
        this.pais = pais;
        this.ano = ano;
        this.altura = altura;
        this.idFormando = idFormando;
    }

    Formando() {
    }

    public String getNomeFormando() {
        return nomeFormando;
    }

    public void setNomeFormando(String nomeFormando) {
        this.nomeFormando = nomeFormando;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    @Override
    public String toString() {
        return "Formando{" + "nomeFormando=" + nomeFormando + ", pais=" + pais + ", ano=" + ano + ", altura=" + altura + ", idFormando=" + idFormando + '}';
    }

   
    
}
