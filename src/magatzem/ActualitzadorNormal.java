package magatzem;

public class ActualitzadorNormal implements ActualitzadorArticle {

    @Override
    public void actualitzar(Article article) {
        if (article.qualitat > 0) {
            article.qualitat--;
        }
        article.diesPerVendre--;
        if (article.diesPerVendre < 0 && article.qualitat > 0) {
            article.qualitat--;
        }
    }
}