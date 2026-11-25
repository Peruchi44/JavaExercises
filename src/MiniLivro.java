public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicandoDescontoDe(double porcentagem) {
        return false;
    }
}