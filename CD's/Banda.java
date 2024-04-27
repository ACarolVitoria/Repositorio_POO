import java.util.ArrayList;
import java.util.List;

public class Banda extends Artista {
    private List<String> membros;

    public Banda() {
        membros = new ArrayList<>();
    }

    public List<String> getMembros() {
        return membros;
    }

    public void adicionarMembro(String membro) {
        membros.add(membro);
    }

    public void removerMembro(String membro) {
        membros.remove(membro);
    }

    
}
