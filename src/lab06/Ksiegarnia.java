package lab06;
import java.util.ArrayList;
import java.util.List;

public class Ksiegarnia {
    String nazwa;
    List<Klient> klienci;
    List<Ksiazka> ksiazki;

    public String getNazwa() {
        return nazwa;
    }
    public Ksiegarnia(String nazwa) {
        this.nazwa = nazwa;
        this.klienci = new ArrayList<Klient>();
        this.ksiazki = new ArrayList<Ksiazka>();
    }
    public void addClient(Klient k) {
        this.klienci.add(k);
    }
    public void addBook(Ksiazka k) {
        this.ksiazki.add(k);
    }
}
