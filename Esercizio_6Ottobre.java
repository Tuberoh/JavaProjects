import java.util.Scanner;

public class Esercizio_6Ottobre {

    public static void main(String[] args){

        int b=0, conta=0, controllo=0, h=1;
        Scanner lettura = new Scanner(System.in);

        String parola = lettura.nextLine();

        for(int i=0; i<parola.length(); i++){

            if(parola.charAt(i)=='a'){

                conta++;

            }


        }

        for(int i=0; i<parola.length() && controllo!=conta; i++){

            if(conta==0){

                System.out.println("Mancanza di a nella parola.");
                i=parola.length();

            }
            System.out.println("Indice delle varie a: " + parola.indexOf('a', b));

            if(h<parola.length()){

                b=parola.indexOf('a', h);

            }
            if(b!=-1){
                
                h=parola.indexOf('a', b)+1;

                if(parola.charAt(b)=='a'){

                    controllo++;

                }

            }
            

        }

    }
    
}
