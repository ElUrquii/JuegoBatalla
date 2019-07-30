package batallin;

public class Caballero extends Personaje{ //clase Caballero que hereda a la clase Personaje
    
    protected boolean sang;

    public Caballero(Dado dado, String nombre, int salud, int ataque, int defensa, int xp, int daño) {
        super(dado, nombre, salud, ataque, defensa, xp, daño);
    }

    public boolean isSang() {
        return sang;
    }

    public void setSang(boolean sang) {
        this.sang = sang;
    }
    
    //polimorfismo
    
    public void atacar(Orco o) {
        super.atacar(); //To change body of generated methods, choose Tools | Templates.
        int critico = dado.tirarDado();
        
        if (critico > 5 && critico < 10) { //Habilidades especiales del caballero
            System.out.println("Habilidad especial, robo de vida");
            salud += daño;
            System.out.println(nombre + " recupero " + daño + " de vida");
        } else if (critico == 10) {
            System.out.println("Habilidad especial, Ataque definitivo.\nRealiza 5 veces mas daño de un golpe, se cura toda la vida");
            salud = salud + (2000 - salud);
            daño = daño * 5;           
        }        
        o.recibirDaño(this.getDaño());
        xp += 10;
    }  

    @Override
    public void recibirDaño(int daño) {
        super.recibirDaño(daño); //To change body of generated methods, choose Tools | Templates.
        
    }
}
