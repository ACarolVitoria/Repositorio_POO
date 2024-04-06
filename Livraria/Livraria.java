package livraria;

import java.util.ArrayList;

public class Livraria {
    
    public ArrayList<Livro> Livros;

    public Livraria(){
        this.Livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro){
        this.Livros.add(livro);
    }

    public String listarLivros(){
        String listaLivros = "";
        for (Livro l : this.Livros){
            listaLivros += l.id + "  -  " + l.titulo + "\n";
        }
        return listaLivros;
    }
}
