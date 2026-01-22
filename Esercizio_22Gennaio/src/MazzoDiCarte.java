
public class MazzoDiCarte {

    private CartaDaGioco [] mazzo;
    private char [] semi = {'C', 'P', 'Q', 'F'};
    private char [] valori = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'};

    public MazzoDiCarte(){

        int p=0;
        this.mazzo = new CartaDaGioco[48];

        for(int i=0;i<semi.length;i++){

            for(int k=0;k<valori.length;k++){

                mazzo[p++]=new CartaDaGioco(semi[i],valori[k]);
                System.out.println(k + " " + i + " " + p);

            }

        }

    }
    public void mischia(){

        CartaDaGioco temp;


        for(int i=0; i<30; i++){

            int index=(int)(Math.random()*mazzo.length);
            int index2=(int)(Math.random()*mazzo.length);
            temp=mazzo[index];
            mazzo[index]=mazzo[index2];
            mazzo[index2]=temp;

        }

    }
    public void taglia(int n){

        CartaDaGioco [] temp = new CartaDaGioco[n];


        for(int k=0;k< temp.length;k++){

            temp[k]=mazzo[k];
        }
        for (int i = n; i < mazzo.length; i++) {

            mazzo[i - n] = mazzo[i];

        }

        for(int j=0; j< temp.length; j++){

            mazzo[mazzo.length-j-1]=temp[temp.length-j-1];

        }

    }
    public void visualizza(){


        for(int i=0;i<mazzo.length;i++){

            String s = ""+ mazzo[i].getValore();
            System.out.println("Carta["+i+"]" + ", Valore: " + s + ", Seme: " + mazzo[i].getSeme());

        }

    }


}
