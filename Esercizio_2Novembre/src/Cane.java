public class Cane {

    private String nome;
    private int eta;
    private String colore;
    private String razza;

    public Cane(String nome, String razza, String colore, int eta) {
        this.nome = nome;
        this.razza = razza;
        this.colore = colore;
        this.eta = eta;
    }


    public String getNome() {
        return nome;
    }
    public int getEta(){
        return eta;
    }
    public String getColore() {
        return colore;
    }
    public String getRazza() {
        return razza;
    }
    public String Pulizia(){

        String risposta = "Il tuo cane è pulito";
        return risposta;

    }

}
