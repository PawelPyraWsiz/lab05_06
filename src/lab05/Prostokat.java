package lab05;

public class Prostokat {
    int dlugosc, szerokosc;
    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
    public int pole() {
        return dlugosc * szerokosc;
    }
    public int obw() {
        return (dlugosc + szerokosc)*2;
    }
    public double przekatna() {
        return Math.sqrt((dlugosc * dlugosc) + (szerokosc * szerokosc));
    }
}
