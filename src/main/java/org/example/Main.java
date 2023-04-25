package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("        Buna ziua, bine ati venit, cu ce va putem ajuta?");
        System.out.println("    Aveti mai jos lista cu produsele noastre, pretul si cantitatea disponibila:");
        System.out.println("");
        System.out.println(" * RECHIZITE: ");

        //Introducem produsele
        RechiziteScolare rechizite1= new RechiziteScolare("Creion",1.5,60,100);
        RechiziteScolare rechizite2= new RechiziteScolare("Guma de sters",1,60,101);
        RechiziteScolare rechizite3= new RechiziteScolare("Carioci set ",10,72,102);
        RechiziteScolare rechizite4= new RechiziteScolare("Stilou",21,45,103);
        RechiziteScolare rechizite5= new RechiziteScolare("Caiet dictando",5,60,104);

        // Afisam datele produselor folosint detoda de afisare.
        rechizite1.afiseazaDateProdus();rechizite2.afiseazaDateProdus();rechizite3.afiseazaDateProdus();rechizite4.afiseazaDateProdus();rechizite5.afiseazaDateProdus();
        System.out.println(" ");
        System.out.println(" * MANUALE: ");

        ManualeScolare manual1= new ManualeScolare("Matematica III",35,52,"Art",3);
        ManualeScolare manual2= new ManualeScolare("Matematica V",20,50,"Art",5);
        ManualeScolare manual3= new ManualeScolare("Istorie",25,37,"Roua",7);
        ManualeScolare manual4= new ManualeScolare("Geografie",27,36,"Star",5);
        ManualeScolare manual5= new ManualeScolare("Religie",25,21,"Art",4);

        // Afisam datele produselor folosint detoda de afisare.
        manual1.afiseazaDateManuale(); manual2.afiseazaDateManuale(); manual3.afiseazaDateManuale(); manual4.afiseazaDateManuale(); manual5.afiseazaDateManuale();
        System.out.println(" ");
        System.out.println(" ATENTIE! -Cand doriti sa incheiati cumparaturile introduceti  \"stop\"!");
        System.out.println(" ");

        Scanner scanner= new Scanner(System.in);
        String nume2;

        do {
            System.out.println("Introduceti numele produsului dorit: ");
            nume2 = scanner.nextLine();

            if (nume2.equalsIgnoreCase("Creion")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ rechizite1.getPretProdus()+" lei");
                System.out.println("TOTAL: " + rechizite1.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Guma de sters")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ rechizite2.getPretProdus()+" lei");
                System.out.println("TOTAL: " + rechizite2.getPretProdus() * cantitate + " lei");

            }else if (nume2.equalsIgnoreCase("Carioci")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ rechizite3.getPretProdus()+" lei");
                System.out.println("TOTAL: " + rechizite3.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Stilou")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ rechizite4.getPretProdus()+" lei");
                System.out.println("TOTAL: " + rechizite4.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Caiet dictando")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ rechizite5.getPretProdus()+" lei");
                System.out.println("TOTAL: " + rechizite5.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Matematica III")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ manual1.getPretProdus()+" lei");
                System.out.println("TOTAL: " + manual1.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Matematica V")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ manual2.getPretProdus()+" lei");
                System.out.println("TOTAL: " + manual2.getPretProdus() * cantitate + " lei");;

            } else if (nume2.equalsIgnoreCase("Istorie")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ manual3.getPretProdus()+" lei");
                System.out.println("TOTAL: " + manual3.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Geografie")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ manual4.getPretProdus()+" lei");
                System.out.println("TOTAL: " + manual4.getPretProdus() * cantitate + " lei");

            } else if (nume2.equalsIgnoreCase("Religie")) {
                System.out.println("Introduceti cantitatea: ");
                int cantitate= scanner.nextInt();
                System.out.println(cantitate+" x bucati- "+ manual5.getPretProdus()+" lei");
                System.out.println("TOTAL: " + manual5.getPretProdus() * cantitate + " lei");

            } else {
                System.out.println("Ați incheiat cumpărăturile, vă mulțumim! (^_^)");
                System.out.println("Să aveți o zi bună!");
            }
            System.out.println(" ");
        }while (!scanner.nextLine().equals("stop"));
    }
}
