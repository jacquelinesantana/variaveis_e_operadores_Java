package aula01;

public class Operadores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float = 1212132132.454 32bits calculos simples 
		//double = 45454121332154.45465 64bits calculos complexos
		
		int numero1 = 23;
		int numero2 = 45;
		int numero3 = 23;
		
		//comparando se o valor da variavel numero1 é menor que o valor da variavel numero2
		System.out.println(numero1< numero2); //23 < 45 deve exibir true na tela
		System.out.println(numero1>numero2+numero2); //23> 90 deve exibir false na tela
		System.out.println(numero1 == numero3); // 23 é igual a 23 - deve exibir true na tela
		System.out.println(numero1<=numero3); // 23 menor ou igual a 23 - deve exibir true na tela
		System.out.println(numero1>=numero2);//23 maior ou igual a 45 - deve exibir false na tela
		System.out.println(numero1!=numero3);//23 é diferente de 45 - deve exibir true na tela
		System.out.println(numero1!=numero2);//23 é diferente de 45 - deve retornar true na tela
		
		
		System.out.println("**************");
		
		System.out.println(!true);//negando o true teremos o retorno false
		System.out.println(!false);//negando o false teremos o retorno true
		
		boolean confirma1 = true;
		boolean confirma2 = false;
		boolean confirma3 = true;
		
		//operador && 
		System.out.println(confirma1 && confirma2);
		System.out.println(confirma1 && confirma3);
		
		int valorx = 7;
		int valory =10;
		
		//uso do E - preciso ter duas condições verdadeiras para um resultado true
		System.out.println(valorx !=valory && valorx<valory);
		System.out.println(valorx ==valory && valorx<valory);
		
		//uso do OU - com apenas uma condição verdadeira o resultado é true
		System.out.println("Falso x verdadeiro: "+(valorx ==valory ||  valorx<valory));
		System.out.println(valorx==valory || valorx>valory);
		
	}

}
