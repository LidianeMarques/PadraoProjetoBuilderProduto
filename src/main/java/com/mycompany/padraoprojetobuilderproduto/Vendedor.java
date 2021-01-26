/*#11 CRIACIONAIS: BUILDER - MANHÃ: 05/12 NOITE: 09/12
 * Implementar Builder para classe Produto com algumas regras de negócio
 * Implemente uma classe Produto contendo uma Builder conforme indicações no final desta página.
 * https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/builder
 * Pode criar a classe Builder usando os recurso de refatoração do IDE.
 * O projeto deve ser disponibilizado no GitHub e o link fornecido no moodle.
 */
package com.mycompany.padraoprojetobuilderproduto;

/**
 *
 * @author Lidiane
 */
class Vendedor {
    private String nome;

    /**
     * @return the nome
     */
    protected String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    protected void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
