/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas.entidades;

/**
 *
 * @author Concursos
 */
public class Vendedor {
    private String nome;
    private String cpnj;
    private float saldoConta;

    
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
    
}
