public class RegistroDeVendas {
    public static void main(String[] args) {

    Autor autor = new Autor();
    autor.setNome("Mauricio Aniche");
    autor.setEmail("mauricio.aniche@gmail.com");
    autor.setCpf("123.456.789-00");

    Livro livro = new LivroFisico(autor);
    livro.setNome("Test-Driven Development");
    livro.setDescricao("Um livro sobre desenvolvimento orientado a testes");
    livro.setValor(75.00);

    livro.mostrarDetalhes();

    Autor autor2 = new Autor();
    autor2.setNome("Fernando Peruchi");
    autor2.setEmail("fernandoperuchi23@gmail.com");

    Livro livro2 = new LivroFisico(autor2);
    livro2.setNome("Getting better");
    livro2.setDescricao("Livro feito para quem se sente perdido");
    livro2.setValor(120);

    livro2.mostrarDetalhes();

}
}

