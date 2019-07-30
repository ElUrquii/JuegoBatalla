package batallin;

public class Juego { //clase que reemplaza lo que contenia el main
    
    private Dado d10;
    private Orco o;
    private Caballero c;

    public Juego() {
        d10 = new Dado(10);
        o = new Orco(d10, "Banana", 2000, 150, 0, 0, 0, 0);
        c = new Caballero(d10, "Frutilla", 900, 300, 0, 0, 0);
    }

    public Juego(Dado d10, Orco o, Caballero c) {
        this.d10 = d10;
        this.o = o;
        this.c = c;
    }

    public Dado getD10() {
        return d10;
    }

    public void setD10(Dado d10) {
        this.d10 = d10;
    }

    public Orco getO() {
        return o;
    }

    public void setO(Orco o) {
        this.o = o;
    }

    public Caballero getC() {
        return c;
    }

    public void setC(Caballero c) {
        this.c = c;
    }
    
    public void comenzarPartida() { //Metodo que contiene la logica del main
        System.out.println("Esta será una batalla legendaria!");
        System.out.println("Combaten " + c.getNombre() + " y " + o.getNombre() + ".");
        System.out.println("Si el dado es mayor que 5\n ataca el caballero sino el orco");
        while (c.estaSaludable() && o.estaSaludable()) {
            int tirada = d10.tirarDado();
            System.out.println("\nDado = " + tirada);
            if (tirada > 5) {
                c.atacar(o);
                System.out.println("Salud restante del orco = " + o.getSalud());
            } else {
                o.atacar(c);
                System.out.println("Salud restante del caballero = " + c.getSalud());
            }
        }

        if (!c.estaSaludable()) {
            System.out.println("\nEl orco ha vencido!");
            System.out.println(o.toString());
        } else { 
            System.out.println("\nEl caballero ha ganado!");
            System.out.println(c.toString());
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "d10=" + d10 + ", o=" + o + ", c=" + c + '}';
    }

}
