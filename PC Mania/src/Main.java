// Pedro Henrique de Paula Andrade - GES - 368
import br.inatel.Clientes.Cliente;
import br.inatel.Computadores.Computador;
import br.inatel.Computadores.HardwareBasico;
import br.inatel.Computadores.MemoriaUSB;
import br.inatel.Computadores.SistemaOperacional;
import br.inatel.Clientes.ProcessarPedido;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Ph", "123.456.789");

        MemoriaUSB memoria1 = new MemoriaUSB("Pen-Drive 16GB", 16);
        SistemaOperacional sistemaoperacional1 = new SistemaOperacional("macOS", 64);
        HardwareBasico hardware1[] = {
                new HardwareBasico("Pentium Core i3 (2200 Mhz)", 2200),
                new HardwareBasico("8 Gb de Memória RAM", 8),
                new HardwareBasico("500Gb de HD", 500)
        };
        Computador promocao1 = new Computador("Apple", 368, hardware1, sistemaoperacional1);
        promocao1.addMemoriaUSB(memoria1);

        MemoriaUSB memoria2 = new MemoriaUSB("Pen-Drive 32GB", 32);
        SistemaOperacional sistemaoperacional2 = new SistemaOperacional("Windows 8 (64 bits)", 64);
        HardwareBasico hardware2[] = {
                new HardwareBasico("Pentium Core i5 (3370 Mhz)", 3370),
                new HardwareBasico("16 Gb de Memória RAM", 16),
                new HardwareBasico("1Tb de HD", 1000)
        };
        Computador promocao2 = new Computador("Samsung", 368 + 1234, hardware2, sistemaoperacional2);
        promocao2.addMemoriaUSB(memoria2);

        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo 1Tb", 1000);
        SistemaOperacional sistemaoperacional3 = new SistemaOperacional("Windows 10 (64 bits)", 64);
        HardwareBasico hardware3[] = {
                new HardwareBasico("Pentium Core i7 (4500 Mhz)", 4500),
                new HardwareBasico("32 Gb de Memória RAM", 32),
                new HardwareBasico("2Tb de HD", 2000)
        };
        Computador promocao3 = new Computador("Dell", 368 + 5678, hardware3, sistemaoperacional3);
        promocao3.addMemoriaUSB(memoria3);

        int opcao;
        do {
            System.out.println("\n*------------------*");
            System.out.println("|                  |");
            System.out.println("|  PC MANIA STORE  |");
            System.out.println("|                  |");
            System.out.println("*------------------*");
            System.out.println("\nPROMOÇÕES DISPONÍVEIS:\n");

            System.out.println("*------------------*");
            System.out.println("|                  |");
            System.out.println("|   PROMOÇÃO 1     |");
            System.out.println("|                  |");
            System.out.println("*------------------*");
            promocao1.mostraPCConfigs();
            System.out.println();

            System.out.println("*------------------*");
            System.out.println("|                  |");
            System.out.println("|   PROMOÇÃO 2     |");
            System.out.println("|                  |");
            System.out.println("*------------------*");
            promocao2.mostraPCConfigs();
            System.out.println();

            System.out.println("*------------------*");
            System.out.println("|                  |");
            System.out.println("|   PROMOÇÃO 3     |");
            System.out.println("|                  |");
            System.out.println("*------------------*");
            promocao3.mostraPCConfigs();
            System.out.println();

            System.out.println("*------------------*");
            System.out.println("|                  |");
            System.out.println("|  1 - Apple       |");
            System.out.println("|  2 - Samsung     |");
            System.out.println("|  3 - Dell        |");
            System.out.println("|  0 - Finalizar   |");
            System.out.println("|                  |");
            System.out.println("*------------------*");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                Computador[] comps = cliente.getComputadores();
                int qtd = cliente.getQtdComputadores();
                if (qtd < comps.length) {
                    comps[qtd] = promocao1;
                    cliente.setQtdComputadores(qtd + 1);
                    System.out.println("\nComputador Apple adicionado ao carrinho!");
                } else {
                    System.out.println("\nLimite de computadores atingido!");
                }
            } else if (opcao == 2) {
                Computador[] comps = cliente.getComputadores();
                int qtd = cliente.getQtdComputadores();
                if (qtd < comps.length) {
                    comps[qtd] = promocao2;
                    cliente.setQtdComputadores(qtd + 1);
                    System.out.println("\nComputador Samsung adicionado ao carrinho!");
                } else {
                    System.out.println("\nLimite de computadores atingido!");
                }
            } else if (opcao == 3) {
                Computador[] comps = cliente.getComputadores();
                int qtd = cliente.getQtdComputadores();
                if (qtd < comps.length) {
                    comps[qtd] = promocao3;
                    cliente.setQtdComputadores(qtd + 1);
                    System.out.println("\nComputador Dell adicionado ao carrinho!");
                } else {
                    System.out.println("\nLimite de computadores atingido!");
                }
            } else if (opcao == 0) {
                if (cliente.getQtdComputadores() < 2) {
                    System.out.println("\n*------------------*");
                    System.out.println("|                  |");
                    System.out.println("|  ATENÇÃO!        |");
                    System.out.println("|  Você precisa     |");
                    System.out.println("|  comprar pelo     |");
                    System.out.println("|  menos 2 PCs!     |");
                    System.out.println("|                  |");
                    System.out.println("*------------------*");
                    opcao = -1;
                }
            } else {
                System.out.println("\n*------------------*");
                System.out.println("|                  |");
                System.out.println("|  Opção inválida! |");
                System.out.println("|                  |");
                System.out.println("*------------------*");
            }
        } while (opcao != 0);

        System.out.println("\n*------------------*");
        System.out.println("|                  |");
        System.out.println("|  RESUMO DA       |");
        System.out.println("|  COMPRA          |");
        System.out.println("|                  |");
        System.out.println("*------------------*");
        System.out.println("\nCliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("\nComputadores adquiridos:");

        Computador[] computadoresCliente = cliente.getComputadores();
        int qtdComputadores = cliente.getQtdComputadores();

        for (int i = 0; i < qtdComputadores; i++) {
            System.out.println("\n*------------------*");
            System.out.println("|                  |");
            System.out.println("|  COMPUTADOR " + (i + 1) + "     |");
            System.out.println("|                  |");
            System.out.println("*------------------*");
            computadoresCliente[i].mostraPCConfigs();
        }

        System.out.println("\n*------------------*");
        System.out.println("|                  |");
        System.out.println("|  TOTAL DA        |");
        System.out.println("|  COMPRA: R$ " + cliente.calculaTotalCompra() + " |");
        System.out.println("|                  |");
        System.out.println("*------------------*");

        System.out.println("\n*------------------*");
        System.out.println("|                  |");
        System.out.println("|  PROCESSANDO...  |");
        System.out.println("|                  |");
        System.out.println("*------------------*");
        ProcessarPedido.processar(computadoresCliente);

        scanner.close();
    }
}