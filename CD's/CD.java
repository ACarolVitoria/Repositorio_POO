import java.util.List;

public class CD {
    private String titulo;
    private Artista artista;
    private String genero;
    private String anoLancamento;
    private List<Faixa> faixas;

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(String anoLancamento) { this.anoLancamento = anoLancamento; }
    public List<Faixa> getFaixas() { return faixas; }
    public void setFaixas(List<Faixa> faixas) { this.faixas = faixas; }
}
