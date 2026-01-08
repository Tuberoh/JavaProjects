public class Punto {

    private int x, y;


    public Punto(int x, int y) {

        this.x = x;
        this.y = y;

    }
    double Distanza(Punto p){

        return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));

    }
    Boolean equals(Punto p){

        if(this.x == p.x && this.y == p.y){

            return true;

        }
        return false;

    }
    String tostring(){

        return "x:" + this.x + " y:" + this.y;

    }




}

