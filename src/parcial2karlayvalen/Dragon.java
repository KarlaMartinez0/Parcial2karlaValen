
package parcial2karlayvalen;


public class Dragon extends Criatura {
    
    public Dragon (String nombre,int salud, int fuerza ){
         super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = this.fuerza * 2;
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        this.salud -= daño;
    
    }
}
