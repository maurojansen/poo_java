/*
Classe....: caixaEletronico: instancia a classe Conta e simula um caixa eletrônico com deposito e saque
Criação...: 14/12/2018 - prof.Mauro e Turma DesSistemas
Alterações: 

Possível melhoria: mostrar sempre o saldo na tela ao perguntar se quer depositar ou sacar.
*/
package estudoJava;
import java.util.Scanner;

public class caixaEletronico {
	public static void main(String[] args) {
		Conta c;
		c=new Conta();
		Scanner ler=new Scanner(System.in);
		int opcao;
		double valor;
		// pedir os dados da conta
		System.out.println("CAIXA ELETRONICO");
		System.out.print("Digite o numero da conta:");
		c.numero=ler.nextInt();
		System.out.print("Digite o seu nome:");
		c.nome_titular=ler.next();
		// repetir
		do {
			//pedir opção (1=depositar, 2=sacar, 0=sair)
			System.out.print("Digite a opção (1=depositar, 2=sacar, 0=sair):");
			opcao=ler.nextInt();
			if(opcao!=0) {
				System.out.print("Digite o valor:");
				valor=ler.nextFloat();
				//conforme a opção, depositar ou scar
				if(opcao==1) {
					c.depositar(valor);
					System.out.println("Depósito efetuado!");
				}
				else if(opcao==2) {
					if(c.sacar(valor))
						System.out.println("Saque efetuado");
					else
						System.out.println("Saldo insuficiente");
				}
			}
		} while(opcao!=0);	
		System.out.println("FIM.... TCHAU!");
	}
}
