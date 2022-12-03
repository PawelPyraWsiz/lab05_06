package lab06;

public class SamochodOsobowy extends Samochod{
    double waga, pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }
    public double getWaga() {
        return waga;
    }
    public void setWaga(double waga) {
        var tempwaga = waga;
        if(tempwaga < 2)
            tempwaga = 2;
        if(tempwaga > 4.5)
            tempwaga = 4.5;
        this.waga = tempwaga;
    }
    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        var tempPoj = pojemnoscSilnika;
        if(tempPoj < 0.8)
            tempPoj = 0.8;
        if(tempPoj > 3)
            tempPoj = 3;
        this.pojemnoscSilnika = tempPoj;
    }
    public int getIloscOsob() {
        return iloscOsob;
    }
    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }
    @Override
    public void piszInfo() {
        System.out.println("Marka " + getMarka() + " Model " + getModel() + " Nadwozie " + getNadwozie() + " Kolor " + getKolor() + " Rok produkcji " + getRokProdukcji() + " Przebieg " + getPrzebieg() + " Waga " + getWaga() + " Pojemnosc silnika " + getPojemnoscSilnika() + " Ilosc osob " + getIloscOsob()
        );
    }
}
