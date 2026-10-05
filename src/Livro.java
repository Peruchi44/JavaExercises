public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private Autor autor;
    private boolean impresso;

    // demais métodos omitidos

    public Livro() {}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Autor: " + autor.getNome());
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        } else if (!this.impresso && porcentagem > 0.15) {
            return false;
        }

        this.valor -= this.valor * porcentagem; // apenas um '-' antes do '='
        return true;
    }
}
