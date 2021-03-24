/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas.main;
import java.util.Scanner;
import sistemadevendas.entidades.Cliente;
import sistemadevendas.entidades.Vendedor;
/**
 *
 * @author Raquel
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
            Vendedor v1 = new Vendedor();
            Cliente c1 = new Cliente();
            Scanner menu = new Scanner (System.in);
            Scanner dados = new Scanner (System.in);
            
            while (true) {            

            System.out.print("##Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro Cliente  |\n");
            System.out.print("| Opção 2 - Listar Clientes |\n");
            System.out.print("| Opção 5 - Novo Cadastro  Funcionarios |\n");
            System.out.print("| Opção 6 - Listar Funcionarios |\n");
            System.out.print("| Opção 7 - Novo Cadastro Produto|\n");
            System.out.print("| Opção 8 - Estoque|\n");
            System.out.print("| Opção 9 - Realizar nova compra|\n");
            System.out.print("| Opção 10 - Deletar Cliente|\n");
            System.out.print("| Opção 11 - Deletar Funcionario|\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 4) {
                System.out.print("\nAté logo!");
                menu.close(); 
            }

            switch (opcao) {
            case 1:
                System.out.print("\nOpção Novo Cadastro de Cliente Selecionado \n");
                System.out.println("Cpf : ");
                String cpf = dados.nextLine();
                c1.setNome(cpf);
                System.out.println("Nome : ");
                String nome = dados.nextLine();
                c1.setNome(nome);
                System.out.println("Saldo em conta : ");
                float saldo = dados.nextFloat();
                c1.setNome(nome);
              
                System.out.println("Valores a pagar : ");
                float valoresPagar = dados.nextFloat();
                c1.setNome(nome);
                
                c1.adicionar(c1);
                break;

            case 2:
                System.out.print("\nOpção Listar Clientes Selecionada \n");
                c1.listar();
                break;

            case 5:
                System.out.print("\nOpção Cadastro de funcionarios selecionada\n");
           
                System.out.println("Cpnj : ");
                String cpnj = dados.nextLine();
                v1.setCpnj(cpnj);
                System.out.println("Nome : ");
                nome = dados.nextLine();
                v1.setNome(nome);
                System.out.println("Saldo inicial em conta : ");
                saldo = dados.nextFloat();
                v1.setSaldoConta(saldo);
                v1.adicionar(v1);
                break;
              
            case 6:
                System.out.print("\nOpção Listar Funcionarios Selecionada \n");
                v1.listar();
                break;  
                
           

            default:
                System.out.print("\nOpção Inválida!");
                break;
          }
      }
 
   }
}
