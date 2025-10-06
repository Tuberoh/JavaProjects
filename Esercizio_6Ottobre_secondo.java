import java.util.Scanner;

public class Esercizio_6Ottobre_secondo{

    public static void main(String[] args){

        int a=0, e=0, contai=0, o=0, u=0;
        Scanner lettura = new Scanner(System.in);

        String parola = lettura.nextLine();

        for(int i=0; i<parola.length(); i++){

            if(parola.charAt(i)=='a'){

                a++;

            }
            else if(parola.charAt(i)=='e'){

                e++;

            }
            else if(parola.charAt(i)=='i'){

                contai++;

            }
            else if(parola.charAt(i)=='o'){

                o++;

            }
            else if(parola.charAt(i)=='u'){

                u++;

            }



        }

        System.out.println("Ci sono " + a + " a");
        System.out.println("Ci sono " + e + " e");
        System.out.println("Ci sono " + contai + " i");
        System.out.println("Ci sono " + o + " o");
        System.out.println("Ci sono " + u + " u");


    }

}
    