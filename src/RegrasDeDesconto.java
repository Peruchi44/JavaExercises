public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new MiniLivro(autor);
        livro.setValor(39.90);

        if (!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: "
                    + livro.getValor());
        }
    }
}