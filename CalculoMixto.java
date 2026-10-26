package financiera;

public class CalculoMixto extends Calculador{
    private Calculador calc1;
    private Calculador calc2;
    public CalculoMixto(Calculador calc1, Calculador calc2) {
        this.calc1 = calc1;
        this.calc2 = calc2;
    }
    
    public double calcular(Bono bono){
        return calc1.calcular(bono) + calc2.calcular(bono);
    }
}
