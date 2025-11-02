//Scrivere una classe cane (nome, eta, colore, razza), creare un vettore di oggetti e determinare quanti cani sono neri, sono di razza
// "Labrador" e il più vecchio, ricerca cane per nome e stampa i dati

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lettura = new Scanner(System.in);
        Scanner let = new Scanner(System.in);
        Cane[] lista;
        int dim=0, eta=0, posmax=0, contalb=0, contanero=0;
        String nome, razza, colore, ricerca, risposta;

        do{

            System.out.println("Quanti oggetti intendi inserire?");
            dim = lettura.nextInt();

        }while(dim<=0);

        lista = new Cane[dim];

        for(int i=0; i<dim; i++){

            System.out.println("Inserire nome del cane: ");
            nome = let.nextLine();
            System.out.println("Inserire razza del cane: ");
            razza = let.nextLine();
            System.out.println("Inserire colore del cane: ");
            colore = let.nextLine();
            System.out.println("Inserire eta' del cane: ");
            eta = lettura.nextInt();

            lista[i]= new Cane(nome, razza, colore, eta);

            if(lista[i].getRazza().equalsIgnoreCase("labrador")){

                contalb++;

            }
            if(lista[i].getColore().equalsIgnoreCase("nero")){

                contanero++;

            }

            System.out.println("Vuoi pulire il tuo cane?");
            risposta = let.nextLine();

            if(risposta.equalsIgnoreCase("si")){

                System.out.println(lista[i].Pulizia());

            }
            else{

                System.out.println("Grazie per aver usufruito del nostro servizio");

            }

        }
        for(int i=1; i<dim; i++){

            if(lista[posmax].getEta()<lista[i].getEta()){

                posmax=i;

            }

        }
        System.out.println("Inserire il nome del cane da ricercare: ");
        ricerca = let.nextLine();


        Cane trovato = Ottieni_Cane(lista, dim, ricerca);
        if(trovato != null){

            System.out.println("Il cane cercato e' " + trovato.getNome() + " di eta' " + trovato.getEta() + " di razza " + trovato.getRazza());

        }
        else{

            System.out.println("Nessun cane trovato con quel nome");

        }
        System.out.println("Il numero di labrador e': " + contalb);
        System.out.println("Il numero di cani neri e': " + contanero);
        System.out.println("Il cane piu' vecchio e' " + lista[posmax].getNome() + " di eta' " + lista[posmax].getEta());







    }
    public static Cane Ottieni_Cane(Cane lista[], int dim, String ricerca){

        for(int i=0; i<dim; i++){

            if(lista[i].getNome().equalsIgnoreCase(ricerca)){

                return lista[i];

            }


        }
        return null;

    }


}