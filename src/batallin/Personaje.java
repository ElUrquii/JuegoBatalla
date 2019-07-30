package batallin;

public class Personaje { //Clase padre de Caballero y Orco 
    
    protected Dado dado;
    protected String nombre;
    protected int salud;
    protected int ataque;
    protected int defensa;
    protected int xp;
    protected int daño;

    public Personaje(Dado dado, String nombre, int salud, int ataque, int defensa, int xp, int daño) {
        this.dado = dado;
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.xp = xp;
        this.daño = daño;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    public boolean estaSaludable() {
        return salud > 0;
    }
    
    public void recibirDaño(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño de ataque");
    }
    
    public void recibirSangrado(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de sangrado");
    }
    
    
    public void atacar() {
        System.out.println(nombre + " ataca!");
        this.daño = ataque;
    }
    
    @Override
    public String toString() {
        return nombre + ", tiene " + xp + " puntos de experiencia.";
    }
    
}
