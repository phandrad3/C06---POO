public class Cantina {

    // atributos
    String nome;
    Salgado [] salgado = new Salgado[5];

    // metodos

    void addSalgado(Salgado novoSalgado){
        boolean verifica = false;
        for (int i = 0; i<salgado.length; i++){
            if(salgado[i] == null){
                salgado[i] = novoSalgado;
                verifica = true;
                break;
            }
        }
        if(!verifica){
            System.out.println("Número máximo de salgados atingido");
        }


    }

    void mostraInfo(){
        System.out.println("Salgados cadastrados:");
        for(int i = 0; i<salgado.length; i++){
            if(salgado[i] != null){
                System.out.println(salgado[i].nome);
            }
        }
    }
}
