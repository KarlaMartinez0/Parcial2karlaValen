
package parcial2karlayvalen;


public class Parcial2karlayValen {

 static void main(String[] args) {
        Criatura dragon = new Dragon("Dragón", 100, 20);
        Criatura mago = new Mago("Mago", 80, 15);
        Criatura guerrero = new Guerrero("Guerrero", 90, 18);

 
        dragon.atacar(mago);
        System.out.println(mago.nombre + " salud: " + mago.salud);
        
        mago.atacar(guerrero);
        System.out.println(guerrero.nombre + " salud: " + guerrero.salud);
        
        guerrero.atacar(dragon);
        System.out.println(dragon.nombre + " salud: " + dragon.salud);
    
    }
    
}
