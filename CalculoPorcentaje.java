package financiera;

public class CalculoPorcentaje extends Calculador {
    private int porcentaje;

    public CalculoPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public double calcular(Bono bono){
        return (bono.getValor()*porcentaje)/100;
    }

    
}
