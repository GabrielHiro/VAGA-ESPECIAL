package atv001;

import java.util.Scanner; //import do Scanner

public class ex001 {

	@SuppressWarnings("resource") //suprimir ou ignorar avisos do compilador 
	public static void main(String[] args) {
		// Novo Scanner: "ler"
		
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		
		int pergunta; //variavel para resposta da pergunta abaixo
		
		//Print principal
		
		System.out.print("\n Voc� � idoso, deficiente ou gestante? \n Digite (1)Sim (2)N�o  \n \n Digite aqui sua resposta:  ");
		pergunta = ler.nextInt(); //scanner da pergunta
		
		//if's
		
		if (pergunta == 1 ){
			System.out.print(" \n VOC� PODE ESTACIONAR NESTE LOCAL! "); // se a var. "pergunta = 1" um aviso ser� escrito no console.
		}
		else {
			System.out.print(" \n VOC� N�O PODE ESTACIONAR NO LOCAL! "); // se a var. "pergunta" for diferente de 1 acionara um aviso no console.
		}
}
}