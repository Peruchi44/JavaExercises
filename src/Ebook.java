public class Ebook extends Livro {

//    private String nome;
//    private String descricao;
//    private double valor;
//    private Autor autor;
    private String waterMark;


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
        return super.aplicaDescontoDe(porcentagem);
    }
}
