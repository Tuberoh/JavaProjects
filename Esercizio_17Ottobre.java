import java.util.Scanner;

//Incompleto

public class Esercizio_17Ottobre {

    public static void main(String[] args){

        String soluzione = "3471";
        String risposta = null;
        int conta=0;

        Scanner lettura = new Scanner(System.in);


        for(int i=0; i<5; i++){

            do{
            
                System.out.println("Inserisci risposta numerica.");
                risposta = lettura.nextLine();

            }while(risposta.length()>4 || risposta.length()<4 );

            if(risposta.equalsIgnoreCase(soluzione)){

                System.out.println("Risposta esatta. Complimenti");
                i=soluzione.length();

            }
            else{

                for(int h=0; h<soluzione.length(); h++){

                    for(int j=0; j<soluzione.length(); j++){

                        if(risposta.charAt(j) == soluzione.charAt(h)){

                            System.out.println("Complimenti, il " + risposta.charAt(j) + " e' presente alla posizione " + (h+1));
                            
                            

                        }

                    }

                }


            }

            if(conta==soluzione.length()){

                System.out.println("Complimenti, hai indovinato con la combinazione di più risposte");
                i=soluzione.length();

            }

        }
        if(conta<soluzione.length()){

            System.out.println("Mi dispiace, hai perso .-.");

        }

    }

 
}
