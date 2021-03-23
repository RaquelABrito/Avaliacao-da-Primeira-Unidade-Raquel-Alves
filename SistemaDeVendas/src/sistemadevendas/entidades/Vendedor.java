/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas.entidades;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Concursos
 */
public class Vendedor {
    private String nome;
    private String cpnj;
    private float saldoConta;
    private List<Produto> catalogo;
    List<Vendedor> listaVendedores = new ArrayList<>();
    
    public String getNome() {
        return this.nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpnj() {
        return this.cpnj;
    }

    
    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    
    public float getSaldoConta() {
        return this.saldoConta;
    }

   
    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    
     public void adicionar(Vendedor v) {
       listaVendedores.add(v);
    }
    
    public void listar() {
        for (Vendedor v : listaVendedores){
        System.out.println("__________________________________");
        System.out.println("Nome: "+v.getNome());
        System.out.println("Cpnj: "+v.getCpnj());
        System.out.println("Saldo em conta: "+v.getSaldoConta());
        System.out.println("__________________________________");
        }
    }
}
