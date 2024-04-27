import java.util.List;
import java.util.ArrayList;

public class Colecao {
    private List<CD> cds;

    public Colecao() {
        this.cds = new ArrayList<>();
    }

    public void adicionarCD(CD cd) {
        this.cds.add(cd);
    }

    public void removerCD(CD cd) {
        this.cds.remove(cd);
    }

    public CD buscarCD(String titulo) {
        for (CD cd : this.cds) {
            if (cd.getTitulo().equals(titulo)) {
                return cd;
            }
        }
        return null;
    }
}
