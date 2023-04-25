package org.example;

public class RechiziteScolare extends Produs {

    // Rechizitele au ficare cate un cod produs.
    private int codProdus;

    public RechiziteScolare (String numeProdus,double pretProdus,int cantitate, int codProdus) {
        super(numeProdus,pretProdus,cantitate);
        this.codProdus=codProdus;
    }


    public int getCodProdus() {
        return codProdus;
    }

    public void setCodProdus(int codProdus) {
        this.codProdus = codProdus;
    }
}
