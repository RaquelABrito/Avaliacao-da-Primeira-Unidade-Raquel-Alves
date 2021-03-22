/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas.entidades;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Concursos
 */
public class Cliente {
    private String cpf;
    private String nome;
    private float saldo;
    private float valoresPagar;
    private List<Produto> produtos;
   // private String comprasRealizadas;

    public Cliente(String id, String n, float s, float vP){
        this.cpf = id;
        this.nome = n;
        this.saldo = 0.0f;
        this.valoresPagar = vP;
    }
    
    public String getCpf() {
        return this.cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
   
    /**
     *
     * @param obj
     * @return
     */
    @Override
public boolean equals(Object obj) {
if (obj instanceof Cliente) {
Cliente p = (Cliente) obj;
return this.cpf.equals(p.getCpf());
}
return false;
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    
    
}
