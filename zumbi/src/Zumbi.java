public class Zumbi {

    // atributos
    double vida;
    String nome;

    // metodos

     double mostrarVida(){

        return vida;
    }

     void transferirVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

    boolean verificTransfVida(Zumbi zumbiAgressor, Zumbi zumbiCobaia){
         if(zumbiAgressor ==  zumbiCobaia){
             return false;
         }
         else{
             return true;
         }
    }
}
