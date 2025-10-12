import java.util.Scanner;

public class Esercizio_12Ottobre {

    public static void main(String[] args) {

        int somma=0, differenza=0, moltiplicazione=0, divisione=0;

        Scanner lettura = new Scanner(System.in);

        System.out.println("Calcolatrice in Java ");
        System.out.println("Inserire operazione: ");

        String a = lettura.nextLine();
        String s = a.trim();

        if(s.indexOf("+")!=-1){

            String primap = s.substring(0, s.indexOf("+")).trim();
            String secondap = s.substring(s.indexOf("+")+1).trim();
            somma = Integer.parseInt(primap) + Integer.parseInt(secondap);
            System.out.println("La somma dei numeri inseriti e': " + somma);

        }
        else if(s.indexOf("-")!=-1){

            String primap = s.substring(0, s.indexOf("-")).trim();
            String secondap = s.substring(s.indexOf("-")+1).trim();
            differenza = Integer.parseInt(primap) - Integer.parseInt(secondap);
            System.out.println("La differenza dei numeri inseriti e': " + differenza);

        }
        else if(s.indexOf("*")!=-1){

            String primap = s.substring(0, s.indexOf("*")).trim();
            String secondap = s.substring(s.indexOf("*")+1).trim();
            moltiplicazione = Integer.parseInt(primap) * Integer.parseInt(secondap);
            System.out.println("Il prodotto dei numeri inseriti e': " + moltiplicazione);

        }
        else if(s.indexOf("/")!=-1){

            String primap = s.substring(0, s.indexOf("/")).trim();
            String secondap = s.substring(s.indexOf("/")+1).trim();

            if(Integer.parseInt(s.substring(s.indexOf("/")+1))!=0){

                divisione = Integer.parseInt(primap) / Integer.parseInt(secondap);;
                System.out.println("Il quoziente dei numeri inseriti e': " + divisione);

            }
            else if(Integer.parseInt(s.substring(0, s.indexOf("/")))==0 && Integer.parseInt(s.substring(s.indexOf("/")+1))==0){

                System.out.print("Quoziente indeterminato");

            }
            else{

                System.out.print("Quoziente impossibile, in quanto divisore = 0");

            }

        }
    
   }

    
}
