//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MazzoDiCarte m =  new MazzoDiCarte();
        m.visualizza();
        System.out.println("Mischiato:");
        m.mischia();
        m.visualizza();
        m.taglia(5);
        System.out.println("Tagliato:");
        m.visualizza();

    }
}