public class Ebook extends Livro {

//    private String nome;
//    private String descricao;
//    private double valor;
//    private Autor autor;
    private String waterMark;

    @Override
    public boolean aplicandoDescontoDe(double porcentagem) {
            return false;
    }

    public Ebook(Autor autor) {
        super (autor);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        System.out.println("aplicando desconto no Ebook");
        return super.aplicaDescontoDe(porcentagem);
    }
}
