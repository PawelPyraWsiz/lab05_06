package lab06;

public class Figura {
    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    public Figura(){
        punkt = new Punkt(0,0);
    }
    Figura(String kolor){
        this.kolor=kolor;
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    public String getKolor(){
        return kolor;
    }
    public String opis(){
        return "Klasa Figura. Kolor obiektu: "+kolor;
    }
}