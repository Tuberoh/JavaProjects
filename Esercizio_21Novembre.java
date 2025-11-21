//Scrivere un programma che legge da tastiera una sequenza di 10 numeri reali e che stampa a video le seguenti informazioni: 
//(i) la somma di tutti i numeri della sequenza; (ii) la media aritmetica esatta dei numeri della sequenza; (iii) il numero massimo e il numero minimo della sequenza.

//Scrivere un programma che chieda quanti sono gli alunni di una classe controllando che sia un numero tra 1 e 35, richiede di inserire 
//i voti (interi) degli alunni memorizzando i dati in un vettore (controllando che i voti siano tra 3 e 10) .
//Alla fine deve visualizzare la media dei voti, le percentuali dei voti sufficienti (voto >= 6) e insufficienti. 
//Il numero N di alunni deve essere inserito da tastiera. È richiesta la validazione del numero di alunni (1 <= N <= 35) e dei voti immessi (valori interi da 1 a 10). 


import java.util.Scanner;

public class Esercizio_21Novembre {

    public static void main(String[] args){

        Scanner lettura = new Scanner(System.in);
        
        double num, max=0, min=0, sum=0;
        int dim=0, contasuf=0, containsuf=0, sumvoti=0;
        int [] voti;


        for(int i=0; i<10; i++){

            System.out.println("Inserisci un numero reale: ");
            num = lettura.nextDouble();
            
            sum+=num;

            if(i==0){

                max=num;
                min=num;

            }
            else{

                if(num>max){

                    max=num;

                }
                else if(num<min){

                    min=num;

                }

            }



        }
        
        System.out.println("La media dei numeri inseriti e': " + sum/10);
        System.out.println("Il massimo e': " + max);
        System.out.println("Il minimo e': " + min);


        //seconda parte

        do{

            System.out.println("Inserire numero alunni");
            dim = lettura.nextInt();
            if(dim<=0 || dim>35){

                System.out.println("Grandezza errata. Si prega di inserire un numero idoneo");

            }


        }while(dim<=0 || dim>35);

        voti = new int[dim];

        for(int i=0; i<dim; i++){

            do{

                System.out.println("Inserire voto:");
                voti[i] = lettura.nextInt();

                if(voti[i]<3 || voti[i]>10){

                    System.out.println("Dato errato. Si prega di inserire nuovamente");

                }

            }while(voti[i]<3 || voti[i]>10);

            sumvoti+=voti[i];

            if(voti[i]>=6){

                contasuf++;

            }
            else{

                containsuf++;

            }

        }
        
        System.out.println("La media dei voti inseriti e': " + (double) sumvoti/dim);
        System.out.println("La percentuale dei voti sufficienti e': " + (float) contasuf/dim*100.0 +" %");
        System.out.println("La percentuale dei voti insufficienti e': " + (float) containsuf/dim*100.0 + " %");



    
    }
        
}
