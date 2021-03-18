/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas;
import java.util.Scanner;
/**
 *
 * @author Raquel
 */
public class SistemaDeVendas {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

            Scanner menu = new Scanner (System.in);

            while (true) {            

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro     |\n");
            System.out.print("| Opção 2 - Clientes          |\n");
            System.out.print("| Opção 3 - Produtos          |\n");
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
                System.out.print("\nOpção Novo Cadastro Selecionado");
                break;

            case 2:
                System.out.print("\nOpção Clientes Selecionado\n");
                break;

            case 3:
                System.out.print("\nOpção Produtos Selecionado\n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;
          }
      }
 
   }
}
