
import com.mycompany.padraoprojetobuilderproduto.Produto;
import com.mycompany.padraoprojetobuilderproduto.ProdutoBuilder;

/*#11 CRIACIONAIS: BUILDER - MANHÃ: 05/12 NOITE: 09/12
 * Implementar Builder para classe Produto com algumas regras de negócio
 * Implemente uma classe Produto contendo uma Builder conforme indicações no final desta página.
 * https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/builder
 * Pode criar a classe Builder usando os recurso de refatoração do IDE.
 * O projeto deve ser disponibilizado no GitHub e o link fornecido no moodle.
 */
/**
 *
 * @author Lidiane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .id(0)
                .titulo("Celular")
                .descricao("É UM CELULAR")
                .marca("Xiaomi")
                .modelo("Pocophone")
                .categoria("Importados")
                .preco(2500)
                .estoque(10)
                .dataCadastro(null)
                .dataUltimaAtualizacao(null)
                .vendedor(null)
                .build();
                
        
        System.out.println(produto);
    }

}
