import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista();
        artista.setNome("Luxúria");
        artista.setAnoEstreia("2006");
        artista.setGeneroMusical("Rock Alternativo");

        Banda banda = new Banda();
        banda.setNome("Luxúria");
        banda.setAnoEstreia("2006");
        banda.setGeneroMusical("Rock");
        banda.adicionarMembro("Guilherme");
        banda.adicionarMembro("Dragão");
        banda.adicionarMembro("Beto");
        banda.adicionarMembro("Meg");

        Faixa faixa1 = new Faixa();
        faixa1.setTitulo("Ódio");
        faixa1.setDuracao("4:09");
        faixa1.setNumeroFaixa(1);

        Faixa faixa2 = new Faixa();
        faixa2.setTitulo("Imperecível");
        faixa2.setDuracao("3:26");
        faixa2.setNumeroFaixa(2);

        Faixa faixa3 = new Faixa();
        faixa3.setTitulo("Frankenstein do Subúrbio");
        faixa3.setDuracao("3:39");
        faixa3.setNumeroFaixa(3);

        Faixa faixa4 = new Faixa();
        faixa4.setTitulo("Cinderela Compulsiva");
        faixa4.setDuracao("3:14");
        faixa4.setNumeroFaixa(4);

        Faixa faixa5 = new Faixa();
        faixa5.setTitulo("Pés no Chão");
        faixa5.setDuracao("3:24");
        faixa5.setNumeroFaixa(5);

        Faixa faixa6 = new Faixa();
        faixa6.setTitulo("Suja e Só");
        faixa6.setDuracao("4:59");
        faixa6.setNumeroFaixa(6);

        Faixa faixa7 = new Faixa();
        faixa7.setTitulo("Lama");
        faixa7.setDuracao("4:44");
        faixa7.setNumeroFaixa(7);

        Faixa faixa8 = new Faixa();
        faixa8.setTitulo("Dura Feito Aço");
        faixa8.setDuracao("3:36");
        faixa8.setNumeroFaixa(8);

        Faixa faixa9 = new Faixa();
        faixa9.setTitulo("Contrariada");
        faixa9.setDuracao("4:20");
        faixa9.setNumeroFaixa(9);

        Faixa faixa10 = new Faixa();
        faixa10.setTitulo("Fechar Os Olhos");
        faixa10.setDuracao("4:27");
        faixa10.setNumeroFaixa(10);

        Faixa faixa11 = new Faixa();
        faixa11.setTitulo("Artifício Mágico");
        faixa11.setDuracao("3:10");
        faixa11.setNumeroFaixa(11);

        CD cd = new CD();
        cd.setTitulo("Luxúria");
        cd.setArtista(artista);
        cd.setGenero("Rock Alternativo");
        cd.setAnoLancamento("2006");
        cd.setFaixas(Arrays.asList(faixa1, faixa2, faixa3, faixa4, faixa5, faixa6, faixa7, faixa8, faixa9, faixa10, faixa11));

        Colecao colecao = new Colecao();
        colecao.adicionarCD(cd);

        System.out.println("CD '" + cd.getTitulo() + "' do artista '" + artista.getNome() + "' adicionado na colecao.");
    }
}
