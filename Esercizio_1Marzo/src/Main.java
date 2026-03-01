//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Automobile ciamioncino= new Automobile("Audi", 10, 200);
        ciamioncino.accellera();
        ciamioncino.avvia();
        ciamioncino.accellera();
        ciamioncino.accellera();
        ciamioncino.stampa();
        ciamioncino.decellera();
        ciamioncino.stampa();
        ciamioncino.spegni();
        ciamioncino.decellera();
        ciamioncino.stampa();


    }
}