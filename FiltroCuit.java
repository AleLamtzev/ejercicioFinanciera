package financiera;

public class FiltroCuit extends Filtro{
    private int cuit;

    public FiltroCuit(int cuit) {
        this.cuit = cuit;
    }
    public boolean filtrar(Bono bono){
        return bono.getCuit() == this.cuit;
    }
}
