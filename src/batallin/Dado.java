package batallin;

public class Dado {

    private int cantidadDeLados;

    public Dado(int cantidadDeLados) {
        this.cantidadDeLados = cantidadDeLados;
    }

    public int getCantidadDeLados() {
        return cantidadDeLados;
    }

    public void setCantidadDeLados(int cantidadDeLados) {
        this.cantidadDeLados = cantidadDeLados;
    }
    
    int tirarDado() {
        return (int) (Math.random() * cantidadDeLados) + 1;
    }
}
