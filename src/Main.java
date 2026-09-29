
public class Main {
    public static void main(String[] args) {
//
//        Carro carro = new Carro();
//        carro.anoDoCarro = 2024;
//        carro.cor = "Azul";
//        carro.nome = "Civic";
//        carro.modelo = "Turbo";
//
//        System.out.println("Meu carro é um: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.anoDoCarro + " Cor: " + carro.cor);
//        ------------------------------------------
        Autor autor = new Autor();
        autor.nome = " James Clear";
        autor.email = "1book@atomichabits.com";
        autor.cpf = "123.456.789-00";

        Livro livro  = new Livro();
        livro.nome = "Hábitos Atômicos.";
        livro.anoDePublicacao = 2021;
        livro.descricao = "Livro sobre desenvolvimento pessoal.";
        livro.setValor(65.00);
        livro.aplicaDescontoDe(0.1);
        System.out.println("Valor com desconto: " + livro.getValor());
        livro.autor = autor;

        livro.mostrarDetalhes();
//    --------------------------------------------------
        Autor autor2 = new Autor();
        autor2.nome = " Paulo Silveira";
        autor2.email = "paulo.silveira@caelum.com.br";
        autor2.cpf = "123.456.789.10";

        Livro livro2 = new Livro();
        livro2.nome = "Reponsabilidade Extrema.";
        livro2.anoDePublicacao = 2022;
        livro2.descricao = "Livro sobre tomar responsabilidade sobre suas ações.";
        livro2.setValor(85.00);
        livro2.aplicaDescontoDe(0.1);
        System.out.println("Valor com desconto: " + livro2.getValor());
        livro2.autor = autor2;

        livro2.mostrarDetalhes();
//    -------------------------------------------
        Autor autor3 = new Autor();
        autor3.nome = " Charles Duhigg";
        autor3.email = " charlesduhigg@gmail.com ";
        autor3.cpf = "123.456.789.11";

        Livro livro3 = new Livro();
        livro3.nome = "O poder do hábito.";
        livro3.anoDePublicacao = 2012;
        livro3.descricao = "Livro sobre hábitos e como eles influenciam nossas vidas.";
        livro3.setValor(72.90);
        System.out.println("Valor atual: " + livro3.getValor());
        livro3.aplicaDescontoDe(0.1);
        System.out.println("Valor com desconto: " + livro3.getValor());
        livro3.autor = autor3;

        livro3.mostrarDetalhes();
    }
}