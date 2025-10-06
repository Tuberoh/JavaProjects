import java.util.Scanner;

public class Esercizio_29Settembre{

    public static void main(String[] args) {
        int numero = 0;
        int contpos=0, contneg=0, contnull=0, n=0;
        Scanner lettura = new Scanner(System.in);

        do{

            System.out.println("Quanti numeri intendi inserire?");
            numero = lettura.nextInt();

        }while(numero<=0);

        for(int i=0; i<numero; i++){

            if(i!=numero-1){

                n = lettura.nextInt();

            }
            else{

                do{

                    System.out.println("Inserire numero negativo per concludere la serie");
                    n = lettura.nextInt();

                }while(n>0);

            }

            if(n>0){

                contpos++;

            }
            
            if(n<0){

                contneg++;

            }

            if(n==0){

                contnull++;

            }

        }

        System.out.println("Numeri positivi: " + contpos);
        System.out.println("Numeri negativi: " + contneg);
        System.out.println("Numeri nulli: " + contnull);

    }
    
}


