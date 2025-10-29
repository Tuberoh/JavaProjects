/*Scrivi un programma Java che:
- Riceve in input una stringa contenente numeri interi separati da virgole (es. "12,5,8,20,3").
- Converte la stringa in un array di interi.
- Trova manualmente:
- Il massimo e il minimo valore, scorrendo l’array.
- La media aritmetica dei numeri.
- La differenza assoluta tra massimo e minimo
*/

import java.util.Scanner;

public class Esercizio_24Ottobre_terzo {

    public static void main(String[] args){

        Scanner lettura = new Scanner (System.in);
        int h=0, j=0, posmin=0, posmax=0, somma=0, differenza=0;
        float media=0;
        int [] vetnumeri;
        String serie = lettura.nextLine();
        vetnumeri = new int[serie.length()];


        for(int i=0; i<serie.length(); i++){

            if(serie.charAt(i)==','){


                vetnumeri[j]=Integer.parseInt(serie.substring(h, i));
                h=i+1;
                j++;

            }

        }
        
        vetnumeri[j] = Integer.parseInt(serie.substring(h));
        j++;

        for(int i=0; i<j; i++){

            if(vetnumeri[posmax]<vetnumeri[i]){

                posmax=i;

            }
            if(vetnumeri[posmin]>vetnumeri[i]){

                posmin=i;

            }
            somma+=vetnumeri[i];

        }
        media = (float)somma/vetnumeri.length;

        differenza= Math.abs(vetnumeri[posmin]-vetnumeri[posmax]);

    }

    
}
