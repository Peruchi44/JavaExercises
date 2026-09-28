import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner filme = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito ");
        String nome = filme.nextLine();

        System.out.println("Digite o ano em de lançamento do filme ");
        int ano = filme.nextInt();
        filme.nextLine();

        System.out.println("Qual é o gênero do filme? ");
        String g = filme.nextLine();

        System.out.println("Seu filme favorito é: " + nome + " O filme é de: " + ano + " O gênero do filme é: " + g);
        filme.close();
    }

}
