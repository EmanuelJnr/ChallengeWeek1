package Question03;

import java.util.ArrayList;

public abstract class QuestionsAnswers {
	public static ArrayList<String> generalQuestions(){
		ArrayList<String> questions = new ArrayList<>();
		questions.add("Que imperador pôs fogo em Roma?");
		questions.add("Qual é o nome dado ao estado da água em forma de gelo?");
		questions.add("Quando é comemorado o dia da independência do Brasil?");
		questions.add("Quem é a namorada do Mickey?");
		questions.add("Qual é o personagem do folclore brasileiro que tem uma perna só?");
		questions.add("Quem foi o grande amor de Julieta?");
		questions.add("Quem proclamou a república no Brasil em 1889?");
		questions.add("Qual é a pedra preciosa mais dura encontrada na natureza?");
		questions.add("Qual personagem da turma da Mônica tem apenas cinco fios de cabelo?");
		questions.add("Quem fundou a Microsoft?");
		return questions;
	}
	public static ArrayList<String> animeQuestions(){
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
	public static ArrayList<String> generalAnswers(){
		ArrayList<String> answers = new ArrayList<>();
		answers.add("nero");
		answers.add("estado sólido");
		answers.add("7 de setembro ou sete de setembro");
		answers.add("minnie mouse");
		answers.add("saci pererê");
		answers.add("romeu");
		answers.add("marechal deodoro da fonseca");
		answers.add("diamante");
		answers.add("cebolinha");
		answers.add("bill gates");
		return answers;
	}
	public static ArrayList<String> animeAnswers(){
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