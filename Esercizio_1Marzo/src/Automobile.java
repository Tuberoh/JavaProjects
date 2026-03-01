public class Automobile extends Veicolo{

    private Boolean inmoto;
    private int velomax;

    public Automobile(String marca, int velocita, int velomax) {

        super(marca, velocita);
        this.velomax = velomax;
        inmoto = false;

    }
    public void avvia(){

        if(inmoto){

            System.out.println("La macchina è già in moto");

        }
        else{

            inmoto = true;

        }

    }
    public void spegni(){

        if(!inmoto){

            System.out.println("La macchina è già spenta");

        }
        else{

            inmoto = false;

        }

    }
    public void accellera(){


        if(!inmoto){

            System.out.println("La macchina è spenta");

        }
        else if(this.getVelocita()+10>velomax){

            this.setVelocita(velomax);

        }
        else{

            this.setVelocita(this.getVelocita()+10);

        }

    }
    public void decellera(){


        if(!inmoto){

            System.out.println("La macchina è spenta");

        }
        else if(this.getVelocita()-10<0){

            this.setVelocita(0);
            System.out.println("La macchina è ferma");

        }
        else{

            this.setVelocita(this.getVelocita()-10);

        }

    }
    @Override
    public void stampa(){

        System.out.println("Marca: " + this.getMarca() + ", Velocità: " + this.getVelocita() + ", in Moto: " + this.inmoto);

    }


}
