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
public class Cliente {
    private String cfp;
    private String nome;
    private float saldo;
    private float valoresPagar;
   // private String comprasRealizadas;

   
    public String getCfp() {
        return this.cfp;
    }

    
    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public String getNome() {
        return this.nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public float getSaldo() {
        return this.saldo;
    }

    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public float getValoresPagar() {
        return this.valoresPagar;
    }

   
    public void setValoresPagar(float valoresPagar) {
        this.valoresPagar = valoresPagar;
    }
   
    
    
}
