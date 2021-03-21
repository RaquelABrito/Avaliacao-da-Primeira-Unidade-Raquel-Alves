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

    /**
     * @return the cfp
     */
    public String getCfp() {
        return cfp;
    }

    /**
     * @param cfp the cfp to set
     */
    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the valoresPagar
     */
    public float getValoresPagar() {
        return valoresPagar;
    }

    /**
     * @param valoresPagar the valoresPagar to set
     */
    public void setValoresPagar(float valoresPagar) {
        this.valoresPagar = valoresPagar;
    }
    private String cfp;
    private String nome;
    private float saldo;
    private float valoresPagar;
   // private String comprasRealizadas;
    
    
}
