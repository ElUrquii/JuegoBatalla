package batallin;

public class Orco extends Personaje{ //clase Orco que hereda a la clase Personaje
    
    protected int sangrado;
    protected boolean sang;
    
    public Orco(Dado dado, String nombre, int salud, int ataque, int defensa, int xp, int daño, int sangrado) {
        super(dado, nombre, salud, ataque, defensa, xp, daño);
        this.sangrado = sangrado;
    }

    public int getSangrado() {
        return sangrado;
    }

    public void setSangrado(int sangrado) {
        this.sangrado = sangrado;
    }

    public boolean isSang() {
        return sang;
    }

    public void setSang(boolean sang) {
        this.sang = sang;
    }
//polimorfismo
    @Override
    public void recibirDaño(int daño) {
        super.recibirDaño(daño); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void atacar(Caballero c) { //Habilidades especiales del orco
        super.atacar(); //To change body of generated methods, choose Tools | Templates.
        int crit = dado.tirarDado();
        
        if (crit >= 6 && crit < 10) {
            System.out.println("Habilidad especial, sangrado");
            sangrado = 3;
            while (sangrado <= 3 && sangrado > 0) {
                c.recibirSangrado(50);
                sangrado -= 1;
            }
        } else if (crit == 10) {
            System.out.println("Habilidad especial, quemadura.\nQuita el 75% de la vida restante.");
            daño = (60 * c.salud) / 100;              
        }
        c.recibirDaño(this.getDaño());  
        xp += 10;
    }
        @Override
    public void recibirSangrado(int daño) {
        super.recibirSangrado(daño); //To change body of generated methods, choose Tools | Templates.
    }

    
}
