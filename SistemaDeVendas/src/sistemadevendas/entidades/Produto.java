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
public class Produto {
    private int codigo;
    private String nome;
    private float precoUnitario;
    private int quantidadeEstoque;
   
    
    public int getCodigo() {
        return codigo;
    }

  
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    
    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
   
}
