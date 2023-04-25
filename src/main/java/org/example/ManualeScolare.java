package org.example;

public class ManualeScolare extends Produs {

    // Manualele au editura si clasa
    private String editura;
    private int clasa;

    public ManualeScolare(String numeProdus, double pretProdus,int cantitate, String editura, int clasa) {
        super(numeProdus,pretProdus, cantitate);
        this.editura=editura;
        this.clasa=clasa;
    }

    public void afiseazaDateManuale() {
        afiseazaDateProdusManuale();
        System.out.println(" | Editura: "+this.editura+ " | Clasa: "+this.clasa);

    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }
}

