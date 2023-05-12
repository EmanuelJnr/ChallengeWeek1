package Question03;

import java.util.ArrayList;

public class Anime implements QuestionsAnswers{
	public ArrayList<String> questions() {
		ArrayList<String> questions = new ArrayList<>();
		questions.add("Naruto Habita o espírito de qual Bijuu dentro de seu Corpo?");
		questions.add("Qual o nome do personagem principal de Yu-Yu Hakusho?");
		questions.add("Kempachi Zaraki é o capitão de que Divisão de guarda da corte no Anime?");
		questions.add("Light após perceber que o Detetive L o investigava, tentou descobrir sua verdadeira identidade para...");
		questions.add("Em Cavaleiros do Zodíaco, qual a armadura do Shiryu?");
		questions.add("Ao pegar todas as Esferas do Dragão é concedido a pessoa que as encontrou...");
		questions.add("Em Kakegurui, qual a aposta mais perigosa até agora?");
		questions.add("No anime Super Onze, o personagem Endo possui que posição no seu time?");
		questions.add("No anime Sword Art Online, Kirigaya e Asuna são no jogo e na vida social...");
		questions.add("Em Demon Slayer, quais respirações Tanjiro pode usar?");
		return questions;
	}
	public ArrayList<String> answers() {
		ArrayList<String> answers = new ArrayList<>();
		answers.add("kyuubi");
		answers.add("yusuke");
		answers.add("divisão 11 ou divisão onze");
		answers.add("matá-lo");
		answers.add("armadura do dragão");
		answers.add("um desejo ou 1 desejo");
		answers.add("apostar a própria vida");
		answers.add("goleiro");
		answers.add("namorados");
		answers.add("água e sol");
		return answers;
	}
}