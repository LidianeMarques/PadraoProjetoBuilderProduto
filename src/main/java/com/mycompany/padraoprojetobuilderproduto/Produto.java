/*#11 CRIACIONAIS: BUILDER - MANHÃ: 05/12 NOITE: 09/12
 * Implementar Builder para classe Produto com algumas regras de negócio
 * Implemente uma classe Produto contendo uma Builder conforme indicações no final desta página.
 * https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/builder
 * Pode criar a classe Builder usando os recurso de refatoração do IDE.
 * O projeto deve ser disponibilizado no GitHub e o link fornecido no moodle.
 */
package com.mycompany.padraoprojetobuilderproduto;

import java.time.LocalDate;
import org.immutables.builder.Builder;

/**
 *
 * @author Lidiane
 */
public class Produto {

    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private String categoria;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private Vendedor vendedor;

    @Builder.Constructor
    Produto(long id, String titulo, String descricao, String marca, String modelo, String categoria, int estoque, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, Vendedor vendedor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", marca=" + marca + ", modelo=" + modelo + ", categoria=" + categoria + ", estoque=" + estoque + ", preco=" + preco + ", dataCadastro=" + dataCadastro + ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", vendedor=" + vendedor + '}';
    }

    /**
     * @return the id
     */
    protected long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    protected void setId(long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    protected String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    protected String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    protected String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    protected void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    protected String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the categoria
     */
    protected String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    protected void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the estoque
     */
    protected int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    protected void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the preco
     */
    protected double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    protected void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the dataCadastro
     */
    protected LocalDate getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    protected void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the dataUltimaAtualizacao
     */
    protected LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * @param dataUltimaAtualizacao the dataUltimaAtualizacao to set
     */
    protected void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    /**
     * @return the vendedor
     */
    protected Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    protected void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}
