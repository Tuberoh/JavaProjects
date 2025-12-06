import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lettura = new Scanner(System.in);
        int num50, num1, num2, tipo, num;
        System.out.println("Inserisci numero monete nel portafoglio: ");
        System.out.println("50 centesimi: ");
        num50 = lettura.nextInt();
        System.out.println("1 euro: ");
        num1 = lettura.nextInt();
        System.out.println("2 euro: ");
        num2 = lettura.nextInt();

        Portamonete nero = new Portamonete(num50, num1, num2);
        Portamonete marrone = new Portamonete();

        System.out.println("Nel primo portafoglio hai " + nero.getNum50() + " da 50 centesimi, " + nero.getNum1() + " da 1 euro e " + nero.getNum2() + " da 2 euro");
        System.out.println("Nel secondo portafoglio hai " + marrone.getNum50() + " da 50 centesimi, " + marrone.getNum1() + " da 1 euro e " + marrone.getNum2() + " da 2 euro");

        System.out.println("Wow, ti è arrivato lo stipendio. E' il momento di riempire il portamonte vuoto!");
        System.out.println("50 centesimi: ");
        num50 = lettura.nextInt();
        System.out.println("1 euro: ");
        num1 = lettura.nextInt();
        System.out.println("2 euro: ");
        num2 = lettura.nextInt();

        marrone.setNum50(num50);
        marrone.setNum1(num1);
        marrone.setNum2(num2);

        System.out.println("Sembra che hai trovato una moneta a terra. Scrivi il tipo e la quantità trovata (50, 1, 2)");
        tipo=lettura.nextInt();
        num= lettura.nextInt();
        nero.Inserisci(tipo, num);

        System.out.println("Nel primo portafoglio hai: " + nero.Totale() + " euro");
        System.out.println("Nel secondo portafoglio hai: " + marrone.Totale() + " euro");

        System.out.println("Nel dettaglio, nel primo hai: " + nero.StampaDettaglio());
        System.out.println("Nel dettaglio, nel secondo hai: " + marrone.StampaDettaglio());



    }
}