package Question03;

import java.util.ArrayList;

public class General implements QuestionsAnswers{
	public ArrayList<String> questions(){
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
	public ArrayList<String> answers(){
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
}