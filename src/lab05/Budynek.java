package lab05;
import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rokBudowy;
    int liczbaPieter;

    public String getNazwa() {
        return nazwa;
    }
    public int getRokBudowy() {
        return rokBudowy;
    }
    public int getLiczbaPieter() {
        return liczbaPieter;
    }
    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }
    public int getWiekBudynku() {
        LocalDate date = LocalDate.of(2022, 12, 01);
        var currentYear = date.getYear();
        return (currentYear - getRokBudowy());
    }
    public void piszInfo() {
        System.out.println("Nazwa: " + getNazwa() + " Rok budowy: " + getRokBudowy() + " Liczba pieter: " + getLiczbaPieter());
    }
}
