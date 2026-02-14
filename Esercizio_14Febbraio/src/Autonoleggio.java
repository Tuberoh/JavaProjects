public class Autonoleggio extends Auto{

    private Boolean presente;
    private double costokm;

    public Autonoleggio(double costokm, int num_porte, String marca){

        super(marca, num_porte);
        this.costokm=costokm;
        presente=true;

    }

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public double getCostokm() {
        return costokm;
    }

    public void setCostokm(double costokm) {
        this.costokm = costokm;
    }
    public double calcoloCosto(double km){

        return costokm*km;

    }

}
