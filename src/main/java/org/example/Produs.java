package org.example;

public class Produs {
    private String numeProdus;
    private double pretProdus;
    private int cantitate;

    public Produs(String numeProdus, double pretProdus, int cantitate) {
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
        this.cantitate = cantitate;
    }

    // Metoda de afisare a  produselor din categoria rechizite
    public void afiseazaDateProdus() {
        System.out.println("Nume: "+this.numeProdus+ " | Pret: "+ this.pretProdus+" lei"+ " | Cantitate: "+this.cantitate+" bucati");
    }

    // Metoda de afisare a  produselor din categoria manuale
    public void afiseazaDateProdusManuale() {
        System.out.print("Nume: "+this.numeProdus+ " | Pret: "+ this.pretProdus+" lei"+ " | Cantitate: "+this.cantitate+" bucati");
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public double getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(double pretProdus) {
        this.pretProdus = pretProdus;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {this.cantitate = cantitate;}
}
