import java.util.Scanner;

public class Esercizio_22Ottobre_secondo {

    public static void main(String[] args){

        Scanner lettura = new Scanner(System.in);
        System.out.println("Inserisci parola");
        String parola = lettura.nextLine();
        Boolean notpalidromo=false;


        for(int i=0; i<parola.length()/2 && notpalidromo != true; i++){

            if(parola.charAt(i)!=parola.charAt(parola.length()-i-1)){

                notpalidromo=true;

            }

        }
        if(notpalidromo==true){

            System.out.println("La parola non è palidroma.");

        }
        else{

            System.out.println("La parola è palidroma.");

        }


    }

    
}
