package financiera;

import java.util.ArrayList;

import gijoe.Filtro;

public class Financiera {
    private ArrayList<Bono> lista;

    public Financiera(){
    this.lista = new ArrayList<>();
    }

    public void cargarBono(Bono bono){
        if (!lista.contains(bono)) {
         lista.add(bono);   
        }
    }

    public double calcularRendimiento(Bono bono){
        return bono.calcularRendimiento();
    }

    public ArrayList<Bono> filtrar(Filtro filtro){
        ArrayList<Bono> salida = new ArrayList<>();
        for (Bono bono : lista) {
            if (filtro.filtrar(bono)) {
                salida.addAll(bono.filtrar(filtro));
            }
        }
        return salida;
    }
}
