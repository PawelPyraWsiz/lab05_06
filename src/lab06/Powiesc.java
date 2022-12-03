package lab06;

public class Powiesc extends Ksiazka{
    String motyw;
    public Powiesc(String tytul, String autor, String motyw) {
        super(tytul, autor);
        this.motyw = motyw;
    }
}
