public class CartaDaGioco {

    char seme;
    char valore;

    public CartaDaGioco(char seme, char valore) {

        if(seme == 'P' || seme == 'Q' || seme == 'C' || seme == 'F') {

            this.seme = seme;

        }else{

            this.seme=' ';

        }
        if((valore>='1' && valore<='9') || (valore=='Q' || valore=='J' || valore=='K')){

            this.valore=valore;

        }
        else{

            this.valore = '0';

        }

    }

    public char getValore() {

        return valore;

    }
    public String getSeme() {

        if(seme=='C'){

            return "cuori";

        }
        if(seme=='Q'){

            return "quadri";

        }
        if(seme=='P'){

            return "picche";

        }
        if(seme=='F'){

            return "fiori";

        }
        return null;

    }
    public String getColore(){

        if(seme=='C' || seme=='Q'){

            return "rosso";

        }
        if(seme=='P' || seme=='F'){

            return "nero";

        }
        return null;

    }

}
