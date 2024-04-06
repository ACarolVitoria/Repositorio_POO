package livraria;

import java.util.Scanner;

public class Sistema {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Adicionando livro");
                    int id; String titulo;
                    String nomeAutor, anoPublicado, editora;
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("Titulo: ");
                    titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    nomeAutor = sc.nextLine();
                    System.out.println("Ano: ");
                    anoPublicado = sc.nextLine();
                    System.out.println("Editora: ");
                    editora = sc.nextLine();

                    Livro l = new Livro(id, titulo, nomeAutor, anoPublicado, editora);
                    Livraria.cadastrarLivro(l);

                    break;

                case 2:
                    System.out.println("Listando livros");
                    break;

                case 3:
                    System.out.println("Detalhando livro");
                    break;

                case 4:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Comando invalido");
                    break;

            }

        }

    }

}
