package CasoIntegrador;

public class Retweet extends Tweet{
    private Tweet tweetOriginal;

    public Retweet(String mensaje, UserAccount autor, Tweet tweetOriginal) {
        super(mensaje, autor);
        this.tweetOriginal = tweetOriginal;
    }

    public Tweet getTweetOriginal() {
        return tweetOriginal;
    }

    public void setTweetOriginal(Tweet tweetOriginal) {
        this.tweetOriginal = tweetOriginal;
    }

    @Override
    public String toString() {
        return "Retweet: " + mensaje + " (Original: " + tweetOriginal.toString() + ")";
    }
}
