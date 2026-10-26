package financiera;

public class BonoTipo extends Bono{
    public BonoTipo(int cuit, int emision, String descripcion, double valor){
        this.cuit = cuit;
        this.emision = emision;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public double calcularRendimiento(){
        return this.calc.calcular(this);
    }
}
