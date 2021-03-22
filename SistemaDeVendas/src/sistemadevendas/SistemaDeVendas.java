/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas;
import java.util.Scanner;
import sistemadevendas.entidades.Cliente;
/**
 *
 * @author Raquel
 */
public class SistemaDeVendas {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
            
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
                System.out.println("Nome : ");
                String cpf = dados.nextLine();
                c1.setNome(cpf);
                System.out.println("Nome : ");
                String nome = dados.nextLine();
                c1.setNome(nome);
                System.out.println("Nome : ");
                float saldo = dados.nextFloat();
                c1.setNome(nome);
                System.out.println("Nome : ");
                float valoresPagar = dados.nextFloat();
                c1.setNome(nome);
                
                c1.adicionar(c1);
                break;

            case 2:
                System.out.print("\nOpção Clientes Selecionado \n");
                c1.listar();
                break;

            case 3:
                System.out.print("\nOpção Produtos Selecionado \n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;
          }
      }
 
   }
}
