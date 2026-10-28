import java.util.Scanner;

public class SimuladorBancario {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double saldo = 1000.00;
        
        while(true){
        
            System.out.println("==========MENU==========");
            System.out.println("1 => Consultar saldo");
            System.out.println("2 => Depositar");
            System.out.println("3 => Sacar");
            System.out.println("0 => Sair");

            int opcao = sc.nextInt();

            if(opcao == 1){
                System.out.printf("Saldo atual: R$ %.2f%n", saldo);
            }

            else if(opcao == 2){
                System.out.println("Informe o valor que deseja depositar: ");
                double deposito = sc.nextDouble();

                if(deposito > 0){
                    saldo = saldo + deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                }
                else{
                    System.out.println("Depósito inválido!");
                }
            }
            else if(opcao == 3){
                System.out.println("Informe o valor que deseja sacar: ");
                double sacar = sc.nextDouble();

                if(sacar > 0 && sacar <= saldo){
                    saldo = saldo - sacar;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                }
                else{
                    System.out.println("Saque inválido!");
                }
            }
            else if(opcao == 0){
                System.out.println("Saindo do sistema...");
                break;
            }
            else{
                System.out.println("Opção inválida! Tente novamente!");
            }
        }
        sc.close();
    }
}
