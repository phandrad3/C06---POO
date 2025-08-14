public class Kart {
    // atributos
    String nome;
    Motor motor;
    Piloto piloto;

    // metodos
    void pular(){
        System.out.println("pum-pum");
    }

    void soltarTurbo(){
        System.out.println("tss-tss-tss");
    }

    void fazerDrift(){
        System.out.println("vruum, pruuu, chi-chi");
    }

    // construtor
    public Kart(){
        motor = new Motor();
    }

}
