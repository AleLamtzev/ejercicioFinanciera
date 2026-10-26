package financiera;

import java.time.LocalDate;

public class BonoTemporal extends Bono {
    private LocalDate inicio ;
    private LocalDate fin;
    private Bono ref;
    private int cuit;
    private static int porcentaje = 50;
    // const
    public BonoTemporal (LocalDate inicio, LocalDate fin, Bono ref){
        this.inicio = inicio;
        this.fin = fin;
        this.ref = ref;
        this.cuit = ref.getCuit();
        this.emision = ref.getEmision();
    }

    //metodo
    public double calcularRendimiento(){
        LocalDate hoy = LocalDate.now();
        if (inicio.isBefore(hoy)&& fin.isAfter(hoy)) {
            return ref.calcularRendimiento();
        } else {
            return 0;
        }
    }

    public double getValor(){
        LocalDate hoy = LocalDate.now();
        if (inicio.isBefore(hoy)&& fin.isAfter(hoy)) {
            return ref.getValor();
        } else {
            return (ref.getValor()*porcentaje)/100;
        }
    }



    //get y set
    public LocalDate getInicio() {
        return inicio;
    }
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
    public LocalDate getFin() {
        return fin;
    }
    public void setFin(LocalDate fin) {
        this.fin = fin;
    }
    public static int getPorcentaje() {
        return porcentaje;
    }
    public static void setPorcentaje(int porcentaje) {
        BonoTemporal.porcentaje = porcentaje;
    }

    public int getCuit() {
        return cuit;
    }
    
    
}
