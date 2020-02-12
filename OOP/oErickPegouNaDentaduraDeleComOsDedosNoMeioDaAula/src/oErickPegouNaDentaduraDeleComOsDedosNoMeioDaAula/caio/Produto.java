package oErickPegouNaDentaduraDeleComOsDedosNoMeioDaAula.caio;
//isso � uma classe
//as classes servem para representar a ideia de algo
//nesse caso a ideia do que � o nosso produto
public class Produto {
	/*abaixo temos os atributos
	 * eles indicam tudo o que a classe � capaz de armazenar*/
	Integer id;
	String nome;
	String tamanho;
	Double preco;
	
	/*abaixo temos os metodos
	 * eles sao as acoes que a classe pode realizar
	 * podemos comparar metodos com funcoes*/
	
	public void definirNome(String nome) {
		this.nome=nome;
	}
	
	public void definirPreco(Double preco) {
		if (preco<0) {
			this.preco=preco*-1;
		}
		else {
			this.preco=preco;
		}
	}
}
