package lab05;

public class Gatunek {
    String nazwaRodzaj, nazwaGatunkowa, opis;
    int liczbaChromosomow, podLiczbaChromosomow;

    public Gatunek(String nazwaRodzaj, String nazwaGatunkowa, int liczbaChromosomow, int podLiczbaChromosomow, String opis) {
        this.nazwaRodzaj = nazwaRodzaj;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.liczbaChromosomow = liczbaChromosomow;
        this.podLiczbaChromosomow = podLiczbaChromosomow;
        this.opis = opis;
    }
    public String pelnaNazwa() {
        return nazwaRodzaj + " " + nazwaGatunkowa;
    }
    public int getLiczbaChromosomow() {
        return liczbaChromosomow;
    }
    public void piszInfo() {
        System.out.println("Nazwa rodzaju: " + nazwaRodzaj + " nazwa gatunku " + nazwaGatunkowa + " liczba chromosomów 2n: " + liczbaChromosomow + " podstawowa liczba chromosomów: " + podLiczbaChromosomow + " opis: " + opis);
    }
    public Gatunek getClone() {
        return new Gatunek(nazwaRodzaj, nazwaGatunkowa, liczbaChromosomow, podLiczbaChromosomow, opis);
    }
}
