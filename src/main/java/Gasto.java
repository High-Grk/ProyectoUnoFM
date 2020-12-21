public class Gasto {
    String gasto;
    int valor;
    boolean pagado;

    public Gasto(String gasto, int valor, boolean pagado) {
        this.gasto = gasto;
        this.valor = valor;
        this.pagado = pagado;
    }

    public int getValor() {
        return valor;
    }
}
