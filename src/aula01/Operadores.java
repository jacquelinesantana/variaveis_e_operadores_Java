package aula01;

public class Operadores {

	public static void main(String[] args) {
		//operadores matem�ticos
		//-subtra��o +adi��o *multiplica��o /divis�o %m�dulo
		int valor1 = 10, valor2 =5;
		
		//exemplo de calculo de adi��o feito por vari�veis
		int resultado = valor1 + valor2;
		System.out.println(resultado);
		
		//exemplo de subtra��o feito dos valores das vari�veis
		resultado = valor1 - valor2;
		System.out.println(resultado);
		
		//exemplo de multiplica��o feito dos valores das vari�veis
		resultado = valor1 * valor2;
		System.out.println(resultado);
		
		//exemplo de divis�o feito dos valores das vari�veis
		resultado = valor1 / valor2;
		System.out.println(resultado);
		
		int numero1 = 8;
		int numero2 = 2;
		//exemplo de m�dulo(resto de uma divis�o) feito dos valores das vari�veis
		resultado = numero1%numero2;
		System.out.println(resultado);
		
		
		String nome = "Madu";
		//concatenando strings com +
		String nomeCompleto = nome + " Vasconcelos";
		
		System.out.println(nomeCompleto);
		
		//criando prioridade em calculos, tudo que esta dentro dos parentes ser� calculado antes daquilo que esta fora
		resultado = (numero1+numero2)*3;
		System.out.println(resultado);
		
		System.out.println("**********************");
		System.out.println("Autoincremento");
		int x = 1;
		//x++; � igual a x = x +1; e tamb�m � igual a x+=1; para todos os casos estamos somando 1 ao valor inicial do x
		x = x +1;
		System.out.println("agora tem que ser 2 : "+x);
		
		x++;
		System.out.println("agora o x muda o valor novamente : "+x);//deve exibir 3 na tela
		
		
		
		//System.out.println(x++); // exibe na tela primeiro depois soma 1
		//System.out.println(x);
		//System.out.println(++x); // soma 1 e depois exibe na tela
		
		System.out.println("*******************");
		System.out.println("Decremento");
		int y = 5;
		//System.out.println(y--);
		System.out.println(--y); //aqui esta retirando 1 do valor inicial - deve exibir 4
		
		int n1 = 3;
		n1+=5; // atribu�mos a variavel n1 o valor dela + 5 deve exibir 8 na tela
		
		//n1 = n1 + 2;
		
		System.out.println(n1);
		
		String produto = "Mouse";
		produto += " gamer";
		//estamos aqui atribuindo e concatenando o valor da variavel - deve exibir Mouse gamer no console
		System.out.println(produto);
		
		System.out.println("****************");
		//operador subtrair e atribuir
		int ano = 2023;
		ano /=2; // subtra��o com atribui��o
		
		System.out.println(ano);
		
		//para ter um resultado com casa decimal todos os valores devem estar em vari�veis do tipo double ou float - podemos tbm converter um tipo de dado
		double preco = 1543;
		//resultado = preco/2;
		double resultado2 = preco/2;
		System.out.println(resultado2);
		
		
		
	}

}
