package financiera;

public class FiltroDescrip extends Filtro{
    private String descripcion;

    public FiltroDescrip(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean filtrar(Bono bono){
        return bono.getDescripcion().contains(descripcion);
    }
}
