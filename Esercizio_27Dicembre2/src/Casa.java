public class Casa {

    private String nome;
    private Boolean fibra_ottica;
    private int num_stanze;
    private double metriQuadrati;

    public Casa(String nome){

        this.nome=nome;
        fibra_ottica=false;
        num_stanze=0;
        metriQuadrati=0;

    }
    public Casa(String nome, Boolean fibra_ottica, int num_stanze, double metriQuadrati){

        this.nome=nome;
        this.fibra_ottica=fibra_ottica;
        this.num_stanze=num_stanze;
        this.metriQuadrati=metriQuadrati;

    }
    public String getNome() {
        return nome;
    }

    public Boolean getFibra_ottica() {
        return fibra_ottica;
    }

    public int getNum_stanze() {
        return num_stanze;
    }

    public double getMetriQuadrati() {
        return metriQuadrati;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFibra_ottica(Boolean fibra_ottica) {
        this.fibra_ottica = fibra_ottica;
    }

    public void setNum_stanze(int num_stanze) {
        this.num_stanze = num_stanze;
    }

    public void setMetriQuadrati(double metriQuadrati) {
        this.metriQuadrati = metriQuadrati;
    }
    public double calcoloprezzo(){

        double prezzo = metriQuadrati*2000;

        if(fibra_ottica==true){

            return prezzo+prezzo*5/100;

        }
        return prezzo;
    }

}
