public class Auto{

    private int num_porte;
    private String marca;

    public Auto(String marca, int num_porte){

        this.marca=marca;
        this.num_porte=num_porte;

    }
    public Auto(){

        this.marca= "";
        this.num_porte=0;

    }

    public int getNum_porte() {
        return num_porte;
    }

    public void setNum_porte(int num_porte) {
        this.num_porte = num_porte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
