package oErickPegouNaDentaduraDeleComOsDedosNoMeioDaAula.caio;

import javax.swing.JOptionPane;

public class TesteProduto {

	public static void main(String[] args) {
		/*aqui estou criando um objeto do tipo produto
		 * e ele sechama produtinho*/
		
		Produto produtinho = new Produto();
		/*aqui estou preenchendo o campo nome do objetorodutinho
		 * com aquilo que o usuario digitar*/
//		produtinho.nome=JOptionPane.showInputDialog("Digite o nome do produto");
//		produtinho.preco=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o pre�o do produto"));
		
		
		/*abaixo estamos atribuindo os valos dos atributos da forma mais adequada
		 * que � utilizando m�todos*/
		produtinho.definirNome(JOptionPane.showInputDialog("Digite o nome do produto"));
		produtinho.definirPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do produto")));
		
		JOptionPane.showMessageDialog(null, "nome do produto: "+ produtinho.nome + "\ne o pre�o �: "+produtinho.preco);
	}

}
