public class Livro {
    String nome;
    String descricao;
    double valor;
    int anoDePublicacao;
    Autor autor;

    public Livro() {
        System.out.println("conatrutor do livro chamado");
    }

    void mostrarDetalhes(){
        String mensagem = "Detalhes do Livro: ";
        String separadorMensagem = "-----";
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

    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3){
            System.out.println("Desconto não pode ser maior que 30%");
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
}
