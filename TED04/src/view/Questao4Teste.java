package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.CestaItens;
import model.Cliente;
import model.Produto;

public class Questao4Teste {

	public static void main(String[] args) {
		int posicao = 0;
		int quantidade = 0;
		boolean sair = false;
		
		Produto tomate = new Produto("Tomate", 0.90, 50);
		Produto cebola = new Produto("Cebola", 0.70, 50);
		Produto cereal = new Produto("Cereal", 9.99, 20);
		Produto pizzacaixa = new Produto("Pizza de frango", 12.99, 10);
		Produto latamilho = new Produto("Lata de milho", 4.90, 10);
		
		ArrayList<CestaItens> carrinho = new ArrayList();
		
		Object[] listaProdutos = {tomate.getNome(), cebola.getNome(), cereal.getNome(), pizzacaixa.getNome(), latamilho.getNome()};
		Object[] botoesPrincipal = {"Adicionar item", "Finalizar compra", "Sair"};
		Object[] botoesCompra = {"Dinheiro", "Cheque", "Cartão", "Retornar"};
		
		Cliente cliente1 = new Cliente(JOptionPane.showInputDialog(null, "Digite o seu nome para montar seu carrinho de compras: ", "Entrar", JOptionPane.QUESTION_MESSAGE), carrinho, 0, 0);
	
		do {
			Object choice = JOptionPane.showOptionDialog(null, "Olá "+cliente1.getNome()+"\nItens no carrinho:\n"+cliente1.infoListaItens()+String.format("Total a pagar: %.2f R$ | ", cliente1.getValorPagar())+String.format("Quantidade de Itens: %d / 10", cliente1.getTotalItens()),"Questão 4", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoesPrincipal, botoesPrincipal[0]);
			
			switch(choice.toString()) {
				case "0":
					if(cliente1.getTotalItens() < 10) {
						choice = JOptionPane.showInputDialog(null, "Qual item deseja adicionar?", "Produtos", JOptionPane.QUESTION_MESSAGE, null, listaProdutos, listaProdutos[0]);
						if(choice.toString().equals(tomate.getNome())) {
							quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja comprar: ", "Produtos", JOptionPane.QUESTION_MESSAGE));
							if(cliente1.getTotalItens() + quantidade <= 10) {
								carrinho.add(posicao, new CestaItens(tomate, quantidade));
								posicao += 1;
								cliente1.updateValores(posicao - 1);
							}
						}
						else if(choice.toString().equals(cebola.getNome())) {
							quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja comprar: ", "Produtos", JOptionPane.QUESTION_MESSAGE));
							if(cliente1.getTotalItens() + quantidade <= 10) {
								carrinho.add(posicao, new CestaItens(cebola, quantidade));
								posicao += 1;
								cliente1.updateValores(posicao - 1);
							}
						}
						else if(choice.toString().equals(cereal.getNome())) {
							quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja comprar: ", "Produtos", JOptionPane.QUESTION_MESSAGE));
							if(cliente1.getTotalItens() + quantidade <= 10) {
								carrinho.add(posicao, new CestaItens(cereal, quantidade));
								posicao += 1;
								cliente1.updateValores(posicao - 1);
							}
						}
						else if(choice.toString().equals(pizzacaixa.getNome())) {
							quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja comprar: ", "Produtos", JOptionPane.QUESTION_MESSAGE));
							if(cliente1.getTotalItens() + quantidade <= 10) {
								carrinho.add(posicao, new CestaItens(pizzacaixa, quantidade));
								posicao += 1;
								cliente1.updateValores(posicao - 1);
							}
						}
						else if(choice.toString().equals(latamilho.getNome())) {
							quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade que deseja comprar: ", "Produtos", JOptionPane.QUESTION_MESSAGE));
							if(cliente1.getTotalItens() + quantidade <= 10) {
								carrinho.add(posicao, new CestaItens(latamilho, quantidade));
								posicao += 1;
								cliente1.updateValores(posicao - 1);
							}
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "O carrinho está cheio!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "1":
					choice = JOptionPane.showOptionDialog(null, String.format("Total a pagar: %.2f R$", cliente1.getValorPagar())+"\n Selecione a forma de pagamento:", "Finalizar compra", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoesCompra, botoesCompra[0]);
					if(choice.toString().equals("0")) {
						JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
						sair = true;
					}
					else if(choice.toString().equals("1")) {
						JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
						sair = true;
					}
					else if(choice.toString().equals("2")) {
						JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
						sair = true;
					}
					break;
				case "2":
					JOptionPane.showMessageDialog(null, "Até mais!");
					sair = true;
					break;
			}
		}while(sair == false);
		
	}

}
