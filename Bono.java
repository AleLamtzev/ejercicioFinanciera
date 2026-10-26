package financiera;

import java.util.ArrayList;

public abstract class Bono {
    protected int cuit;
    protected Calculador calc;
    protected int emision;
    protected String descripcion;
    protected double valor;

    public abstract double calcularRendimiento();

    public void SetCalculador(Calculador calc){
        this.calc = calc;
    }

    public ArrayList<Bono> filtrar(Filtro filtro){
        ArrayList<Bono> salida = new ArrayList<>();
        if (filtro.filtrar(this)) {
            salida.add(this);
        }
        return salida;
    }

    public void setCalc(Calculador calc) {
        this.calc = calc;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCuit() {
        return cuit;
    }

    public int getEmision() {
        return emision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

}
