package lab06;

public class Podrecznik extends Ksiazka{
    String temat;
    public Podrecznik(String tytul, String autor, String temat) {
        super(tytul, autor);
        this.temat = temat;
    }
}
