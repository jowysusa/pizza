public class pizza {
    private String tamanyo;
    private String tipo;
    private String estado;

    public pizza(String tipo, String tamanyo) {
        this.tipo = tipo;
        this.tamanyo = tamanyo;
        this.estado = "pedida";
    }

    public void servirPizza() {
        if (estado.equals("pedida")) {
            estado = "servida";
            System.out.println("pizza servida ");
        } else {
            System.out.println("la pizza se sirvio");
        }
    }

    public void modificarTamanyo() {
        if (tamanyo.equals("mediana")) {
            tamanyo = "familiar";
        } else {
            tamanyo = "mediana";
        }
        System.out.println("el tamaño de la pizza es " + tamanyo);
    }

    public String toString() {
        return "tipo de pizza  " + tipo + " el tamaño de la pizza " + tamanyo + " el estado de la pizza es " + estado;
    }
}