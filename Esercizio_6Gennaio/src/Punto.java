public class Punto {

    private int x, y;


    public Punto(int x, int y) {

        this.x = x;
        this.y = y;

    }
    double Distanza(int x, int y){

        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));

    }
    Boolean equals(int x, int y){

        if(this.x == x && this.y == y){

            return true;

        }
        return false;

    }
    String tostring(){

        return "x:" + this.x + " y:" + this.y;

    }




}
