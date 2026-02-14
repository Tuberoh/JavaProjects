import java.util.Scanner;


void main() {

    Autonoleggio [] lista = new Autonoleggio[5];
    Scanner lettura= new Scanner(System.in);
    Scanner let= new Scanner(System.in);
    String marca;
    double costokm;
    int numporte;

    for(int i=0; i< lista.length; i++){

        System.out.println("Inserisci marca");
        marca = lettura.nextLine();
        System.out.println("Inserisci numero di porte");
        numporte=let.nextInt();
        System.out.println("Inserisci costo al km");
        costokm=let.nextDouble();
        lista[i]=new Autonoleggio(costokm, numporte, marca);


    }

    int risp;

    do{

        System.out.println("1 Presito, 2 Restituzione, 3 Stampa");
        risp=let.nextInt();

    }while(risp<=0 || risp>3);

    if(risp==1){

        prestito(lista);

    }
    if(risp==2){

        restituzione(lista);

    }
    if(risp==3){

        stampa(lista);

    }

}
void prestito(Autonoleggio [] n){

    Scanner let= new Scanner(System.in);
    int r, h=0;
    System.out.println("1 <0.5, 2 Tra 0.5 e <1, 3 >=1 ");
    r=let.nextInt();

    Boolean u=false, t=false, y=false;

    if(r==1){

        u=true;

    }
    else if(r==2){

        t=true;

    }
    else{

        y=true;

    }
    for(int i=0; i<n.length; i++){

        if(n[i].getCostokm()<0.5 && u==true){

            n[i].setPresente(false);
            h=i;
            i=n.length;

        }
        if( (n[i].getCostokm()>0.5 && n[i].getCostokm()<1) && t==true){

            n[i].setPresente(false);
            h=i;
            i=n.length;

        }
        if(n[i].getCostokm()>=1 && y==true){

            n[i].setPresente(false);
            h=i;
            i=n.length;

        }

    }
    System.out.println("Marca: " + n[h].getMarca() + ",  numero di porte: " + n[h].getNum_porte() + ", Costo al km: " + n[h].getCostokm());

}
void restituzione(Autonoleggio [] lista){

    int h=0, km;
    Scanner let = new Scanner(System.in);
    System.out.println("Inserisci indice della macchina");
    h=let.nextInt();
    System.out.println("Inserisci chilometri percorsi");
    km = let.nextInt();
    System.out.println("Costo noleggio: " + lista[h].calcoloCosto(km));
    lista[h].setPresente(true);


}
void stampa(Autonoleggio [] n){

    for(int i=0; i<n.length; i++){

        System.out.println("["+ i + "]" + " " + "Marca: " + n[i].getMarca() + ", Numero di porte: " + n[i].getNum_porte() + ", Costo al km: " + n[i].getCostokm() + ", Presente: " + n[i].getPresente());

    }

}