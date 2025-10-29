//Scrittura di un programma che prende i nomi di 5 città, stampa la lunghezza di ognuno e indica quella con più caratteri

import java.util.Scanner;

public class Esercizio_24Ottobre {

    public static void Main(String[] args){

        String [] citta = new String[5];
        Scanner lettura = new Scanner(System.in);
        int posmax=0;

        for(int i=0; i<citta.length; i++){

            citta[i]=lettura.nextLine();
            System.out.println("La città contiene: " + citta[i].length() + " caratteri.");

        }
        for(int i=1; i<citta.length; i++){

            if(citta[posmax].length()<citta[i].length()){

                posmax=i;

            }

        }
        System.out.println("La città con più caratteri e' " + citta[posmax] + " con: " + citta[posmax].length());

    }

    
}
