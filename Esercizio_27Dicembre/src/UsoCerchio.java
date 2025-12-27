import java.util.Scanner;

public class UsoCerchio {

    public static void main(String[] args) {

        double r1, r2;
        Scanner lettura = new Scanner(System.in);

        System.out.println("Inserisci i raggi dei due cerchi:");
        r1 = lettura.nextDouble();
        r2 = lettura.nextDouble();

        Cerchio c1 = new Cerchio(r1);
        Cerchio c2 = new Cerchio(r2);

        System.out.println("Diametro del cerchio 1: " + c1.diametro());
        System.out.println("Diametro del cerchio 2: " + c2.diametro());
        System.out.println("Perimetro del cerchio 1: " + c1.perimetro());
        System.out.println("Perimetro del cerchio 2: " + c2.perimetro());
        System.out.println("Area del cerchio 1: " + c1.area());
        System.out.println("Area del cerchio 2: " + c2.area());

    }

}
