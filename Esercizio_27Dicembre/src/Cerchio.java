public class Cerchio {

    private double r;

    public Cerchio(double r){

        this.r=r;

    }
    public double diametro(){

        return r*2;

    }
    public double perimetro(){

        return 2*r*3.14;

    }
    public double area(){

        return r*r*3.14;

    }



}
