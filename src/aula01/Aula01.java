package aula01;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {		
		/*
		*aqui temos coment�rio de multiplas linhas
		*linha 2 de coment�rio
		 */
		//coment�rio de uma linha inicia com \\
		
		//vari�veis no java
		/*byte n1;
		n1 = 5;*/
		//vari�vel declarada com nome n1 e valor atribuido � 5
		byte n1 = 5;
		int valorTotal = 553;
		int endereco ;
		
		//sa�da do valor da vari�vel n1 no console
		System.out.println(n1);
		
		//alteramos o valor atribuido a variavel n1
		n1 = 6;
		
		//novo valor deve ser exibido no console
		System.out.println(n1);
		
		//variavel com dado do tipo real = float o valor atribuido deve ser informado com f no final
		float altura = 1.58787945465f;
		
		//variavel do tipo Long deve ter seu valor atribuido com a letra L no final
		Long codigo = 45784512l;
		
		//variavel do tipo booleano recebe os valores true(verdadeiro) ou false(falso)
		boolean aceitaProposta = true;
		
		//variavel do tipo char recebe apenas um caracter dentro de aspas simples
		char letra = 'a';
		
		//variavel do tipo inteiro recebe um valor numerico positivo ou negativo sem casa decimal
		int idade = 41;
		
		//variavel do tipo string recebe conjunto de caracteres = pode ser um texto ou uma frase...
		String nome = "Jacqueline";
		
		//concatenar conte�do de vari�veis com texto(String) 
		//\n � uma forma de pular linhas dentro de comandos de sa�da print
		System.out.print(nome + " tem " + idade+ " anos\n\n\n");
		
		//note que o print n�o pula linhas apenas exibe a informa��o
		System.out.print(altura);
		//print f formatando dado com casas decimais 
		System.out.printf("\nA altura �: %.2f", altura);
		
		//entrada de dados via teclado feita atrav�s da classe Scanner
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome:\n");
		nome = leia.nextLine();
		// toda vez que vamos receber um valor via teclado vamos chamar o leia, que � a propriedade que recebe o scanner
		//no cookbook vc ter� acesso a todos os m�todos que tratam os dados recebidos com o Scanner para os formatos de dados correspondentes 
		
		
		
		System.out.println("O nome do usu�rio �: "+ nome);
		
	}

}
