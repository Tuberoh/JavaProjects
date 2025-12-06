public class Portamonete {

    private int num50, num1, num2;

    public Portamonete(){

        this.num50=0;
        this.num1=0;
        this.num2=0;

    }
    public Portamonete(int num50, int num1, int num2){

        this.num50=num50;
        this.num1=num1;
        this.num2=num2;

    }

    public int getNum50() {
        return num50;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum50(int num50) {
        this.num50 = num50;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void Inserisci(int tipo, int num){

        if(tipo==50){

            num50+=num;

        }
        if(tipo==1){

            num1+=num;

        }
        if(tipo==2){

            num2+=num;

        }


    }
    public double Totale(){

        return 2*num2+num1+0.5*num50;

    }
    public String StampaDettaglio(){

        return "Monete 2 euro: " + num2 + ", Monete 1 euro: " + num1 + ", Monete 50 centesimi: " + num50;


    }




}
