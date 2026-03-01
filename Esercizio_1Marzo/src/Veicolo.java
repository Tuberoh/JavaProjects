public class Veicolo {

    private String marca;
    private int velocita;

    Veicolo(String marca, int velocita) {

        this.marca = marca;
        this.velocita = velocita;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }
    public void stampa(){

        System.out.println("Marca: " + this.marca + " Velocità: " + this.velocita);

    }



}
