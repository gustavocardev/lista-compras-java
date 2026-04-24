public class Compra implements Comparable<Compra> {
    private String descrisao;
    private double valor;

    public Compra(String descrisao, double valor) {
        this.descrisao = descrisao;
        this.valor = valor;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra descrisao = " + descrisao + "valor=" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
