
package parcial2karlayvalen;

public class Mago extends Criatura {
    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = this.fuerza;
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        this.salud -= daño;
    }
}

