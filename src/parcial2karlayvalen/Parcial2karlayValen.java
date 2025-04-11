
package parcial2karlayvalen;


public class Parcial2karlayValen {

 public static void main(String[] args) {
     
        Criatura dragon = new Dragon("Dragón", 100, 20);
        Criatura mago = new Mago("Mago", 150, 60);
        Criatura guerrero = new Guerrero("Guerrero", 90, 38);

 
         dragon.atacar(mago);
         mago.atacar(guerrero);
         guerrero.atacar(dragon);
 
    }
    
}
