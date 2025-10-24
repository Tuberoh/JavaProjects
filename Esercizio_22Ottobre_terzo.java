import java.util.Scanner;

public class Esercizio_22Ottobre_terzo {

    public static void main(String[] args){
        
        Scanner lettura = new Scanner(System.in);
        System.out.println("Inserisci frase");
        String frase = lettura.nextLine();
        String part=null;
        int h=0;
        System.out.println("Frase divisa:");

        for(int i=0; i<frase.length(); i++){


            if(frase.charAt(i)==' '){

                part= frase.substring(h, i);
                System.out.println(part);
                h=i+1;

            }


        }
        part = frase.substring(h);
        System.out.println(part);


    }
    
}

