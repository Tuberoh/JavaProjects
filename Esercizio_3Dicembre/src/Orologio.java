public class Orologio {

    private int ore;
    private int minuti;
    private int secondi;

    public Orologio(int ore, int minuti){

        this.ore = ore;
        this.minuti = minuti;
        this.secondi = 0;

    }
    public Orologio(){

        this.ore = 0;
        this.minuti = 0;
        this.secondi = 0;

    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public void setSecondi(int secondi) {

        this.secondi = secondi;

    }

    public void AumentaSec(){

        if(minuti<=59 && secondi<59){

            secondi++;

        }
        else if(secondi==59 && minuti<59){

            minuti++;
            secondi = 0;

        }
        else if (ore==23 && minuti==59 && secondi==59){

            ore=0;
            minuti=0;
            secondi=0;

        }
        else if(minuti == 59 && secondi==59){

            ore++;
            minuti=0;
            secondi=0;

        }


    }


}
