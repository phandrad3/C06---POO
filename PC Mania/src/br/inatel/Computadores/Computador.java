package br.inatel.Computadores;

public class Computador {
    // atributos
    private String marca;
    private double preco;
    private HardwareBasico hardwareBasico[];
    private MemoriaUSB memoriaUSB;
    private SistemaOperacional sistemaOperacional;

    // metodos
    public Computador(String marca, double preco, HardwareBasico[] hardwareBasico,
                      SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = hardwareBasico;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: "+marca);
        System.out.println("Preço: "+preco);
        System.out.println("Hardwares Básicos:");
        for(int i = 0; i < hardwareBasico.length; i++) {
            System.out.println(hardwareBasico[i].getNome());
        }
        System.out.println("Sistema Operacional: "+sistemaOperacional.getNome());
        if (memoriaUSB != null) {
            System.out.println("Mémoria externa: "+ memoriaUSB.getNome());
        }
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public HardwareBasico[] getHardwareBasico() {
        return hardwareBasico;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }
}
