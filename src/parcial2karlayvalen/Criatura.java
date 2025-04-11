
package parcial2karlayvalen;


public abstract class Criatura {
   
    protected String nombre;
    protected int salud;
    protected int fuerza;
    
    
    
        public Criatura (String nombre, int salud, int fuerza){
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    
    }
        
        public abstract void atacar (Criatura objetivo);
        public abstract void defender (int daño);
        
     
        
}

