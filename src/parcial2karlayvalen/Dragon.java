
package parcial2karlayvalen;


public class Dragon extends Criatura {
    
    public Dragon (String nombre,int salud, int fuerza ){
         super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño =  objetivo.salud - this.fuerza;
        System.out.print("Daño causado al " + objetivo +" \nes de " + daño + "\n" );
    }

    @Override
    public void defender(int daño) {
       daño = this.salud + 5;
    
    }
}
