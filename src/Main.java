import lab05.Gatunek;
import lab05.Budynek;
import lab05.Prostokat;
import lab06.*;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        var zad1 = new Prostokat(10, 20);
        zad1.przekatna();
        zad1.pole();

        // Zadanie 2
        var bud1 = new Budynek("A", 1999, 2);
        var bud2 = new Budynek("B", 1996, 3);
        bud1.getNazwa();
        bud1.getLiczbaPieter();
        bud1.getRokBudowy();
        bud1.getWiekBudynku();
        bud2.piszInfo();

        // Zadanie 3
        var gat = new Gatunek("rodzaj", "gatunek", 12, 24, "Prosty opis");
        gat.pelnaNazwa();
        gat.piszInfo();
        gat.getLiczbaChromosomow();

        // LAB 06
        // Zadanie 1
        var pkt1 = new Punkt();
        var pkt2 = new Punkt(4, 20);
        var trojkat = new Trojkat(8, 2);
        System.out.println("X = " + pkt1.getX());
        System.out.println("y = " + pkt1.getY());
        pkt1.setX(1);
        pkt1.setY(2);
        System.out.println("zmiana");
        System.out.println("X = " + pkt1.getX());
        System.out.println("y = " + pkt1.getY());
        pkt1.zeruj();
        System.out.println("zmiana");
        System.out.println("X = " + pkt1.getX());
        System.out.println("y = " + pkt1.getY());
        pkt1.opis();
        pkt1.przesun(5, 1);
        pkt1.opis();

        var fig = new Figura();
        System.out.println(fig.opis());

        // Zadanie 2
        var samochod = new Samochod("Opel", "Astra", "Hetchback", "Biały", 2004, 350000);
        var samochodOsobowy = new SamochodOsobowy("Volvo", "s40", "Sedan", "Czarny", 2008, 120000, 1800, 2456, 5);
        samochod.piszInfo();
        samochodOsobowy.piszInfo();

        // Zadanie 3
        Ksiegarnia ksiegarnia = new Ksiegarnia("Empik");
        Klient klient = new Klient("Wojciech", "Szczęsny");
        Ksiazka ksiazka = new Powiesc("W pustyni i w puszczy", "Henryk Sienkiewicz", "Przygoda");
        Ksiazka ksiazka2 = new Podrecznik("Czyty Kod", "Jordan Addams", "Programowanie");

        ksiegarnia.addClient(klient);
        ksiegarnia.addBook(ksiazka);
        ksiegarnia.addBook(ksiazka2);
    }
}