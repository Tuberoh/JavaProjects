//- Dichiara un array di 5 stringhe contenenti nomi di città.
//- Stampa solo i nomi che iniziano con una vocale.
//- Conta quante città terminano con la lettera “a” e stampa il totale.

import java.util.Scanner;

public class Esercizio_24Ottobre_secondo {

    public static void main(String[] args){

        String [] vetcitta = new String[5];
        Scanner lettura= new Scanner(System.in);
        int conta=0;

        for(int i=0; i<vetcitta.length; i++){

            vetcitta[i]= lettura.nextLine();

        }
        for(int i=0; i<vetcitta.length; i++){

            if(vetcitta[i].toLowerCase().charAt(0)=='a'){

                System.out.println(vetcitta[i]);

            }
            else if(vetcitta[i].toLowerCase().charAt(0)=='e'){

                System.out.println(vetcitta[i]);

            }
            else if(vetcitta[i].toLowerCase().charAt(0)=='o'){

                System.out.println(vetcitta[i]);

            }
            else if(vetcitta[i].toLowerCase().charAt(0)=='u'){

                System.out.println(vetcitta[i]);

            }
            if(vetcitta[i].toLowerCase().charAt(vetcitta[i].length()-1)=='a'){

                conta++;

            }


        }
        System.out.println("Nella lista vi sono " + conta + " città che terminano per a");

    }
    
}