package financiera;

public class CalculoFijo extends Calculador{
    private double fijo;
    public CalculoFijo(double fijo){
        this.fijo = fijo;
    }
    public double calcular(Bono bono){
        return this.fijo;
    }
}
