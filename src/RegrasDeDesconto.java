public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livro livro4 = new Livro();
        livro4.valor = 120.00;
        System.out.println("Valor atual: " + livro4.valor);

        if (livro4.aplicaDescontoDe(0.4)) {
            System.out.println("Valor com desconto: " + livro4.valor);
        }
    }
}
