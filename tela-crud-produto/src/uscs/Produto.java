/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author guilherme
 */
public class Produto {
    
    private int id;
    private String nome;
    private String referencia;
    private String marca;
    private String categoria;
    private double preco;
    
    public Produto() {
    }

    public Produto(int id, String nome, String referencia, String marca, String categoria, double preco) {
        this.id = id;
        this.nome = nome;
        this.referencia = referencia;
        this.marca = marca;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", referencia=" + referencia + ", marca=" + marca + ", categoria=" + categoria + ", preco=" + preco + '}';
    }
    
}
