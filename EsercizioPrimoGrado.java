import java.util.Scanner;

public class EsercizioPrimoGrado{

    public static void main(String[] args) {

        Scanner inserimento= new Scanner(System.in);

        System.out.println("Inserisci primo a");
        int a = inserimento.nextInt();
        System.out.println("Inserisci secondo b");
        int b = inserimento.nextInt();
        float risultato=0;

        risultato=(float)-b/a;

        if(a==0){

            System.out.println("Equazione impossibile");

        }
        else if(a==0 && b==0 ){

            System.out.println("Equazione Indeterminata");

        }
        else if(a!=0){

            System.out.println("Soluzione:" + risultato);

        }

    }

}