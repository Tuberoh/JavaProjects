import java.util.Scanner;

public class ProvaPunto {

    public static void main(String[] args) {

        Scanner lettura = new Scanner(System.in);
        int x, y, x1, y1;
        System.out.println("Inserire coordinata x del primo punto: ");
        x = lettura.nextInt();
        System.out.println("Inserire coordinata y del primo punto: ");
        y = lettura.nextInt();
        Punto p1 = new Punto(x,y);
        System.out.println("Inserire coordinata x del secondo punto: ");
        x1 = lettura.nextInt();
        System.out.println("Inserire coordinata y del secondo punto: ");
        y1 = lettura.nextInt();

        if(p1.equals(x1, y1)){

            System.out.println("I punti coincidono");

        }
        else{

            System.out.println("Distanza: " + p1.Distanza(x1, y1));

        }

        System.out.println(p1.tostring());





    }




}
