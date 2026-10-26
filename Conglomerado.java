package financiera;

import java.util.ArrayList;

public class Conglomerado extends  Bono{
    private ArrayList<Bono> lista;
    private int cuit;
    public Conglomerado(int cuit){
        this.cuit = cuit;
        this.lista = new ArrayList<>();
    }

    public void agregarBono(Bono bono){
        if (bono.getCuit() == this.cuit) {
            lista.add(bono);
        }
    }

    public ArrayList<Bono>filtrar(Filtro filtro){
        ArrayList<Bono> salida = new ArrayList<>();
        for (Bono bono : lista) {
            salida.addAll(bono.filtrar(filtro));
        }
        return salida;
    }

    public double calcularRendimiento(){
        double suma = 0.0;
        for (Bono bono : lista) {
            suma += bono.calcularRendimiento();
        }
        return  suma;
    }

    public int getEmision(){
        int salida = 0;
        for (Bono bono : lista) {
            if (bono.getEmision() > salida) {
                salida = bono.getEmision();
            }
        }
        return salida;
    }
    public double getValor(){
        double suma = 0.0;
        for (Bono bono : lista) {
            suma += bono.getValor();
        }
        return suma;
    }
}
