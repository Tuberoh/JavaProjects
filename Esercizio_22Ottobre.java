import java.util.Scanner;


public class Esercizio_22Ottobre{

    Boolean trovato = false;
    public static void main(String[] args) {


       String [] vetnomi;
       String [] vetnumeri;
       vetnomi = new String[1000];
       vetnumeri = new String [1000];
       String nome, temp=null;
       int dim = 0;
       Scanner letturastringhe = new Scanner (System.in);
       Scanner letturanum = new Scanner(System.in);


       do{


           System.out.println("Quanti nomi vuoi inserire");
           dim = letturanum.nextInt();


       }while(dim<=0 || dim>1000);


       for (int i = 0; i < dim; i++) {

            do{

                System.out.println("Inserire nome");
                temp = letturastringhe.nextLine();

                if(Controllo_Omonimi(vetnomi, temp, dim)==true){

                    System.out.println("Nome già presente nella lista.");

                }


            }while(Controllo_Omonimi(vetnomi, temp, dim)==true);

            vetnomi[i] = temp;
            System.out.println("Inserisci numero di telefono:");
            vetnumeri[i] = letturastringhe.nextLine();


       }
       System.out.println("Inserisci nome da ricercare:");
       nome = letturastringhe.nextLine();
       if(Ricerca(vetnomi, vetnumeri, nome, dim)==null){

                System.out.println("Nessun nome trovato.");

       }
       else{

                System.out.println("Numero corrispondente " + Ricerca(vetnomi, vetnumeri, nome, dim));

       }


   }
   public static String Ricerca(String [] vetnomi, String []vetnumeri, String nome, int dim){


        Boolean trovato = false;
        for(int i=0; i<dim; i++){


            if(nome.equalsIgnoreCase(vetnomi[i])){

                trovato = true;
                return vetnumeri[i];

            }

        }

        return null;
          
    }

    public static Boolean Controllo_Omonimi(String [] vetnomi, String temp, int dim){

        for(int i=0; i<dim; i++){

            if(temp.equalsIgnoreCase(vetnomi[i])){

                return true;

            }

        }
        return false;

    }

}
