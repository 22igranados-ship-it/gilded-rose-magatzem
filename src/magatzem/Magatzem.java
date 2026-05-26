package magatzem;

public class Magatzem {
    Article[] articles;

    public Magatzem(Article[] articles) {
        this.articles = articles;
    }

    private ActualitzadorArticle obtenirActualitzador(Article article) {
        switch (article.nom) {
            case NomArticle.FORMATGE_GIDURAT:
                return new ActualitzadorFormatgeGidurat();
            case NomArticle.MARTELL_DE_THOR:
                return new ActualitzadorMartell();
            case NomArticle.ENTRADES_CONCERT:
                return new ActualitzadorEntrades();
            default:
                return new ActualitzadorNormal();
        }
    }

    public void actualitzarEstat() {
        for (Article article : articles) {
            obtenirActualitzador(article).actualitzar(article);
        }
    }
}