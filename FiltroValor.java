package financiera;

public class FiltroValor extends Filtro{
    private double valor;

    public FiltroValor(double valor) {
        this.valor = valor;
    }
    public boolean filtrar(Bono bono){
        return bono.getValor() > this.valor;
    }
}
