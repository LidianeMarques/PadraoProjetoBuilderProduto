package com.mycompany.padraoprojetobuilderproduto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * {@code ProdutoBuilder} collects parameters and invokes the static factory method:
 * {@code new com.mycompany.padraoprojetobuilderproduto.Produto(..)}.
 * Call the {@link #build()} method to get a result of type {@code com.mycompany.padraoprojetobuilderproduto.Produto}.
 * <p><em>{@code ProdutoBuilder} is not thread-safe and generally should not be stored in a field or collection,
 * but instead used immediately to create instances.</em>
 */
@Generated(from = "com.mycompany.padraoprojetobuilderproduto.Produto", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ProdutoBuilder {
  private static final long INIT_BIT_ID = 0x1L;
  private static final long INIT_BIT_TITULO = 0x2L;
  private static final long INIT_BIT_DESCRICAO = 0x4L;
  private static final long INIT_BIT_MARCA = 0x8L;
  private static final long INIT_BIT_MODELO = 0x10L;
  private static final long INIT_BIT_CATEGORIA = 0x20L;
  private static final long INIT_BIT_ESTOQUE = 0x40L;
  private static final long INIT_BIT_PRECO = 0x80L;
  private static final long INIT_BIT_DATA_CADASTRO = 0x100L;
  private static final long INIT_BIT_DATA_ULTIMA_ATUALIZACAO = 0x200L;
  private static final long INIT_BIT_VENDEDOR = 0x400L;
  private long initBits = 0x7ffL;

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

  /**
   * Creates a {@code ProdutoBuilder} factory builder.
   * <pre>
   * new ProdutoBuilder()
   *    .id(long) // required {@code id}
   *    .titulo(String) // required {@code titulo}
   *    .descricao(String) // required {@code descricao}
   *    .marca(String) // required {@code marca}
   *    .modelo(String) // required {@code modelo}
   *    .categoria(String) // required {@code categoria}
   *    .estoque(int) // required {@code estoque}
   *    .preco(double) // required {@code preco}
   *    .dataCadastro(java.time.LocalDate) // required {@code dataCadastro}
   *    .dataUltimaAtualizacao(java.time.LocalDate) // required {@code dataUltimaAtualizacao}
   *    .vendedor(com.mycompany.padraoprojetobuilderproduto.Vendedor) // required {@code vendedor}
   *    .build();
   * </pre>
   */
  public ProdutoBuilder() {
  }

  /**
   * Initializes the value for the {@code id} attribute.
   * @param id The value for id 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder id(long id) {
    this.id = id;
    initBits &= ~INIT_BIT_ID;
    return this;
  }

  /**
   * Initializes the value for the {@code titulo} attribute.
   * @param titulo The value for titulo 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder titulo(String titulo) {
    this.titulo = Objects.requireNonNull(titulo, "titulo");
    initBits &= ~INIT_BIT_TITULO;
    return this;
  }

  /**
   * Initializes the value for the {@code descricao} attribute.
   * @param descricao The value for descricao 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder descricao(String descricao) {
    this.descricao = Objects.requireNonNull(descricao, "descricao");
    initBits &= ~INIT_BIT_DESCRICAO;
    return this;
  }

  /**
   * Initializes the value for the {@code marca} attribute.
   * @param marca The value for marca 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder marca(String marca) {
    this.marca = Objects.requireNonNull(marca, "marca");
    initBits &= ~INIT_BIT_MARCA;
    return this;
  }

  /**
   * Initializes the value for the {@code modelo} attribute.
   * @param modelo The value for modelo 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder modelo(String modelo) {
    this.modelo = Objects.requireNonNull(modelo, "modelo");
    initBits &= ~INIT_BIT_MODELO;
    return this;
  }

  /**
   * Initializes the value for the {@code categoria} attribute.
   * @param categoria The value for categoria 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder categoria(String categoria) {
    this.categoria = Objects.requireNonNull(categoria, "categoria");
    initBits &= ~INIT_BIT_CATEGORIA;
    return this;
  }

  /**
   * Initializes the value for the {@code estoque} attribute.
   * @param estoque The value for estoque 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder estoque(int estoque) {
    this.estoque = estoque;
    initBits &= ~INIT_BIT_ESTOQUE;
    return this;
  }

  /**
   * Initializes the value for the {@code preco} attribute.
   * @param preco The value for preco 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder preco(double preco) {
    this.preco = preco;
    initBits &= ~INIT_BIT_PRECO;
    return this;
  }

  /**
   * Initializes the value for the {@code dataCadastro} attribute.
   * @param dataCadastro The value for dataCadastro 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
    this.dataCadastro = Objects.requireNonNull(dataCadastro, "dataCadastro");
    initBits &= ~INIT_BIT_DATA_CADASTRO;
    return this;
  }

  /**
   * Initializes the value for the {@code dataUltimaAtualizacao} attribute.
   * @param dataUltimaAtualizacao The value for dataUltimaAtualizacao 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = Objects.requireNonNull(dataUltimaAtualizacao, "dataUltimaAtualizacao");
    initBits &= ~INIT_BIT_DATA_ULTIMA_ATUALIZACAO;
    return this;
  }

  /**
   * Initializes the value for the {@code vendedor} attribute.
   * @param vendedor The value for vendedor 
   * @return {@code this} builder for use in a chained invocation
   */
  public final ProdutoBuilder vendedor(Vendedor vendedor) {
    this.vendedor = Objects.requireNonNull(vendedor, "vendedor");
    initBits &= ~INIT_BIT_VENDEDOR;
    return this;
  }

  /**
   * Invokes {@code new com.mycompany.padraoprojetobuilderproduto.Produto(..)} using the collected parameters and returns the result of the invocation
   * @return A result of type {@code com.mycompany.padraoprojetobuilderproduto.Produto}
   * @throws java.lang.IllegalStateException if any required attributes are missing
   */
  public Produto build() {
    checkRequiredAttributes();
    return new Produto(id,
        titulo,
        descricao,
        marca,
        modelo,
        categoria,
        estoque,
        preco,
        dataCadastro,
        dataUltimaAtualizacao,
        vendedor);
  }

  private boolean idIsSet() {
    return (initBits & INIT_BIT_ID) == 0;
  }

  private boolean tituloIsSet() {
    return (initBits & INIT_BIT_TITULO) == 0;
  }

  private boolean descricaoIsSet() {
    return (initBits & INIT_BIT_DESCRICAO) == 0;
  }

  private boolean marcaIsSet() {
    return (initBits & INIT_BIT_MARCA) == 0;
  }

  private boolean modeloIsSet() {
    return (initBits & INIT_BIT_MODELO) == 0;
  }

  private boolean categoriaIsSet() {
    return (initBits & INIT_BIT_CATEGORIA) == 0;
  }

  private boolean estoqueIsSet() {
    return (initBits & INIT_BIT_ESTOQUE) == 0;
  }

  private boolean precoIsSet() {
    return (initBits & INIT_BIT_PRECO) == 0;
  }

  private boolean dataCadastroIsSet() {
    return (initBits & INIT_BIT_DATA_CADASTRO) == 0;
  }

  private boolean dataUltimaAtualizacaoIsSet() {
    return (initBits & INIT_BIT_DATA_ULTIMA_ATUALIZACAO) == 0;
  }

  private boolean vendedorIsSet() {
    return (initBits & INIT_BIT_VENDEDOR) == 0;
  }

  private void checkRequiredAttributes() {
    if (initBits != 0) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = new ArrayList<>();
    if (!idIsSet()) attributes.add("id");
    if (!tituloIsSet()) attributes.add("titulo");
    if (!descricaoIsSet()) attributes.add("descricao");
    if (!marcaIsSet()) attributes.add("marca");
    if (!modeloIsSet()) attributes.add("modelo");
    if (!categoriaIsSet()) attributes.add("categoria");
    if (!estoqueIsSet()) attributes.add("estoque");
    if (!precoIsSet()) attributes.add("preco");
    if (!dataCadastroIsSet()) attributes.add("dataCadastro");
    if (!dataUltimaAtualizacaoIsSet()) attributes.add("dataUltimaAtualizacao");
    if (!vendedorIsSet()) attributes.add("vendedor");
    return "Cannot build Produto, some of required attributes are not set " + attributes;
  }
}
