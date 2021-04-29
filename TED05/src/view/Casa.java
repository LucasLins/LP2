package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cachorro;

public class Casa {
	
	private static boolean sair;
	private static boolean sair2;
	private static Object escolha;
	private static Object[] botoesMain = {"Cadastrar cão", "Listar cães", "Sair do programa"};
	private static Object[] botoesCachorro = {"Ver dados do cão", "Alimentar", "Brincar", "Cruzar", "Menu inicial"};
	private static Object[] opcoesAlimentos = {"Ração", "Carne", "Legumes"};
	private static Object[] opcoesBrincar = {"Bolinha", "Saltar", "Girar"};
	static String mensagem = "";
	static ArrayList<Cachorro> listaCachorros = new ArrayList();
	static int idcachorro;
	static int idparceiro;

	public static void main(String[] args) {
		
		
		do {
			sair = false;
			escolha = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "TED05", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoesMain, botoesMain[0]);
			switch(escolha.toString()) {
				case "0":
					listaCachorros.add(new Cachorro(
							JOptionPane.showInputDialog("Digite o nome do cachorro:"),
							JOptionPane.showInputDialog("Digite a raça do cachorro:"),
							JOptionPane.showInputDialog("Digite o sexo do cachorro (M ou F):"),
							Integer.parseInt(JOptionPane.showInputDialog("Digite a idade cachorro:"))));
					JOptionPane.showMessageDialog(null, "Cachorro cadastrado com sucesso!");
					break;
					
				case "1":
					mensagem = "";
					for(int i = 0; i < listaCachorros.size(); i++) {
						mensagem += String.format("Cachorro %d:\n%s", i, listaCachorros.get(i).toString());
					}
					idcachorro = Integer.parseInt(JOptionPane.showInputDialog(mensagem+"\nDigite o número do cachorro que deseja selecionar:"));
					if(idcachorro >= 0 && idcachorro <= listaCachorros.size()) {
						manipularCachorro(listaCachorros.get(idcachorro), listaCachorros);
					}
					else {
						JOptionPane.showMessageDialog(null, "Cachorro escolhido não existe!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "2":
					sair = true;
					JOptionPane.showMessageDialog(null, "Até mais!");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Até mais!");
					sair = true;
					break;
			}
			
		}while(sair == false);
		
	}
	
	public static void manipularCachorro(Cachorro caoAtual, ArrayList<Cachorro> list){
		sair = false;
		
		do {
			escolha = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "TED05", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoesCachorro, botoesCachorro[0]);
			switch(escolha.toString()) {
				case "0":
					JOptionPane.showMessageDialog(null, caoAtual);
					break;
				
				case "1":
					if(caoAtual.getEnergia() <= 50) {
						escolha = JOptionPane.showInputDialog(null, "Qual comida deseja comer?", "Comer", JOptionPane.QUESTION_MESSAGE, null, opcoesAlimentos, opcoesAlimentos[0]);
						JOptionPane.showMessageDialog(null, String.format("O cachorro comeu e agora tem %d de energia!", caoAtual.comer(escolha.toString())));
					}
					else {
						JOptionPane.showMessageDialog(null, "O cachorro não está com fome!", "Alerta", JOptionPane.WARNING_MESSAGE);
					}
					break;
					
				case "2":
					if(caoAtual.getEnergia() >= 40) {
						escolha = JOptionPane.showInputDialog(null, "Do que deseja brincar?", "Brincar", JOptionPane.QUESTION_MESSAGE, null, opcoesBrincar, opcoesBrincar[0]);
						JOptionPane.showMessageDialog(null, String.format("O cachorro brincou e agora tem %d de energia!", caoAtual.brincar(escolha.toString())));
					}
					else {
						JOptionPane.showMessageDialog(null, "O cachorro está cansado e não pode brincar!", "Alerta", JOptionPane.WARNING_MESSAGE);
					}
					break;
					
				case "3":
					mensagem = "";
					for(int i = 0; i < listaCachorros.size(); i++) {
						if(caoAtual.podeCruzar(listaCachorros.get(i))) {
							mensagem += String.format("Cachorro %d:\n%s", i, listaCachorros.get(i).toString());
						}
					}
					idcachorro = Integer.parseInt(JOptionPane.showInputDialog(mensagem+"\nDigite o número do cachorro que deseja cruzar:"));
					
					if(idparceiro >= 0 && idparceiro <= listaCachorros.size() && idparceiro != idcachorro) {
						JOptionPane.showMessageDialog(null, String.format("O cachorro cruzou e gerou %d filhos!", caoAtual.cruzar(listaCachorros.get(idparceiro))));
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Cachorro escolhido não existe!", "Erro", JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "4":
					sair2 = true;
					break;
					
				default:
					sair2 = true;
					break;
			}
		
		
		}while(sair2 == false);
	}

}
