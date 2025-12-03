import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Orologio oraCucina = new Orologio(1, 10);
        Orologio oraCamera = new Orologio();
        Scanner lettura = new Scanner(System.in);
        int s1, s2;

        System.out.println("Orario della cucina: " + oraCucina.getOre() + ":" + oraCucina.getMinuti() + ":" + oraCucina.getSecondi());
        System.out.println("Orario della camera: " + oraCamera.getOre() + ":" + oraCamera.getMinuti() + ":" + oraCamera.getSecondi());

        System.out.println("Inserisci di quanti secondi vuoi incrementare gli orologi");

        do{

            System.out.println("Incremento secondi cucina: ");
            s1 = lettura.nextInt();
            System.out.println("Incremento secondi camera da letto: ");
            s2 = lettura.nextInt();
            if(s1<0 || s2 < 0){

                System.out.println("Inserire nuovamente. Secondi inferiori di 0 non accettati");

            }

        }while(s1<0 || s2 < 0);



        for(int i=0; i<s1; i++){

            oraCucina.AumentaSec();

        }
        for(int i=0; i<s2; i++){

            oraCamera.AumentaSec();

        }

        System.out.println("Orario della cucina: " + oraCucina.getOre() + ":" + oraCucina.getMinuti() + ":" + oraCucina.getSecondi());
        System.out.println("Orario della camera: " + oraCamera.getOre() + ":" + oraCamera.getMinuti() + ":" + oraCamera.getSecondi());


    }
}