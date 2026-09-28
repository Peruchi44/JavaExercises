public class Livro {
    String nome;
    String descricao;
    double valor;
    int anoDePublicacao;
    Autor autor;


    void mostrarDetalhes(){
        String mensagem = "Detalhes do Livro: ";
        String separadorMensagem = "------------";
        System.out.println(mensagem);
        System.out.println(separadorMensagem);
        System.out.println("Nome: " + nome );
        System.out.println("Descrição: " + descricao);
        System.out.println("Ano de lançamento: "  + anoDePublicacao );
        System.out.println(separadorMensagem);

        if (this.temAutor()){
            autor.mostrarDetalhesAutor();
        }
    }

    boolean temAutor(){
        return this.autor != null;
    }

    public void aplicaDescontoDe(double porcentagem){
        valor -= this.valor * porcentagem;
    }
}
